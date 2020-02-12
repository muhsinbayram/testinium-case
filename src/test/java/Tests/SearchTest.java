package Tests;

import Pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Tests.TestBase.driver;

public class SearchTest {

    @Test(dependsOnGroups = {"login"}, groups = {"search"}, description = "Initiating the search")
    public void search() {

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        try {
            searchPage.setSearchField("bilgisayar");
            searchPage.clickOnSearchButton();
            Assert.assertTrue(isSuccessful());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isSuccessful() {
        return driver.findElements(By.className("productArea")).size() > 0;
    }


}
