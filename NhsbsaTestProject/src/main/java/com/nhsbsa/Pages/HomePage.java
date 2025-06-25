package com.nhsbsa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{
  @FindBy(id="keyword")
  private WebElement jobTitleElement;
  @FindBy(id="location")
  private WebElement postCodeElement;
  @FindBy(id="distance")
  private WebElement distanceElement;
  @FindBy(id = "searchOptionsBtn")
  private WebElement searchOptionsElement;
  @FindBy(id="jobReference")
  private WebElement jobReferenceElement;
  @FindBy(id="employer")
  private WebElement employerElement;
  @FindBy(id="payRange")
  private WebElement payRangeElement;
  @FindBy(id="search")
  private WebElement searchElement;

    public HomePage(WebDriver driver)
    {
        super(driver);

    }
public ResultPage searchForMyJobPreference()
{
    jobTitleElement.sendKeys("Automation Test");
    postCodeElement.sendKeys("NE15 8NY");
    distanceElement.click();
    Select distance = new Select(distanceElement);
    distance.selectByVisibleText("+10 Miles");
    searchOptionsElement.click();
    jobReferenceElement.sendKeys("914-BSA7285783");
    employerElement.sendKeys("NHS Business Services Authority");
    payRangeElement.click();
    Select payRange = new Select(payRangeElement);
    payRange.selectByVisibleText("£30,000 to £40,000");
    searchElement.click();
    return PageFactory.initElements(driver, ResultPage.class);
}

}
