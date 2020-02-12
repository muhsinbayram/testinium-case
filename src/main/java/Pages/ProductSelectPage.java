package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProductSelectPage {

    WebDriver driver;
    List<WebElement> productList;
    Random random = new Random();
    int productSize;
    int randomProduct;

    public ProductSelectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void findProduct() {
        productList = driver.findElements(By.cssSelector("div.columnContent h3.productName"));
        productSize = productList.size();
        randomProduct = random.nextInt(productSize);
    }

    public void clickOnProduct() {
        productList.get(randomProduct).click();
    }

}
