package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToBasketPage {

    WebDriver driver;

    public AddToBasketPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.CLASS_NAME, using = "btnAddBasket")
    WebElement addToBasket;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[3]/div[2]/div[3]/div[2]/div/div[1]/div/ins")
    WebElement productPagePrice;

    @FindBy(how = How.CLASS_NAME, using = "myBasket")
    WebElement basketButton;

    public void clickOnAddToBasket() {
        addToBasket.click();
    }

    public String returnProductPrice() {
        return productPagePrice.getText();
    }

    public void clickOnBasketButton() {
        basketButton.click();
    }
}
