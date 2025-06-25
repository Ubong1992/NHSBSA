package com.nhsbsa.BrowserFactory;

import org.openqa.selenium.WebDriver;

public class Browser {

    protected static WebDriver driver;

    public WebDriver initialiseBrowser(){

        BrowserStore bs = new BrowserStore();
      this.driver = bs.CreateBrowser();

        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }


    public void cleanBrowser(){
        if(driver != null){
            driver.quit();
        }
    }
}


