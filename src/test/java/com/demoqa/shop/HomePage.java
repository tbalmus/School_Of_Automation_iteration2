package com.demoqa.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    final WebDriver driver ;
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    private static WebElement element = null;
    @FindBy(how = How.CLASS_NAME, using = "woocommerce-store-notice__dismiss-link")
    public WebElement lnk_Dismiss;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'My Account')]")
    public WebElement lnk_MyAccount;

}
