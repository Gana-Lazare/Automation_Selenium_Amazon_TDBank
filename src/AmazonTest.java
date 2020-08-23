import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class AmazonTest extends Amazon {
    String ChromeDriver = "webdriver.chrome.driver";
    String Chrome_Driver_Path = "C:\\Users\\micromedia\\IdeaProjects\\Automation_Amazon_TD_healthcare\\" +
            ".idea\\lib\\Driver_Browsers\\chrome\\chromedriver.exe";
//setup befor evry test opening browser , drover , giving url
    @BeforeMethod
    public void Chomesetup() throws InterruptedException {
        chromesetup(ChromeDriver, Chrome_Driver_Path);
    }
//
    @Test
    public void testsearchBoxtesting() throws InterruptedException {
        searchBoxProduct(); //pass


    }
    @Test
    public void testbacktotop() throws  InterruptedException{
        backToTopButton();
    }
    @Test
    public void testsearchDrobBoxscrol_Test() throws InterruptedException {

        searchDropdownBoxscrol();//pass
        Thread.sleep(1000);
    }
    @Test
    public void testoptionsearch_DropDown() throws InterruptedException {
        testsearchDrobBoxscrol_Test();
        optionsearch_DropDown();
        System.out.println(driver.getTitle());
    }
    @Test
    public void testbestSeller_Button_Test() throws InterruptedException {
        bestseller();
        String actualresult =driver.getTitle();
        String expectedresult="Amazon.com Best Sellers: The most popular items on Amazon";
        Assert.assertEquals(actualresult,expectedresult);

    }

    @Test
    public void testburgerMenubare_Test() throws InterruptedException {
        burgerMenubar();
        Thread.sleep(1000);
    }

    @Test
    public void testchangeLanguage_Test() throws InterruptedException {
        changeLanguage();
    }

    @Test
    public void testshopCard() throws InterruptedException {
        shopCardButton();
    }

    @Test
    public void testHomepage_logo_test() throws InterruptedException {
        shopCardButton();
        Thread.sleep(1000);
        logo_Homepage();

    }

    @Test
    public void testaccount_List() throws InterruptedException{
 account_List();
    }
    @Test
    public void testtryPrime()throws InterruptedException{
       tryPrime();
    }

}
