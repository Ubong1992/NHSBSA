package com.nhsbsa.stepdefinitions;

import com.nhsbsa.Pages.HomePage;
import com.nhsbsa.Pages.ResultPage;
import com.nhsbsa.Support.WorldHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class SearchStepDef {

    private final WorldHelper helper;
    private HomePage homePage;
    private ResultPage resultPage;


    public SearchStepDef(WorldHelper helper) {
        this.helper = helper;
    }

    @Given("I am a jobseeker on NHS job website")
    public void iAmAJobseekerOnNHSJobWebsite()  {
       this.homePage = helper.getBasePage().loadHomePage();
    }

    @When("I put my preferences into the search functionality")
    public void iPutMyPreferencesIntoTheSearchFunctionality() {
      this.resultPage = homePage.searchForMyJobPreference();
    }

    @Then("I should get a list of jobs which matches my preferences")
    public void iShouldGetAListOfJobsWhichMatchesMyPreferences()  {
        this.resultPage = resultPage.VerifyMyPreferenceJobTitle();
    }

    @Then("sort my search results with the newest date posted")
    public void sortMySearchResultsWithTheNewestDatePosted()  {
        this.resultPage = resultPage.SortByNewestDatePosted()
                .VerifyMyPreferenceJobTitle();
    }
}
