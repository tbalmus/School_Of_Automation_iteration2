package com.demoqa.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
          plugin = {"pretty", "html:target/report", "json:target/cucumber.json"},

        features = {"src/test/resources/features"},

        glue = {"com.demoqa.bdd.hooks",
                "com.demoqa.bdd.steps"},
        tags = {"@Run"},
        strict = true,
        monochrome = true,
        stepNotifications = true)
public class RunCukeTest {
}
