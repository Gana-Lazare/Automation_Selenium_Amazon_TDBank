import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Cigna {
    WebDriver driver;
    String ChromeDriver = "webdriver.chrome.driver";
    String Chrome_Driver_Path = "C:\\Users\\micromedia\\IdeaProjects\\Automation_Amazon_TD_healthcare\\" +
            ".idea\\lib\\Driver_Browsers\\chrome\\chromedriver.exe";
    String url_ceigna = "https://www.cigna.com/";
    String cigna_international_button = "//*[@id=\"1564310141627\"]/div/header/div[2]/nav[1]/div/ul/li[1]/a";
    String findDentistFacility="//*[@id=\"1564310141627\"]/div/header/div[2]/nav[2]/div/ul/li[1]/a";
   String medicare_choice="/html/body/cigna-root/public-directory-layout/main/cigna-coverage-selection/div/div/div[3]/cigna-search-category-card/div/button";
    String homePage="/html/body/header/div[2]/nav/div[1]/a";
    String custumerRessource ="//*[@id=\"1559458480661\"]/div/header/div[2]/nav[3]/div/ul/li[3]/a";
    String contactus ="//*[@id=\"1564310141627\"]/div/header/div[2]/nav[1]/div/ul/li[2]/a";
    String deutshPDF ="//*[@id=\"includes-content\"]/div[2]/div/div/div/div[1]/div[2]/div[2]/div[4]/ul/li[2]/a";
    String mapsite="//*[@id=\"includes-content\"]/div[2]/div/div/div/div[1]/div[1]/div[2]/div[2]/ul/li[4]/a";
   String mapsite_diabete_choice="//*[@id=\"1566735948641\"]/div/div/div/div[1]/p/a[7]";
    public void chromesetup(String ChromeDriver, String Chrome_Driver_Path) {
        System.setProperty(ChromeDriver, Chrome_Driver_Path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(url_ceigna);


    }

    public void international_cigna() throws InterruptedException {
        driver.findElement(By.xpath(cigna_international_button)).click();
        Thread.sleep(500);
    }

    public void findDoctorDentist() throws InterruptedException{
        driver.findElement(By.xpath(findDentistFacility)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(medicare_choice)).click();
        Thread.sleep(1000);
        //to close the pop up
        driver.findElement(By.xpath("//*[@id=\"covid19TestingSitesModal\"]/div/div/div[3]/button")).click();
   Thread.sleep(2000);
    }
    public void homepage() throws InterruptedException{
        driver.findElement(By.xpath(homePage)).click();
    }
    public void custumerRessource() throws InterruptedException{
        driver.findElement(By.xpath(custumerRessource)).click();
        Thread.sleep(1000);
    }
    public void contactus() throws  InterruptedException{
        driver.findElement(By.xpath(contactus)).click();
        Thread.sleep(500);
    }
    public void footerDeutshPDF() throws  InterruptedException{
        driver.findElement(By.xpath(deutshPDF)).click();
        Thread.sleep(1000);
    }
    public void mapsite() throws InterruptedException{
        driver.findElement(By.xpath(mapsite)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(mapsite_diabete_choice)).click();
    }
    @AfterMethod
    public void close_Browser() throws InterruptedException {
        driver.close();
    }

}
