package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Value;

import static appmanager.ExtentCucumberFormatter.testStepInfo;

public class DropdownPage extends HelperBase {
    @Value("${weLocation}")
    public String weLocation;

    @Value("${selHotels}")
    public String selHotels;

    @Value("${selRoomtype}")
    public String selRoomtype;

    @Value("${selNumofRooms}")
    public String selNumofRooms;

    @Value("${txtCheckInDate}")
    public String txtCheckInDate;


    @Value("${txtCheckoutDate}")
    public String txtCheckoutDate;

    @Value("${selAdultRoom}")
    public String selAdultRoom;

    @Value("${selChildRoom}")
    public String selChildRoom;

    @Value("${txtSearch}")
    public String txtSearch;

    @Value("${selRadiobtn}")
    public String selRadiobtn;

    @Value("${txtContinue}")
    public String txtContinue;



    public void enterValidDataIntoAllTheFields() {
        try {
            sleep(1000);
            selectFromDropdown(weLocation, "Melbourne", "Location");
            selectFromDropdown(selHotels,"Hotel Sunshine","Hotels");
            selectFromDropdown(selRoomtype,"Deluxe","Room Type");
            selectFromDropdown(selNumofRooms,"4 - Four","Number of Rooms");
            enterText(txtCheckInDate,"20/09/2021","CheckInDate");
            enterText(txtCheckoutDate,"25/09/2021","CheckoutDate");
            selectFromDropdown(selAdultRoom,"4 - Four","Adult per Room");
            selectFromDropdown(selChildRoom,"4 - Four","Child per Room");
            jsClick(txtSearch,"Search");
            jsClick(selRadiobtn,"RadioButton");
            jsClick(txtContinue,"Continue");



           // WebElement we= getWebElement(weLocation);


            testStepInfo("passsed");

        } catch (NoSuchElementException e) {
            e.printStackTrace();


        }
    }
}

