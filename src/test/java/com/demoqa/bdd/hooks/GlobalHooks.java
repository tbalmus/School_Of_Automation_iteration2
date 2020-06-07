package com.demoqa.bdd.hooks;

import book_test.LogsMain;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalHooks {

    Logger log = LoggerFactory.getLogger(LogsMain.class);

    @Before(order =1)
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }

    @After(order =1)
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
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


  /*  @Before (order =1)
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }

    @After (order =1)
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
    public void beforeMethod(){

    }*/


