package com.nhsbsa;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
        //"pretty",
        "html:target/cucumber-html-report",
        "json:target/cucumber-report.json",
        "junit:target/cucumber-report.xml"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources",
        glue = "com.nhsbsa.stepdefinitions",
        tags = "@wip"

)

public class RunCucumberTest {
}
