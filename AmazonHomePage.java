package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.awt.*;
import java.util.Iterator;
import java.util.Set;

public class AmazonHomePage extends HelperBase {




    @Value("${txtSearchBox}")
    public String txtSearchBox;

   @Value("${txtSearchBtn}")
   public String txtSearchBtn;

    @Value("${selSize}")
    public String selSize;

    @Value("${selBrand}")
    public String selBrand;

    @Value("${selImage}")
    public String selImage;

    @Value("${selbrandSize}")
    public String selbrandSize;


    public void searchproduct() {
        try {
            entertext(txtSearchBox, " tops women's", "Search Box");
            jsClick(txtSearchBtn, "Search button");
            clickOn(selSize, "Select-Size");
            clickOn(selBrand, "Select-Brand");
            clickOn(selImage, "Click-On-Image");
           switchToWindows();
            selectFromDropdown(selbrandSize, "XS", "Select-Size");

        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
