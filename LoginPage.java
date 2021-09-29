package pages;

import appmanager.HelperBase;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class LoginPage extends HelperBase {


    @Value("${txtUserName}")
    public String txtUserName;

    @Value("${txtPassword}")
    public String txtPassword;

    @Value("${txtLogin}")
    public String txtLogin;


    public void loginToApplication(String userName,String password){
        try {
            enterText(txtUserName, userName, "UserName TextBox");
            enterText(txtPassword, password, "Password TextBox");
            clickOn(txtLogin, "Login Button");
            // takeScreenshot();
        }catch (Exception e){
            e.printStackTrace();
        }


    }









}
