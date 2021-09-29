package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

public class AmazonFashionPage extends HelperBase
{
    @Value("${selWishList}")
    public String selWishList;

    @Value("${txtViewList}")
    public String txtViewList;

    @Value("${txtAddCart}")
   public String txtAddCart;

    @Value("${txtViewCart}")
    public String txtViewCart;

    public void addToCart()
    {
        try
        {
            clickOn(selWishList,"wishList");
            clickOn(txtViewList,"View-Wish-List");
            jsClick(txtAddCart,"Add To Cart");
            clickOn(txtViewCart,"ViewCart");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

}
