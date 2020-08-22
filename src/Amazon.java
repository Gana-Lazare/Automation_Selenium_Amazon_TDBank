import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Amazon {
    WebDriver driver;
    String ChromeDriver = "webdriver.chrome.driver";
    String Chrome_Driver_Path = "C:\\Users\\micromedia\\IdeaProjects\\Automation_Amazon_TD_healthcare\\" +
            ".idea\\lib\\Driver_Browsers\\chrome\\chromedriver.exe";
    String url = "https://www.amazon.com/";
    String SearchBox_Xpath = "//*[@id=\"twotabsearchtextbox\"]";
    String productSearch = "muai thai pads";
    String searchbutton = "#nav-search-submit-text > input";
    String SearchDrobDownBox = "//*[@id=\"searchDropdownBox\"]";
    String pads_Path = "//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/span/a";
    String element_scrolSearchBox = "Alexa Skills";
    String burgerMenuBare_Xpath = "//*[@id=\"nav-hamburger-menu\"]";
    String logo_navigation = "//*[@id=\"nav-logo\"]/a";
    String bestSeller_Xpath = "//*[@id=\"nav-xshop\"]/a[1]";
    String shop_Card_button_Xpath = "//*[@id=\"nav-cart\"]";
    String backtotopButton_Id = "navBackToTop";
    String languageButton_id = "icp-nav-flyout";
    String changeLanguage_Save_Button="//*[@id=\"icp-btn-save\"]/span/input";
    String spanish_language_Button_xpath ="//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/i";
    String burger_choice_element_giftCard="//*[@id=\"hmenu-content\"]/ul[1]/li[33]/a";
    String allGiftCarts ="//*[@id=\"hmenu-content\"]/ul[30]/li[3]/a";
    String Login_xpath = "";
    String Amazon_user_name_login_xpath = "";
    String Amazon_password_xpath = "";


    public void chromesetup(String ChromeDriver, String Chrome_Driver_Path) throws InterruptedException {
        System.setProperty(ChromeDriver, Chrome_Driver_Path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);

    }

    public void searchBoxProduct() throws InterruptedException {

        driver.findElement(By.xpath(SearchBox_Xpath)).sendKeys(productSearch);
        driver.findElement(By.cssSelector(searchbutton)).click();
//fair tex pads
        Thread.sleep(1000);
        driver.findElement(By.xpath(pads_Path)).click();


    }

    public void searchDropdownBoxscrol() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath(SearchDrobDownBox)).click();
        Thread.sleep(2000);
        //to close it
        driver.findElement(By.xpath(SearchDrobDownBox)).click();

        //trying to scrol the nav bare
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // WebElement element =driver.findElement(By.linkText(element_scrolSearchBox));
        // js.executeScript("  $('#select1').append(`<option value=\"${search-alias=alexa-skills}\"> \n" +"${Amazon Fresh} \n" +"</option>`); ");


    }

    public void changeLanguage() throws InterruptedException {
        driver.findElement(By.id(languageButton_id)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(spanish_language_Button_xpath)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(changeLanguage_Save_Button)).click();
        Thread.sleep(1000);

    }

    public void burgerMenubar() throws InterruptedException {

        driver.findElement(By.xpath(burgerMenuBare_Xpath)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(burger_choice_element_giftCard)).click();
        driver.findElement(By.xpath(allGiftCarts)).click();
    }

    public void logo_Homepage() throws InterruptedException {

        driver.findElement(By.xpath(logo_navigation)).click();
    }

    public void bestseller() throws InterruptedException {

        driver.findElement(By.xpath(bestSeller_Xpath)).click();
        Thread.sleep(1000);
    }

    public void shopCardButton() throws InterruptedException {

        driver.findElement(By.xpath(shop_Card_button_Xpath)).click();
    }

    public void backToTopButton() throws InterruptedException {
        driver.navigate().to(url);
        driver.findElement(By.id(backtotopButton_Id)).click();
    }

    public void login_link() throws InterruptedException {
    }

    public void add_item_into_shopcart() throws InterruptedException {
    }

    @AfterMethod
    public void close_Browser() throws InterruptedException {
        driver.close();
    }

}
