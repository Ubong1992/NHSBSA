package com.nhsbsa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ResultPage extends BasePage {

    @FindBy(id = "first-result-title")
    private WebElement searchElement;
    @FindBy(id = "sort")
    private WebElement sortElement;

    public ResultPage(WebDriver driver) {
        super(driver);
    }
  public ResultPage VerifyMyPreferenceJobTitle()
  {
       WebElement actualTitle = driver.findElement(By.id("first-result-title"));
       String expectedTitle = "Junior Developer";
       // (expectedTitle, actualTitle);
       return PageFactory.initElements(driver, ResultPage.class);
  }
public ResultPage SortByNewestDatePosted()
{
    sortElement.click();
    Select sortByNewest = new Select(sortElement);
    sortByNewest.selectByVisibleText("Date Posted (newest)");
    return PageFactory.initElements(driver, ResultPage.class);
}
}