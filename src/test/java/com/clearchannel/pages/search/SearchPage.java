package com.clearchannel.pages.search;

import com.common.SerenityPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends SerenityPage {

    @FindBy(className = "flex-text-wrap")
    WebElementFacade searchField;

    @FindBy(xpath = ".//button[text()='Submit']")
    WebElementFacade serachButton;
    static By searchFrame = By.className("container_12");
    static By searchResults = By.xpath("//div[@id='header']/following-sibling::div[@class='container_12']//div//a");

    public void enterTerm(String term) {
        waitForPresenseOfElement(searchField, 120);
        enterText(searchField, term);
    }

    public void clickOnSearch() {
        serachButton.click();
        waitForElementToBeVisible(searchFrame, 60);

    }

    public List<WebElementFacade> getSearchResults() {
        return findAll(searchResults);

    }
}
