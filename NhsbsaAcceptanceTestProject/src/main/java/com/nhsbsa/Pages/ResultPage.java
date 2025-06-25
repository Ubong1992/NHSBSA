package com.nhsbsa.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;


public class ResultPage extends BasePage{
    public ResultPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "first-result-title")
    private WebElement searchElement;
    @FindBy(id = "sort")
    private WebElement sortElement;


    public void VerifyMyPreferenceJobTitle()
    {
        WebElement actualTitleElement = searchElement;
        String actualTitle = actualTitleElement.getText();
        String expectedTitle = "Junior Developer";
        assertEquals("Title does not match!", expectedTitle, actualTitle);
        PageFactory.initElements(driver, ResultPage.class);
    }
    public ResultPage SortByNewestDatePosted()
    {
        driver.manage().timeouts();
        sortElement.click();
        Select sortByNewest = new Select(sortElement);
        sortByNewest.selectByVisibleText("Date Posted (newest)");
        return PageFactory.initElements(driver, ResultPage.class);
    }
}

