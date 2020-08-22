import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TD_BankTest  extends  TD_Bank{
    String ChromeDriver = "webdriver.chrome.driver";
    String Chrome_Driver_Path = "C:\\Users\\micromedia\\IdeaProjects\\Automation_Amazon_TD_healthcare\\" +
            ".idea\\lib\\Driver_Browsers\\chrome\\chromedriver.exe";

    @BeforeMethod
    public void testChromesetup() {
        chromesetup(ChromeDriver,Chrome_Driver_Path);

    }

    @Test
    public void testCommercialButton() throws InterruptedException {
        commercialButton();

    }

    @Test
    public void testDropDownCountry() throws InterruptedException {
        dropDownCountry();
    }

    @Test
    public void testDropdownProduct() throws InterruptedException {
        dropdownProduct_Xpath();
    }
    @Test
    public void testloginButton() throws InterruptedException{
login();
    }
    @Test
    public void testhomepage() throws InterruptedException{
        commercialButton();//going to the page and trying to come back to the home page
        Thread.sleep(2000);
        homepage();
    }
    @Test
    public void teslocations() throws InterruptedException{
        locations();
    }
    @Test
    public void testmapLOcations() throws InterruptedException{
        teslocations();//calling another test
        locationmap();
    }
}