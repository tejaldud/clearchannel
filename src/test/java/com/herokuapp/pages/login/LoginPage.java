package com.herokuapp.pages.login;

import com.clearchannel.pages.search.SearchPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://the-internet.herokuapp.com/login")
public class LoginPage extends SearchPage {

    @FindBy(id="username")
    WebElementFacade userNameTextBox;

    @FindBy(id="password")
    WebElementFacade passwordTextBox;

    @FindBy(className="radius")
    WebElementFacade loginButton;

    @FindBy(id="flash")
    WebElementFacade loginMessage;

    @FindBy(xpath=".//a/i[contains(text(),'Logout')]")
    WebElementFacade logoutButton;

    public void enterUserName(String username)
    {
        userNameTextBox.clear();
        userNameTextBox.sendKeys(username);
    }
    public void enterPassword(String password)
    {
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
    }
    public void clickOnLogin()
    {
        loginButton.click();
    }
    public boolean verifyUserLoggedIn()
    {
        return logoutButton.isDisplayed();
    }
    public String getMessage()
    {
        return loginMessage.getText();
    }
}
