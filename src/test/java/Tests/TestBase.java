package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public static WebDriver driver = null;
    public static String n11Title = "n11.com - Alışverişin Uğurlu Adresi";

    @BeforeSuite
    public void initialize() {
        try {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\muhsi\\Downloads\\selenium\\exe\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://www.n11.com/");

            String pageTitle = driver.getTitle();
            Assert.assertEquals(n11Title, pageTitle);

            driver.findElement(By.className("btnSignIn")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void teardown() {
        try {
            TestBase.driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
