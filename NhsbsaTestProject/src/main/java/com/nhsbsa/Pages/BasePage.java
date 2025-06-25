package com.nhsbsa.Pages;

import com.nhsbsa.Utility.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver)
    {

        this.driver = driver;
    }

    public HomePage loadHomePage() {
        String baseUrl = Config.getTestData("base.url");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to(baseUrl);
       // driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        return PageFactory.initElements(driver, HomePage.class);
    }
}


