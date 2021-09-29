package pages;

import appmanager.HelperBase;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;
import tests.TestBase;

public class SimpleFormPage extends HelperBase {
    @Value("${txtInput}")
    public String txtInput;

    @Value("${txtSFD}")
    public String txtSFD;

    @Value("${txtNotification}")
    public String txtNotification;

    @Value("${txtMsg}")
    public String txtMsg;

    @Value("${btnShowMsg}")
    public String btnShowMsg;

    @Value("${txtEnteraValue}")
    public String txtEnteraValue;

    @Value("${txtEnterbValue}")
    public String txtEnterbValue;

    @Value("${btnGettotal}")
    public String btnGettotal;


    public void fillAllTheDetails() {
        try {
            clickOn(txtInput,"Input_Forms");
            clickOn(txtSFD,"Simple Form Demo");
            jsClick(txtNotification,"Notification-Pop_Up");
            entertext(txtMsg,"Wlcome To simple Form","Enter Message");
            clickOn(btnShowMsg,"Show Message");
            entertext(txtEnteraValue,"07","Enter a Value");
            entertext(txtEnterbValue,"97","Enter b Value");
            clickOn(btnGettotal,"Get Total");



        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }


    }


