package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

public class DropDownListPage extends HelperBase
{
    @Value("${txtInput}")
    public String txtInput;

    @Value("${txtDropDownlnk}")
    public String txtDropDownlnk;

    @Value("${selDay}")
    public String selDay;

    @Value("${selCountry}")
    public String selCountry;

    @Value("${firstSelectedBtn}")
    public String firstSelectedBtn;


    public void dropDownPageData()
    {
        try{
            clickOn(txtInput,"Input Form Link");
            clickOn(txtDropDownlnk,"Drop Down List Page Link");
            selectFromDropdown(selDay,"Friday","Select a Day");
            clickOn(selCountry,"Select Country");
            jsClick(firstSelectedBtn,"First Selected");





        }  catch (
                NoSuchElementException e) {
            e.printStackTrace();

        }

}


}
