package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

public class AjaxFormPage extends HelperBase{

    @Value("${txtInput}")
    public String txtInput;

    @Value("${txtAjaxFormLnk}")
    public String txtAjaxFormLnk;

    @Value("${txtName}")
    public String txtName;

    @Value("${txtComment}")
    public String txtComment;

    @Value("${submitBtn}")
    public String   submitBtn;




    public void ajaxDataForm()
    {
        try{
            clickOn(txtInput,"Input Form Link");
            clickOn(txtAjaxFormLnk,"Ajax Form Link");
            entertext(txtName,"Sushmitha","Name");
            entertext(txtComment,"Selenium Easy Application","Comment");
            jsClick(submitBtn,"Submit");




        }catch (
                NoSuchElementException e) {
            e.printStackTrace();

        }

    }


}
