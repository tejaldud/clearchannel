package com.clearchannel.stepdef.search;

import com.clearchannel.pages.search.SearchPage;
import com.common.NavigateTo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import com.clearchannel.pages.home.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchStepDef {

    @Steps
    NavigateTo navigateTo;

    @Steps
    HomePage homePage;

    SearchPage searchPage;

    @Given("^(?:.*) on (clear channel international) home page")
    public void i_am_on_the_clear_channel_home_page(String title) {
        navigateTo.theHomePage();
        assertThat(homePage.getHomePageTitle().toLowerCase()).contains(title);

    }

    @And("^(?:I|s?he) click on search icon$")
    public void iClickOnSearchIcon() {
        homePage.clickOnSearch();
    }

    @And("^(?:I|s?he) search for (.*)$")
    public void searchForTerm(String searchTerm) {

        searchPage.enterTerm(searchTerm);
    }

    @When("^(?:I|s?he) click on search$")
    public void iClickOnSearch() {
        searchPage.clickOnSearch();
    }

    @Then("^search results are displayed$")
    public void searchResultsAreDisplayed() {
        assertThat(searchPage.getSearchResults().size()).withFailMessage("No Search results").isGreaterThan(0);
    }

}
