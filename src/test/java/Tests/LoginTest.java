package Tests;

import Pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Tests.TestBase.driver;
import static Tests.TestBase.n11Title;

public class LoginTest {
    @Test(groups = {"login"}, description = "Logging in")
    public void login() {

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        try {
            loginPage.setEmailField("accfortesting05022020@gmail.com");
            loginPage.setPassField("test0502");
            loginPage.clickOnLoginButton();
            Assert.assertTrue(isSuccessful());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean isSuccessful() {
        return n11Title.equals(driver.getTitle());
    }
}
