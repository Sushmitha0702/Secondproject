package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

public class CheckBoxdemoPage extends HelperBase
{
    @Value("${txtInput}")
    public String txtInput;

    @Value("${txtCheckDemo}")
    public String txtCheckDemo;

    @Value("${checkBox}")
    public String checkBox;

    @Value("${clickAllCheckBtn}")
    public String clickAllCheckBtn;

    @Value("${clkChkBox1}")
    public String clkChkBox1;

    @Value("${clkChkBox2}")
    public String clkChkBox2;


    public void enterAllXCheckBoxFields()
    {
        try{
            clickOn(txtInput,"Input Forms");
            clickOn(txtCheckDemo,"Check demo Link");
           // clickOnCheckBox(checkBox,"N","Click on this check box");
            jsClick(checkBox,"Check Box");
            jsClick(clickAllCheckBtn,"Check All");
            jsClick(clkChkBox1,"Check Box1");
            jsClick(clkChkBox2,"Check Box2");

        }catch (NoSuchElementException e) {
            e.printStackTrace();

        }
    }

}
