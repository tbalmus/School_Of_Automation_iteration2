package com.demoqa.shop;

import org.openqa.selenium.WebDriver;

public class CreateNewUser {


    public CreateNewUser(WebDriver driver, String username, String email, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.field_username.sendKeys(username);
        loginPage.field_username.sendKeys(email);
        loginPage.field_username.sendKeys(password);
        // page.find_element_by_xpat(registerButton).click();
    }

}
