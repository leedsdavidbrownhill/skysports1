package com.sky.sports;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", snippets = SnippetType.CAMELCASE, plugin = {
        "pretty", "html:target/cucumber-reports/html", "json:target/cucumber-reports/cucumber.json"}
)
public class RunCukesTest {
}

