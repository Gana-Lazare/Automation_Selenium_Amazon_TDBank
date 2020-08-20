import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TD_Bank {
    WebDriver driver;
    String commercial_Xpath="/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[3]/a";
    String ChromeDriver = "webdriver.chrome.driver";
    String Chrome_Driver_Path = "C:\\Users\\micromedia\\IdeaProjects\\Automation_Amazon_TD_healthcare\\" +
            ".idea\\lib\\Driver_Browsers\\chrome\\chromedriver.exe";
    String dropDownCountry_Xpath = "//*[@id=\"td-desktop-nav-dropdown-link-0\"]";
    String getDropDownCountry_Canada_Xpath="/html/body/div[2]/div[2]/header[1]/div[2]/div/div[2]/div/ul/li[1]/ul/li[1]/a";
    String dropdownNavigationProduct_Xpath="//*[@id=\"td-desktop-nav-dropdown-link-2\"]";
    String productDropDown_Xpath="/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/ul/li[4]/a";

    public void chromesetup(String ChromeDriver, String Chrome_Driver_Path) {
        System.setProperty(ChromeDriver, Chrome_Driver_Path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }
    public  void commercialButton() throws InterruptedException{
        driver.findElement(By.xpath(commercial_Xpath)).click();
    }
    public void dropDownCountry() throws  InterruptedException{
        driver.findElement(By.xpath(dropDownCountry_Xpath)).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(getDropDownCountry_Canada_Xpath)).click();
    }
    public void dropdownProduct_Xpath() throws InterruptedException
    {
        driver.findElement(By.xpath(dropdownNavigationProduct_Xpath)).click();
        driver.findElement(By.xpath(productDropDown_Xpath)).click();
    }
}