package com.demoqa.shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
@BeforeClass
public static void beforeSuiteMethod() throws Exception {

        // browser selection is hard-coded

        System.err.println("os: " + osName);
        if (osName.startsWith("windows")) {
        driver = BrowserDriver.initialize(browser);
        } else if (osName.startsWith("mac")) {
        driver = BrowserDriver.initialize("safari");
        } else {
        driver = BrowserDriver.initialize("firefox");
        }
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, flexibleWait);
        wait.pollingEvery(pollingInterval, TimeUnit.MILLISECONDS);
        actions = new Actions(driver);
        }
        */
    public class FirstPage {

        private WebDriver driver;

        public FirstPage(WebDriver driver){
            PageFactory.initElements(driver, this);
            this.driver = driver;
        }

        public  WebElement find_element_by_xpat(String  xpath) {

            return this.driver.findElement(By.xpath(xpath)) ;

        }

          public void makeClick (String element){
              WebDriverWait wait = new WebDriverWait(FirstPage.this.driver, 10);
              WebElement el =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
               el.click();


          }

        public void waiter(){

            WebDriverWait waitForOne = new WebDriverWait(driver, 10000);
            waitForOne.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]")));
        }
    }




