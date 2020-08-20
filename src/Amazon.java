import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    WebDriver driver;
    String ChromeDriver = "webdriver.chrome.driver";
    String Chrome_Driver_Path = "C:\\Users\\micromedia\\IdeaProjects\\Automation_Amazon_TD_healthcare\\" +
            ".idea\\lib\\Driver_Browsers\\chrome\\chromedriver.exe";
    String url = "https://www.amazon.com/";
    String SearchBox_Xpath = "//*[@id=\"twotabsearchtextbox\"]";
    String productSearch = "muai thai pads";
    String searchbutton_xpath = "//*[@id=\"nav-search-submit-text\"]/input";
    String SearchDrobDownBox_Xpath = "//*[@id=\"searchDropdownBox\"]";
    String pads_Path = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/span/a";
    String element_scrolSearchBox = "Software";
    String burgerMenuBare_Xpath = "//*[@id=\"nav-hamburger-menu\"]";
    String logo_navigation = "nav-logo-link";
    String bestSeller_Xpath="//*[@id=\"nav-xshop\"]/a[4]";
    String shop_Card_button_Xpath="//*[@id=\"nav-cart\"]";
    String backtotopButton_Id="navBackToTop";

    public void chromesetup(String ChromeDriver, String Chrome_Driver_Path) {
        System.setProperty(ChromeDriver, Chrome_Driver_Path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }


    public void searchBoxProduct() throws InterruptedException {
        driver.navigate().to(url);
        Thread.sleep(1000);
        driver.findElement(By.xpath(SearchBox_Xpath)).sendKeys(productSearch);
        Thread.sleep(1000);
        driver.findElement(By.xpath(searchbutton_xpath)).click();
        Thread.sleep(2000);

//fair tex pads
        driver.findElement(By.xpath(pads_Path)).click();

    }

    public void searchDropdownBoxscrol() throws InterruptedException {
        driver.navigate().to(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath(SearchDrobDownBox_Xpath)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(SearchDrobDownBox_Xpath)).click();
        //trying to scrol the nav bare
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element =driver.findElement(By.linkText(element_scrolSearchBox));
        js.executeScript("arguments[0].scrollIntoView();", element);*/
    }

    public void burgerMenubar() throws InterruptedException {
        driver.navigate().to(url);
        Thread.sleep(1000);
        driver.findElement(By.xpath(burgerMenuBare_Xpath)).click();
        Thread.sleep(1000);
    }

    public void Logo_Homepage() throws InterruptedException {
        driver.navigate().to(url);
        driver.findElement(By.className(logo_navigation));
    }
    public void bestseller()throws  InterruptedException{
        driver.navigate().to(url);
        driver .findElement(By.xpath(bestSeller_Xpath)).click();
    }
    public void shopCardButton() throws InterruptedException{
        driver.navigate().to(url);
        driver.findElement(By.xpath(shop_Card_button_Xpath)).click();
    }
public void backToTopButton() throws InterruptedException{
    driver.navigate().to(url);
        driver.findElement(By.id(backtotopButton_Id)).click();
}

}
