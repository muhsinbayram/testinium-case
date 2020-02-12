package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "searchData")
    WebElement searchField;

    @FindBy(how = How.CLASS_NAME, using = "searchBtn")
    WebElement searchButton;

    public void setSearchField(String searchInput) {
        searchField.sendKeys(searchInput);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }


}