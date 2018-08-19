package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(id = "com.makemytrip:id/skip_onboarding")
    private MobileElement skip_onHome;

    @FindBy(id = "com.android.launcher3:id/search_drop_target_bar")
    private MobileElement targettoapp;

    @FindBy(xpath = "//android.widget.TextView[@text=‘Bus’]")
    private MobileElement text_bus;


    public HomePage(AndroidDriver driver) {
        super(driver);
       // PageFactory.initElements(driverClass, this);
    }


    public void user_on_home_screen_taps_on_bus() throws InterruptedException{
        // WebDriverWait wait = new WebDriverWait(driverClass,10);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.makemytrip:id/skip_onboarding")));
//        waitForElementToBevisible(skip_onHome);
        skip_onHome.click();
        Thread.sleep(2000);
        targettoapp.click();
        Thread.sleep(2000);
        text_bus.click();
    }


}
