package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

public class RadioButtonPage extends HelperBase
{
    @Value("${txtInput}")
    public String txtInput;

    @Value("${txtRadioBtn}")
    public String txtRadioBtn;

    @Value("${rdobtnGender}")
    public String rdobtnGender;

    @Value("${btnGetCheckedValue}")
    public String btnGetCheckedValue;

    @Value("${rdoSexBtn}")
    public String  rdoSexBtn;

    @Value("${rdoAgeBtn}")
    public String rdoAgeBtn;

    @Value("${getValueBtn}")
    public String getValueBtn;



    public void radiopageData()
    {
        try {
            clickOn(txtInput, "Input Forms");
            clickOn(txtRadioBtn, "Radio Button Link");
            jsClick(rdobtnGender, "select Gender");
            jsClick(btnGetCheckedValue, "Get Checked Value");
            jsClick(rdoSexBtn, "Sex radio Button");
            jsClick(rdoAgeBtn, "Age Group");
            clickOn(getValueBtn, "Get Values");
        }catch (NoSuchElementException e) {
            e.printStackTrace();

        }

    }



}
