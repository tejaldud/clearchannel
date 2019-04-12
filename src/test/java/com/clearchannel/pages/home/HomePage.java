package com.clearchannel.pages.home;

import com.common.SerenityPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("https://www.clearchannelinternational.com/")
public class HomePage extends SerenityPage {

    static By SEARCH_ICON = By.id("icon-search");
    @FindBy(xpath = "//div[@id='nav-in-page']//h1")
    WebElementFacade pageTitle;

    static By LOGO = By.id("logo");

    @FindBy(id = "logo")
    WebElementFacade homePageLogo;

    @FindBy(id = "modal")
    WebElementFacade welcomePopUp;

    public String getHomePageTitle() {
        waitForElementToVanish(welcomePopUp, 60);
       return pageTitle.getText();
    }

    public void clickOnSearch() {

        waitFor(ExpectedConditions.presenceOfElementLocated(SEARCH_ICON));
        WebElementFacade clickButton = find(SEARCH_ICON);
        waitForElementToBeClickable(SEARCH_ICON, 60);
        waitForMill(2000);
        clickButton.click();

    }


}
