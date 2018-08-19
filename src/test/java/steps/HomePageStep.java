package steps;

import cucumber.api.java.en.Given;
import driverClass.DriverClass;
import pages.HomePage;


public class HomePageStep extends DriverClass {
    HomePage homePage = new HomePage(driver);


    @Given("^user on home screen taps on bus$")
    public void user_on_home_screen_taps_on_bus() throws Throwable {

        homePage.user_on_home_screen_taps_on_bus();
    }

}
