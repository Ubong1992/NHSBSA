package com.nhsbsa.stepdefinitions;

import com.nhsbsa.BrowserFactory.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class TestHooks {
    private final Browser browser;



    public TestHooks(Browser browser)
    {
        this.browser = browser;
    }

    @Before
    public void setUPTest() {
        browser.InitialiseBrowser();
    }
    @After
    public void tearDownTest(){
        browser.cleanBrowser();
    }

}

