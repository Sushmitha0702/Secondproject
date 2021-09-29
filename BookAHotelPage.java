package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

public class BookAHotelPage extends HelperBase
{
    @Value("${txtFName}")
    public String txtFName;

    @Value("${txtLName}")
    public String txtLName;

    @Value("${txtAddress}")
    public String txtAddress;

    @Value("${txtCCNum}")
    public String txtCCNum;


    @Value("${selCCtype}")
    public String selCCtype;

    @Value("${selExpireMonth}")
    public String selExpireMonth;

    @Value("${selExpireYear}")
    public String selExpireYear;

    @Value("${txtCvvNum}")
    public String txtCvvNum;

    @Value("${txtBooknow}")
    public String txtBooknow;


    public void enterAllFields()
    {
        try{
            entertext(txtFName,"Sushma","First Name");
            entertext(txtLName,"S","Last Name");
            entertext(txtAddress,"Ramanagara","Billing Address");
            entertext(txtCCNum,"8754492390532256","Credit Card Number");
            selectFromDropdown(selCCtype,"VISA","Credit Card Type");
            selectFromDropdown(selExpireMonth,"August","Card Expire month");
            selectFromDropdown(selExpireYear,"2022","Card Expire Year");
            entertext(txtCvvNum,"788","Cvv Number");
            clickOn(txtBooknow,"Book Now");

        }catch (NoSuchElementException e) {
            e.printStackTrace();
        }

    }

}

