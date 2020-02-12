package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultsPage {

    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div/div[2]/div[4]/a[2]")
    WebElement secondPageButton;

    public void clickOnSecondPageButton() {
        secondPageButton.click();
    }
}
