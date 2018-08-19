package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TripDetailPage extends BasePage {
    @FindBy(id = "com.makemytrip:id/bus_dept_city_name")
    private MobileElement bus_dept_city;

    @FindBy(id = "com.makemytrip:id/city_edit_text")
    private MobileElement sendcityname;

    @FindBy(xpath = "//android.widget.TextView[@index=‘1’]")
    private MobileElement selectfirstoption;

    @FindBy(id = "com.makemytrip:id/bus_arrival_city_name")
    private MobileElement bus_arr_city;

    @FindBy(id="com.makemytrip:id/calOK")
    private MobileElement calOK;

    @FindBy(id = "com.makemytrip:id/bus_search_button")
    private MobileElement searchbutton;
    public TripDetailPage(AndroidDriver driver) {
        super(driver);
      //  PageFactory.initElements(driverClass, this);
    }
    public void user_on_tripDetail_page_taps_on_From()
    {
        bus_dept_city.click();
    }
    public void user_on_tripDetail_page_types_on_enterdeptartureCityName_value(String dept_city) throws Throwable {
        sendcityname.sendKeys(dept_city);
    }
    public void user_on_tripDetail_page_select_first_option_from_city() throws Throwable {
        selectfirstoption.click();
    }
    public void user_on_tripDetail_page_taps_on_To() throws Throwable {
        bus_arr_city.click();
    }
    public void user_on_tripDetail_page_types_on_enterarrivalCityName_value(String arr_city) throws Throwable {
        sendcityname.sendKeys(arr_city);
    }
    //This method will execute again
//    public void user_on_tripDetail_page_select_first_option_from_city() throws Throwable {
//        selectfirstoption.click();
//    }
    public void user_on_tripDetail_page_taps_on_Departure_date() throws Throwable {
        sendcityname.click();
    }
    public void user_on_tripDetail_page_select_from_calender(int date,String month) throws Throwable {
      WebElement day = driver.findElement(By.xpath("//android.widget.TextView[contains(text()"+month+"]/android.widget.CheckedTextView[contains(text()"+date+")]"));
            day.click();

    }
    public void user_on_tripDetail_page_taps_on_OK()throws Throwable{
        calOK.click();
    }
    public void user_on_tripDetail_page_taps_on_SearchButton() throws Throwable{
        searchbutton.click();
    }


}
