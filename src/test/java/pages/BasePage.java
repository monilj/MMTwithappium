package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

   AndroidDriver<MobileElement> driver;
    private WebDriverWait wait;


    public BasePage(AndroidDriver driver ) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }
       void waitForElementToBevisible(MobileElement mobileElement) {
        wait.until(ExpectedConditions.visibilityOf(mobileElement));

    }

    }



