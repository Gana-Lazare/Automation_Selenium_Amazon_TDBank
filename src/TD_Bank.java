import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class TD_Bank {
    WebDriver driver;
    String commercial_Xpath = "/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[3]/a";
    String ChromeDriver = "webdriver.chrome.driver";
    String Chrome_Driver_Path = "C:\\Users\\micromedia\\IdeaProjects\\Automation_Amazon_TD_healthcare\\" +
            ".idea\\lib\\Driver_Browsers\\chrome\\chromedriver.exe";
    String dropDownCountry_Xpath = "//*[@id=\"td-desktop-nav-dropdown-link-0\"]";
    String getDropDownCountry_Canada_Xpath = "/html/body/div[2]/div[2]/header[1]/div[2]/div/div[2]/div/ul/li[1]/ul/li[1]/a";
   // String dropdownNavigationProduct_Xpath = "//*[@id=\"td-desktop-nav-dropdown-link-2\"]";
    String productDropDown_Xpath = "//*[@id=\"td-desktop-nav-dropdown-link-2\"]";
    String url_tdbank = "https://www.td.com/us/en/personal-banking/";
    String Canada_Country_CSS = "body > div.td-header-nav-top-message > div.td_rq_header-nav.td-header-nav > header.td-header-desktop > div.td-utility-toggle > div > div.td-section-right > div > ul > li.td-dropdown.td-dropdown-country.td-dropdown-no-hover.td-dropdown-active > ul > li:nth-child(1) > a";
    String search_Button_CSS = "body > div.td-header-nav-top-message > div.td_rq_header-nav.td-header-nav > header.td-header-desktop > div.td-nav-primary > div > div.td-section-right > div > ul > li.search > a";
    String search_Area_xpath = "/html/body/div[2]/div[2]/header[1]/div[3]/div/div[3]/div/header-search-input/form/input[1]";
    String loginButton = "//*[@id=\"main\"]/div[1]/div[2]/section/div/div/div/div[2]/div/div[2]/div[1]/button";
    String userName_area = "//*[@id=\"formElement_0\"]";
    String username = "george";
    String password_area = "//*[@id=\"formElement_1\"]";
    String password = "12345*";
    String rememberme_button = "ng-valid form-control ng-dirty ng-valid-parse ng-touched ng-empty";
    String login_validation = "//*[@id=\"loginForm\"]/button";
    String homepage = "/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/div/a";
String location="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[2]/div/ul/li[1]/a";
String plus_button_location="//*[@id=\"dir-map\"]/div/div/div[8]/div/div/button[1]";
String map_location ="//*[@id=\"dir-map\"]/div/div/div[1]";
    public void chromesetup(String ChromeDriver, String Chrome_Driver_Path) {
        System.setProperty(ChromeDriver, Chrome_Driver_Path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(url_tdbank);


    }

    public void commercialButton() throws InterruptedException {
        driver.findElement(By.xpath(commercial_Xpath)).click();
    }

    public void dropDownCountry() throws InterruptedException {
        driver.findElement(By.xpath(dropDownCountry_Xpath)).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(Canada_Country_CSS)).click();
        Thread.sleep(1000);
    }

    public void dropdownProduct_Xpath() throws InterruptedException {

        driver.findElement(By.xpath(productDropDown_Xpath)).click();
        Thread.sleep(1000);
    }

    public void login() throws InterruptedException {
        driver.findElement(By.xpath(loginButton)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(userName_area)).sendKeys(username);
        Thread.sleep(500);
        driver.findElement(By.xpath(password_area)).sendKeys(password);
        Thread.sleep(500);
        // driver.findElement(By.className(rememberme_button)).click();
        // Thread.sleep(500);
        driver.findElement(By.xpath(login_validation)).click();
        Thread.sleep(1000);
    }

    public void homepage() throws InterruptedException {
        driver.findElement(By.xpath(homepage)).click();
    }
public void locations() throws InterruptedException{
    driver.findElement(By.xpath(location)).click();
    Thread.sleep(2000);

}
public  void locationmap() throws InterruptedException{
        driver.findElement(By.xpath(plus_button_location)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(map_location)).click();
}
    @AfterMethod
    public void close_Browser() throws InterruptedException {
        driver.close();
    }
}