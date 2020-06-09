package com.automation.school.ad_main.com.demoqa.shop.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {

    private static Map<String, WebDriver> drivers = new HashMap<>();

    /*
     * Factory method for getting browsers
     */
    public static WebDriver getBrowser(String browserName) {
        WebDriver driver = null;

        switch (browserName) {
            case "Firefox":
                driver = drivers.get("Firefox");
                if (driver == null) {
                    System.setProperty("webdriver.gecko.driver",
                            "src\\test\\resources\\WebDrivers\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    drivers.put("Firefox", driver);
                }
                break;

            case "Chrome":
                driver = drivers.get("Chrome");
                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver",
                            "src\\test\\resources\\WebDrivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    drivers.put("Chrome", driver);
                }
                break;
        }
        return driver;
    }

    public static void closeDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            drivers.get(key).quit();
        }
    }
}

