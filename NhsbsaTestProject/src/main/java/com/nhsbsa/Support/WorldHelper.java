package com.nhsbsa.Support;
import com.nhsbsa.BrowserFactory.Browser;
import com.nhsbsa.Pages.BasePage;
import com.nhsbsa.Pages.HomePage;
import com.nhsbsa.Pages.ResultPage;
import org.openqa.selenium.support.PageFactory;

public class WorldHelper  extends Browser {

    private BasePage basePage;
    private HomePage homePage;
    private ResultPage resultPage;

    public BasePage getBasePage() {
        if (basePage == null)
            basePage = PageFactory.initElements(driver, BasePage.class);
        return basePage;
    }

    public HomePage getHomePage() {
        if (homePage == null)
            homePage = PageFactory.initElements(driver, HomePage.class);
        return homePage;
    }

    public ResultPage getResultPage() {
        if (resultPage == null)
            resultPage = PageFactory.initElements(driver, ResultPage.class);
        return resultPage;
    }

}

