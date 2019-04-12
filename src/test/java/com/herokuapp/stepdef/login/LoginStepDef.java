package com.herokuapp.stepdef.login;

import com.herokuapp.pages.login.LoginPage;
import com.common.NavigateTo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDef {

    @Steps
    NavigateTo navigateTo;

    @Steps
    LoginPage loginPage;

    @Given("^I am on herokuapp login page")
    public void i_am_on_the_login_page() {
        navigateTo.theLoginPage();
    }

    @And("^I enter username (.*)$")
    public void enter_user_name(String userName) {
        loginPage.enterUserName(userName);
    }
    @And("^I enter password (.*)$")
    public void enter_password_name(String password) {
        loginPage.enterPassword(password);
    }

    @When("^I click on login$")
    public void iClickOnLogin() {
        loginPage.clickOnLogin();
    }

    @Then("^User should be logged in$")
    public void userShouldBeLoggedIn() {
        assertThat(loginPage.verifyUserLoggedIn()).isTrue();
    }

    @Then("^User should get message as (.*)$")
    public void userShouldGetMessageAsMessage(String message) {
        assertThat(loginPage.getMessage()).contains(message);
    }
}
