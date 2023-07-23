package app.netlify.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MainTest {

    protected static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //open page
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }




    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        //close browser
        driver.manage().deleteAllCookies();
        waitForNumberOfSeconds(2);
        driver.close();
    }

    public void waitForNumberOfSeconds(int seconds){ //metoda for wait
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
