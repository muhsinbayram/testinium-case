package Tests;

import Pages.ProductSelectPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Tests.TestBase.driver;

public class ProductSelectTest {

    @Test(dependsOnGroups = {"secondPage"}, groups = {"productSelect"}, description = "Selecting a random product")
    public void productSelect() {
        try {
            ProductSelectPage productSelectPage = PageFactory.initElements(driver, ProductSelectPage.class);
            productSelectPage.findProduct();
            Thread.sleep(1000);
            productSelectPage.clickOnProduct();
            Thread.sleep(1000);
            Assert.assertTrue(isSuccessful());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isSuccessful() {
        return !driver.getTitle().equals("Bilgisayar - n11.com - 2/50");
    }
}
