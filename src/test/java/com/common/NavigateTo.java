package com.common;

import com.herokuapp.pages.login.LoginPage;
import com.clearchannel.pages.home.HomePage;
import net.thucydides.core.annotations.Step;
public class NavigateTo extends SerenityPage {

    HomePage homePage;
    LoginPage loginPage;

    @Step("Open the Clear channel international home page")
    public void theHomePage() {
        homePage.open();
    }
    @Step("Open the login page")
    public void theLoginPage() {
        loginPage.open();
    }
}
