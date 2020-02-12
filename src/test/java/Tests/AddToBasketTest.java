package Tests;

import Pages.AddToBasketPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import static Tests.TestBase.driver;

public class AddToBasketTest {

    public static String itemPrice;

    @Test(dependsOnGroups = {"productSelect"}, groups = {"addToBasket"}, description = "Adding the item to basket")
    public void addToBasket() {
        AddToBasketPage addToBasketPage = PageFactory.initElements(driver, AddToBasketPage.class);

        try {
            itemPrice = addToBasketPage.returnProductPrice();
            addToBasketPage.clickOnAddToBasket();
            Thread.sleep(2000);
            addToBasketPage.clickOnBasketButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
