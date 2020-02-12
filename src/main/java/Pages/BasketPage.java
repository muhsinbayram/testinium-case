package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasketPage {

    WebDriver driver;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[2]/div/span")
    WebElement basketPrice;

    @FindBy(how = How.CLASS_NAME, using = "spinnerUp")
    WebElement upButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[1]/input")
    WebElement itemCount;

    @FindBy(how = How.CLASS_NAME, using = "removeProd")
    WebElement removeButton;

    public void increaseCount() {
        upButton.click();
    }

    public String returnBasketPrice() {
        return basketPrice.getText();
    }

    public String returnItemCount() {
        return itemCount.getAttribute("value");
    }

    public void clickOnRemoveButton() {
        removeButton.click();
    }

}
