package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

public class InputFromSubmitPage extends HelperBase
{

    @Value("${txtInput}")
    public String txtInput;

    @Value("${txtInputsubmitBtn}")
    public String txtInputsubmitBtn;

    @Value("${txtFName}")
    public String txtFName;

    @Value("${txtLName}")
    public String txtLName;

    @Value("${txtEmail}")
    public String txtEmail;

    @Value("${txtPhoneNum}")
    public String txtPhoneNum;

    @Value("${txtAddress}")
    public String txtAddress;

    @Value("${txtCity}")
    public String txtCity;

    @Value("${txtZipCode}")
    public String txtZipCode;

    @Value("${txtstate}")
    public String txtstate;

    @Value("${txtWebSite}")
    public String txtWebSite;

    @Value("${rdoHost}")
public String  rdoHost;

    @Value("${txtProjectDescription}")
    public String  txtProjectDescription;

    @Value("${sendBtn}")
    public String    sendBtn;



    public void inputSubmitData()
    {
        try{
          clickOn(txtInput,"Input Forms");
          clickOn(txtInputsubmitBtn,"Input Submit");
          entertext(txtFName,"Sushmitha","First Name");
            entertext(txtLName,"Sush","Last Name");
            entertext(txtEmail,"sushmithas@suntechnologies.com","Email");
            entertext(txtPhoneNum,"8975733555","Phone Number");
            entertext(txtAddress,"Ramanagara","Address");
            entertext(txtCity,"Ramanagara","City Name");
            selectFromDropdown(txtstate,"Texas","Select State");
            entertext(txtZipCode,"77494","Zip Code");
            entertext(txtWebSite,"https;//www.seleniumeasyapplication.com","WebSite Name");
            clickOn(rdoHost,"Do you Have Host?");
            entertext(txtProjectDescription,"Selenium Easy Application","Project Description");
            jsClick(sendBtn,"Send Button");

        }catch (
                NoSuchElementException e) {
            e.printStackTrace();
        }
    }




}
