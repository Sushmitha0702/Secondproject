package pages;

import appmanager.ApplicationManager;
import appmanager.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Value;

public class DribblePage extends HelperBase
{


    @Value("${inspirationLnk}")
    public String inspirationLnk;

    @Value("${playoffsLnk}")
    public String playoffsLnk;

    @Value("${webAppLnk}")
  public String webAppLnk;

    @Value("${hireUsLnk}")
    public String hireUsLnk;

    @Value("${txtMsg}")
    public String txtMsg;
//
//    @Value("${clkChkBox2}")
//    public String clkChkBox2;

    public void dribbleDropDown()
    {
        try {
//            Actions action=new Actions(driver);
//            action.moveToElement(driver.findElement(By.linkText(inspirationLnk))).build().perform();
//            driver.findElement(By.xpath("//a[.='Alerts']")).click();

            WebElement we1= getWebElement(inspirationLnk);
            Actions action = new Actions(ApplicationManager.driver);
            action.moveToElement(we1).build().perform();
            jsClick(playoffsLnk,"Playoffs");
            jsClick(webAppLnk,"Web Link");
            jsClick(hireUsLnk,"Share Button");
            entertext(txtMsg,"Hi This is Sushma","Message");



        }catch (NoSuchElementException e) {
            e.printStackTrace();

        }
        }



        }
