import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AmazonTest extends Amazon {
    String ChromeDriver = "webdriver.chrome.driver";
    String Chrome_Driver_Path = "C:\\Users\\micromedia\\IdeaProjects\\Automation_Amazon_TD_healthcare\\" +
            ".idea\\lib\\Driver_Browsers\\chrome\\chromedriver.exe";

    @BeforeMethod
    public void Chomesetup() throws InterruptedException {
        chromesetup(ChromeDriver, Chrome_Driver_Path);
    }

    @Test
    public void searchBoxtesting() throws InterruptedException {
        searchBoxProduct(); //pass


    }

    @Test
    public void searchDrobBoxscrol_Test() throws InterruptedException {

        searchDropdownBoxscrol();//pass
        Thread.sleep(1000);
    }

    @Test
    public void bestSeller_Button_Test() throws InterruptedException {
        bestseller();
    }

    @Test
    public void burgerMenubare_Test() throws InterruptedException {
        burgerMenubar();
        Thread.sleep(1000);
    }

    @Test
    public void changeLanguage_Test() throws InterruptedException {
        changeLanguage();
    }

    @Test
    public void shopCard() throws InterruptedException {
        shopCardButton();
    }

    @Test
    public void Homepage_logo_test() throws InterruptedException {
        shopCardButton();
        Thread.sleep(1000);
        logo_Homepage();

    }

}
