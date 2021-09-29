package pages;

import appmanager.HelperBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.Map;

public class TablePaginationformPage extends HelperBase {
    @Value("${tableLnk}")
    public String tableLnk;

    @Value("${tablePaginationLnk}")
    public String tablePaginationLnk;

    @Value("${tblData}")
    public String tblData;

    @Value("${clickAllCheckBtn}")
    public String clickAllCheckBtn;

    public void paginationData() {
        try {
            clickOn(tableLnk, "Table Link");
            clickOn(tablePaginationLnk, "Table Pagination");
            HashMap<String, Integer> map = new HashMap<>();
            for (Map.Entry<String, Integer> tblData : map.entrySet())
                System.out.println("Key: " + tblData.getKey()
                        + " Value: " + tblData.getValue());

        } catch (NoSuchElementException e) {
            e.printStackTrace();

        }
    }
}

