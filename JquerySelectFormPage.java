package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

public class JquerySelectFormPage extends HelperBase
{
    @Value("${txtInput}")
    public String txtInput;

    @Value("${jqueryLnk}")
    public String jqueryLnk;

    @Value("${selCntry}")
    public String selCntry;

    @Value("${selState}")
    public String selState;

    @Value("${selterritories}")
    public String selterritories;


    @Value("${selFile}")
    public String selFile;





    public void jqueryData()
    {
        try{
            clickOn(txtInput,"Input Form Link");
            clickOn(jqueryLnk,"JQuery Select dropDown link");
            selectFromDropdown(selCntry,"India","Select Country");
            selectFromDropdown(selState,"Texas","Select State");
            selectFromDropdown(selState,"Washington","Select State");
            selectFromDropdown(selterritories,"Virgin Islands","select US Territories");
            selectFromDropdown(selFile,"Java","Select File");







        }catch (NoSuchElementException e) {
            e.printStackTrace();

        }
    }

}
