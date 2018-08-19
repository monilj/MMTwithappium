package driverClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverClass {
    public   static AndroidDriver<AndroidElement> driver;
    public   static AppiumDriverLocalService service = null;

    public DriverClass()  {
        initialize();
    }

    public AndroidDriver initialize() {
        if(null == driver) {
            File appDir = new File("app");
            File app = new File(appDir, "MakeMyTrip.apk");
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
            cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
            cap.setCapability("appPackage", "com.makemytrip");
            cap.setCapability("appActivity", "com.mmt.travel.app.homepage.activity.OnBoardingActivity");
             try
            {
                driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            }

            catch(MalformedURLException e) {
                e.printStackTrace();
            }
           // driverClass.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }


    public AndroidDriver getAndoridDriver()
    {
        return driver;

    }

    public void destroyDriver() {
        driver.quit();
        driver = null;

    }

}
