package com.nhsbsa.Pages;

import com.nhsbsa.Utilities.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage loadHomePage() {

            String baseUrl = ConfigReader.getTestData("base.url");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.navigate().to(baseUrl);
            return PageFactory.initElements(driver, HomePage.class);
        }


    }
