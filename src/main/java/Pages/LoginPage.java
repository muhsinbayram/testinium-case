package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "email")
    WebElement emailField;

    @FindBy(how = How.ID, using = "password")
    WebElement passField;

    @FindBy(how = How.ID, using = "loginButton")
    WebElement loginButton;

    public void setEmailField(String emailInput) {
        emailField.sendKeys(emailInput);
    }

    public void setPassField(String passInput) {
        passField.sendKeys(passInput);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
