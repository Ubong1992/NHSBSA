package com.nhsbsa.stepdefinitions;

import com.nhsbsa.Pages.HomePage;
import com.nhsbsa.Pages.ResultPage;
import com.nhsbsa.Support.WorldHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef {

    private final WorldHelper helper;
    private HomePage homePage;
    private ResultPage resultPage;

    public SearchStepDef(WorldHelper helper)
{
    this.helper = helper;
}

    @Given("I am on the NHS job search page")
    public void iAmOnTheNHSJobSearchPage() {
       this.homePage = helper.getBasePage().loadHomePage();
    }
    @When("I enter {string} as the job title")
    public void iEnterAsTheJobTitle(String jobTitle) {
      homePage.EnterJobTitle(jobTitle);
    }
    @When("I enter {string} as the postcode")
    public void iEnterAsThePostcode(String postcode) {
        homePage.EnterPostCode(postcode);
    }
    @When("I select {string} as the distance")
    public void iSelectAsTheDistance(String distance) {
        homePage.SelectDistance(distance);
    }
    @When("I click on search options")
    public void iClickOnSearchOptions() {
        homePage.ClickTheSearchOptions();
    }
    @When("I enter {string} as the job reference")
    public void iEnterAsTheJobReference(String jobReference) {
       homePage.EnterJobReference(jobReference);
    }
    @When("I enter {string} as the employer")
    public void iEnterAsTheEmployer(String employerName) {
        homePage.EnterEmployerName(employerName);
    }
    @When("I select {string} as the pay range")
    public void iSelectAsThePayRange(String payRange) {
     homePage.EnterPayRange(payRange)
             .ClickTheSearchButton();
    }
    @Then("I should see relevant job results")
    public void iShouldSeeRelevantJobResults() {
        helper.getResultPage()
                .SortByNewestDatePosted()             .
        VerifyMyPreferenceJobTitle()

        ;
    }


}
