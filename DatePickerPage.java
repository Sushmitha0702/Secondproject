package pages;

import appmanager.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Value;

import static appmanager.ExtentCucumberFormatter.testStepInfo;

public class DatePickerPage extends HelperBase {

    @Value("${selDate}")
    public String selDate;

    @Value("${weDate}")
    public String weDate;

    @Value("${weMonth}")
    public String weMonth;

    @Value("${weParticularMonth}")
    public String weParticularMonth;

    @Value("${selDay}")
    public String selDay;

    @Value("${weStartDate}")
    public String weStartDate;

    @Value("${weEndDate}")
    public String weEndDate;

    @Value("${weSDate}")
    public String weSDate;

    @Value("${weEnDate}")
    public String weEnDate;

    public void pickTheDateFrom(){
        try {
            clickOn(weDate,"Date");
            clickOn(weMonth,"Month And Year");
            Thread.sleep(2000);
            clickOn(weParticularMonth,"ParticularMonth");
            clickOn(selDay,"Day");
            clickOn(weStartDate,"StartDate");
            clickOn(weMonth,"Month And Year");
            clickOn(weParticularMonth,"ParticularMonth");
            clickOn(weSDate,"Start Day");
            clickOn(weEndDate,"EndDate");
            clickOn(weMonth,"Month And Year");
            clickOn(weParticularMonth,"ParticularMonth");
            clickOn(weEnDate,"weEDate");

            /*  testStepInfo("Click on the Date");*/
            sleep(1000);
        }
        catch(NoSuchElementException | InterruptedException e){
            e.printStackTrace();
        }
    }
}