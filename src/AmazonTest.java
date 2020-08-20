import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AmazonTest extends Amazon{
    String ChromeDriver="webdriver.chrome.driver";
    String Chrome_Driver_Path="C:\\Users\\micromedia\\IdeaProjects\\Automation_Amazon_TD_healthcare\\" +
            ".idea\\lib\\Driver_Browsers\\chrome\\chromedriver.exe";
    @BeforeClass
     public void Chomesetup() throws InterruptedException {
        chromesetup(ChromeDriver,Chrome_Driver_Path);
    }
     @Test
     public void searchBoxtesting()throws InterruptedException{
         searchBoxProduct(); //pass

     }

     @Test
     public void searchDrobBoxscrol_Test() throws InterruptedException {

         searchDropdownBoxscrol();//pass
         Thread.sleep(1000);
     }
     @Test
    public void  burgerMenubare_Test() throws  InterruptedException{
        burgerMenubar();
     }


    }
