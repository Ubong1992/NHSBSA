package com.nhsbsa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
    @FindBy(id = "keyword")
    private WebElement jobTitleElement;
    @FindBy(id = "location")
    private WebElement postCodeElement;
    @FindBy(id = "distance")
    private WebElement distanceElement;
    @FindBy(id = "searchOptionsBtn")
    private WebElement searchOptionsElement;
    @FindBy(id = "jobReference")
    private WebElement jobReferenceElement;
    @FindBy(id = "employer")
    private WebElement employerElement;
    @FindBy(id = "payRange")
    private WebElement payRangeElement;
    @FindBy(id = "search")
    private WebElement searchElement;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage EnterJobTitle(String jobTitle) {
        jobTitleElement.sendKeys(jobTitle);
        return this;
    }

    public HomePage EnterPostCode(String postCode) {
        postCodeElement.sendKeys(postCode);
        return this;
    }

    public HomePage SelectDistance(String distance) {
        distanceElement.click();
        Select select = new Select(distanceElement);
        select.selectByVisibleText(distance);
        return this;
    }

    public HomePage ClickTheSearchOptions() {
        searchOptionsElement.click();
        return this;
    }

    public HomePage EnterJobReference(String jobReference) {
        jobReferenceElement.sendKeys(jobReference);
        return this;
    }

    public HomePage EnterEmployerName(String employerName) {
        employerElement.sendKeys(employerName);
        return this;
    }

    public HomePage EnterPayRange(String payRange) {
        payRangeElement.click();
        Select select = new Select(payRangeElement);
        select.selectByVisibleText(payRange);
        return this;
    }

    public ResultPage ClickTheSearchButton() {
        searchElement.click();
        return PageFactory.initElements(driver, ResultPage.class);
    }
}



