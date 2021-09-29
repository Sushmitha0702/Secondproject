
package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

public class AmazonPage extends HelperBase {

    @Value("${txtEmailAmazon}")
    public String txtEmailAmazon;

    @Value("${txtContinue}")
    public String txtContinue;

    @Value("${txtPassword}")
    public String txtPassword;

    @Value("${txtSignIn}")
    public String txtSignIn;


    public void loginDetails(String username,String password) {
        try {
            entertext(txtEmailAmazon, username, "Enter Email");
            jsClick(txtContinue, "Continue");
         entertext(txtPassword, password, "PaasWord");
         jsClick(txtSignIn, "Sign-In");


        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

    }

}

