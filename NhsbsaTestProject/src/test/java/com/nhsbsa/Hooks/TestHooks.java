package com.nhsbsa.Hooks;

import com.nhsbsa.BrowserFactory.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class TestHooks {


    private  Browser browser;
    private WebDriver driver;

    public TestHooks(Browser browser)
  {
      this.browser = browser;
  }

    @Before
    public void setUPTest(){

    this.driver = browser.initialiseBrowser();
 
       
    }

    @After
   public void tearDownTest(){
     //   browser.cleanBrowser();
    }
}


