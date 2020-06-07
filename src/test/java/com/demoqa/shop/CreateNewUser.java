package com.demoqa.shop;

import org.openqa.selenium.WebElement;

import static com.demoqa.shop.ControlDeclaration.*;

public class CreateNewUser {
    private WebElement usernameFielde;
    private WebElement emailFielde;
    private  WebElement passwordFielde;
    private  WebElement accountRegisterButton;

    public CreateNewUser (FirstPage page, String username,String email, String password) {
        page.find_element_by_xpat(usernameField).sendKeys(username);
        page.find_element_by_xpat(emailField).sendKeys(email);
        page.find_element_by_xpat(passwordField).sendKeys(password);
       // page.find_element_by_xpat(registerButton).click();


    }

    @Override
    public String toString() {
        return "CreateNewUser{" +
                "usernameFielde=" + usernameFielde +
                ", emailFielde=" + emailFielde +
                ", passwordFielde=" + passwordFielde +
                '}';
    }
}
