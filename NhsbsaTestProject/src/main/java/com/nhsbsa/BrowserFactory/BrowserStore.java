package com.nhsbsa.BrowserFactory;

import com.nhsbsa.Utility.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



public class BrowserStore {

    private WebDriver driver;

    public WebDriver CreateBrowser(){
        if(Config.getTestData("browser.name").equalsIgnoreCase("chrome")){
            createChromeBrowser();
        }else if(Config.getTestData("browser.name").equalsIgnoreCase("firefox")){
            createFirefoxBrowser();
        }else {
            throw new IllegalArgumentException("There is no such browserName");
        }
        return driver;
    }
    private void createChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("headless");
        options.addArguments("--enable-javascript");
        options.addArguments("--disable-websecurity");
        this.driver = new ChromeDriver(options);

    }
    private void createFirefoxBrowser() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("--enable-javascript");
        this.driver = new FirefoxDriver(options);

    }
}


