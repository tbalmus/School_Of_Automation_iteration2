package com.demoqa.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@RunWith(Cucumber.class)
@CucumberOptions(
          plugin = {"pretty", "html:target/report", "json:target/cucumber.json", "com.demoqa.bdd.runners.TestEventHandlerPlugin"},

        features = {"src/test/resources/features"},

        glue = {"com.demoqa.bdd.hooks",
                "com.demoqa.bdd.steps"},
        tags = {"@Run"},
        strict = true,
        monochrome = true,
        stepNotifications = true)
public class RunCukeTest {


        @BeforeSuite
        public static void setUp() {
            // TODO: Add setup code
        }
        @AfterSuite(alwaysRun=true)
        public static void tearDown() {
            // TODO: Add tear down code

        }
}


