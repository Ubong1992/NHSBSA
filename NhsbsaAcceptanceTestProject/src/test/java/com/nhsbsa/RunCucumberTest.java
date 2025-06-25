package com.nhsbsa;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty", // Uncomment if you want console pretty output
                "html:target/cucumber-html-report",
                "json:target/cucumber-report.json",
                "junit:target/cucumber-report.xml"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features",
       // extraGlue = "src/test/java/",
        glue = "com.nhsbsa.stepdefinitions",
        tags = "@wip"
)
public class RunCucumberTest {
}
