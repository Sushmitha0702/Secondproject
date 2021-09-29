package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

public class BookedItineraryPage extends HelperBase
{
    @Value("${txtMyItinerary}")
    public String txtMyItinerary;

    @Value("${txtSearchBtn}")
    public String txtSearchBtn;

    @Value("${btnGo}")
    public String btnGo;

    @Value("${checkBox}")
    public String checkBox;

    @Value("${txtSearchHotel}")
    public String txtSearchHotel;


    public void bookHotel()
    {
        try{
            jsClick(txtMyItinerary,"My Itinerary Button");
            entertext(txtSearchBtn,"72KYV2C47E","Search Id");
            jsClick(btnGo,"Go");

            clickOnCheckBox(checkBox,"N","CheckBox");
            jsClick(txtSearchHotel,"Search Hotel");

        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
        }



    }


}
