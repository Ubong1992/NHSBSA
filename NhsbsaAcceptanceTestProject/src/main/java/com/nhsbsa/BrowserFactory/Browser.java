package com.nhsbsa.BrowserFactory;


import org.openqa.selenium.WebDriver;

public class Browser {

    protected static WebDriver driver;

    public void InitialiseBrowser(){

        BrowserStore bs = new BrowserStore();
        driver = bs.CreateBrowser();

    }
    public static WebDriver getDriver() {
        return driver;
    }

    public void cleanBrowser(){
        if(driver != null){
            driver.quit();
        }
    }
}

