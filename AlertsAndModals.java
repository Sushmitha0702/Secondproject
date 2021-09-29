package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

public class AlertsAndModals extends HelperBase
{

    @Value("${drdwnalertsAndModals}")
    public String drdwnalertsAndModals;

//    @Value("${listOfautosgst}")
//    public String listOfautosgst;
//
//    @Value("${playoffsLnk}")
//    public String playoffsLnk;
//
//    @Value("${clickAllCheckBtn}")
//    public String clickAllCheckBtn;
//
//    @Value("${clkChkBox1}")
//    public String clkChkBox1;
//
//    @Value("${clkChkBox2}")
//    public String clkChkBox2;

    public void selEasyDropDown()
    {
        try {
            jsClick(drdwnalertsAndModals,"AlertsAndModals");
//            selectFromDropdown(drdwnalertsAndModals,"1","Progress Bar Modal Link");
            selectFromDropdown(drdwnalertsAndModals,3,"Progress Bar Modal Link");



        }catch (NoSuchElementException e) {
            e.printStackTrace();

        }
    }



}
