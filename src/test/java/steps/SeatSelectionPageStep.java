package steps;

import cucumber.api.java.en.And;
import driverClass.DriverClass;
import pages.SeatSelectionPage;

public class SeatSelectionPageStep extends DriverClass {
    SeatSelectionPage seatSelectionPage = new SeatSelectionPage(driver);

    @And("^user on seatSelectionpage selected seat number (\\d+)$")
    public void user_on_seatSelectionpage_selected_seat_number(int seatno) throws Throwable {
        seatSelectionPage.user_on_seatSelectionpage_selected_seat_number(seatno);
    }
    @And("^user on seatSelectionpage taps on continue$")
    public void use_on_seatSelectionpage_taps_on_continue() throws Throwable {
        seatSelectionPage.use_on_seatSelectionpage_taps_on_continue();
    }
}