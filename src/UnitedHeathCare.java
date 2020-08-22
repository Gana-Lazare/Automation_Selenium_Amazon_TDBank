import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class UnitedHeathCare {
    WebDriver driver;
    String url_UHC="https://www.uhc.com/";


    public void chromesetup(String ChromeDriver, String Chrome_Driver_Path) {
        System.setProperty(ChromeDriver, Chrome_Driver_Path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(url_UHC);


    }


}
