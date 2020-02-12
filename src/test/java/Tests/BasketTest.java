package Tests;

import Pages.BasketPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Tests.AddToBasketTest.itemPrice;
import static Tests.TestBase.driver;


public class BasketTest {

    @Test(dependsOnGroups = {"addToBasket"}, groups = {"basketOps"}, description = "Performing basket operations")
    public void basketOps() {

        BasketPage basketPage = PageFactory.initElements(driver, BasketPage.class);

        String price = basketPage.returnBasketPrice();
        Assert.assertTrue(samePrice(price));
        basketPage.increaseCount();
        String count = basketPage.returnItemCount();
        Assert.assertTrue(sameCount(count));
        basketPage.clickOnRemoveButton();
        Assert.assertTrue(basketEmpty());
    }

    private boolean basketEmpty() {
        return driver.findElements(By.className("emptyCartContainer")).size() > 0;
    }

    private boolean sameCount(String count) {
        return count.equals("2");
    }

    private boolean samePrice(String price) {
        return price.equals(itemPrice);
    }
}
