package pages;

import appmanager.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class GoogleSuggestionPage extends HelperBase {
    @Value("${srhBox}")
    public String srhBox;

   @Value("${listOfautosgst}")
    public String listOfautosgst;

    @Value("${txtLnk}")
   public String txtLnk;
//
//    @Value("${clickAllCheckBtn}")
//    public String clickAllCheckBtn;
//
//    @Value("${clkChkBox1}")
//    public String clkChkBox1;
//
//    @Value("${clkChkBox2}")
//    public String clkChkBox2;

    public void autosuggestion() throws InterruptedException {
        try{
           entertext(srhBox,"Selenium","Search Box");
//           clickOn(txtLnk,"Selenium testing");
           Thread.sleep(2000);
          List<WebElement> elements= driver.findElements(By.xpath(listOfautosgst));
         System.out.println(elements.size()) ;
            for (WebElement element : elements) {
                if (element.getText().equalsIgnoreCase("Selenium testing")) {
                    element.click();
                    break;
                }
            }

        }catch (NoSuchElementException e) {
            e.printStackTrace();

        }


    }






}



