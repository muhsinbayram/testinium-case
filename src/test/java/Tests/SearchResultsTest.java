package Tests;

import Pages.SearchResultsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Tests.TestBase.driver;

public class SearchResultsTest {

    @Test(dependsOnGroups = {"search"}, groups = {"secondPage"}, description = "Navigating to the second page")
    public void secondPage() {

        SearchResultsPage searchResultPage = PageFactory.initElements(driver, SearchResultsPage.class);

        try {
            Thread.sleep(2000);
            searchResultPage.clickOnSecondPageButton();
            Assert.assertTrue(isSuccessful());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean isSuccessful() {
        return driver.getCurrentUrl().contains("&pg=2");
    }

}
