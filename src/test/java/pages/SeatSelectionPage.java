package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class SeatSelectionPage extends BasePage {
    TouchAction cont_button = new TouchAction(driver);

    @FindBy(className = "android.widget.FrameLayout")
    private MobileElement selectseatview;
    public SeatSelectionPage(AndroidDriver driver) {
        super(driver);
      //  PageFactory.initElements(driverClass, this);
    }


    public void user_on_seatSelectionpage_selected_seat_number(int seatno) throws Throwable {
        //waitForElementToBevisible(selectseatview);
        driver.findElement(By.xpath("//android.widget.TextView[contains(text()" + seatno + "]")).click();
    }

    public void use_on_seatSelectionpage_taps_on_continue() throws Throwable {
        cont_button.tap(1182, 2276).perform();


    }

    }

