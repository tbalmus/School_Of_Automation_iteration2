package com.demoqa.bdd.hooks;

import book_test.LogsMain;
import com.automation.school.ad_main.com.demoqa.shop.factory.BrowserFactory;
import com.demoqa.shop.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalHooks {

    Logger log = LoggerFactory.getLogger(LogsMain.class);

    @Before(order =1)
    public void beforeScenario(){

        WebDriver driver = BrowserFactory.getBrowser("Firefox");
        driver.get("http://shop.demoqa.com/");
        driver.manage().window().maximize();
        HomePage home = new HomePage(driver);
        home.lnk_Dismiss.click();
    }

    @After(order =1)
    public void afterScenario(){
        WebDriver driver = BrowserFactory.getBrowser("Firefox");
        driver.close();



    }
        @BeforeEach
       public void beforeEachTest(TestInfo testInfo) {
            log.info( "Started executing [%s]" +
                    testInfo.getDisplayName());
        }

        @AfterEach
        public void afterEachTest(TestInfo testInfo) {
            log.info("Finished executing [%s]" +
                    testInfo.getDisplayName());
        }






    }

    





