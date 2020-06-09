package com.demoqa.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {


    final WebDriver driver ;
    @FindBy(how = How.XPATH, using = "//input[@id='reg_username']")
    public WebElement field_username;
    @FindBy(how = How.XPATH, using = "//input[@id='reg_email']")
    public WebElement field_email;
    @FindBy(how = How.XPATH, using = "//input[@id='reg_password']")
    public WebElement field_password;
    @FindBy(how = How.XPATH, using = "//button[@name='register']")
    public WebElement button_register;
    @FindBy(how = How.XPATH, using = "//p[@class='login message']")
    public WebElement message_login;



    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }


}
