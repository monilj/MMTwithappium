package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class BusSearchPage extends BasePage {

    @FindBy(id = "com.makemytrip:id/gps_intro_button")
    private MobileElement gpsPopup;
    @FindBys({@FindBy(className = "android.widget.RelativeLayout")})
    List<MobileElement> selectbus;


    public BusSearchPage(AndroidDriver driver) {
        super(driver);
   //     PageFactory.initElements(driverClass, this);

    }

    public void user_on_busSearch_page_select_first_bus() throws Throwable {
        try {
            //waitForElementToBevisible(gpsPopup);
            gpsPopup.click();
        } catch (Exception e) {
            System.out.println("Pop not present");
        }
      //  waitForElementToBevisible(selectbus.get(0));
        selectbus.get(0).click();

    }
}