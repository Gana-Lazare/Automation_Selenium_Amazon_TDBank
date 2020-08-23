import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCigna extends Cigna {
    String ChromeDriver = "webdriver.chrome.driver";
    String Chrome_Driver_Path = "C:\\Users\\micromedia\\IdeaProjects\\Automation_Amazon_TD_healthcare\\" +
            ".idea\\lib\\Driver_Browsers\\chrome\\chromedriver.exe";

    @BeforeMethod
    public void testChromesetup() {
        chromesetup(ChromeDriver,Chrome_Driver_Path);
    }

    @Test
    public void testInternationalCigna() throws InterruptedException{
        international_cigna();
    }
    @Test
    public void testfindDoctorOrDentist() throws InterruptedException{
        findDoctorDentist(); // fail cause of popo up
    }
    @Test
    public void testhomepage() throws InterruptedException{
        testfindDoctorOrDentist();
        Thread.sleep(1000);
        homepage();
    }
    @Test
    public void testcostumerRessource() throws InterruptedException{
        custumerRessource();
    }
    @Test
    public void testcontactus() throws InterruptedException{ contactus();
    }
    @Test
    void testdeutshpdf() throws InterruptedException{
        footerDeutshPDF();
        Thread.sleep(1000);
    }
    @Test
    public void testmapsite() throws InterruptedException{
        mapsite();
    }

}
