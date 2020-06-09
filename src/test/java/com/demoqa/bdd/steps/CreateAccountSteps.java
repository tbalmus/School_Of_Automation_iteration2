package com.demoqa.bdd.steps;

import book_test.LogsMain;
import com.demoqa.shop.CreateNewUser;
import com.demoqa.shop.HomePage;
import com.demoqa.shop.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

public class CreateAccountSteps {

    WebDriver driver;
    LoginPage login;
    HomePage home;

    private final static Logger log = LoggerFactory.getLogger(LogsMain.class);


    @Given("homepage is loaded")
    public void homepageIsLoaded() {


        //Adding page objects

        log.info("This is accountLinkMenuIsClicked logger" + driver.getTitle());
    }

    @Given("account link menu is clicked")
    public void accountLinkMenuIsClicked() {

        HomePage home = new HomePage(driver);
        home.lnk_MyAccount.click();
       // assertTrue(Boolean.parseBoolean("My Account"),getPage().toString());
        assertEquals("My Account – ToolsQA Demo Site",driver.getTitle());
        log.info("Account Link was clicked. Account open page" );
    }

    @Given("my-account page is loaded")
    public void myAccountPageIsLoaded() {

        driver.getCurrentUrl();
        assertEquals("My Account – ToolsQA Demo Site",driver.getCurrentUrl());
        log.info("This is accountLinkMenuIsClicked logger" + driver.getCurrentUrl());


    }

    @Given("the username, email  and password are populated")
    public void theUsernameEmailAndPasswordArePopulated() {

       CreateNewUser user = new CreateNewUser(driver,"a3dr45e5277","a54r6n2@mail.ru","d4@5qwe12");
        log.info("This is account" + user.toString());
    }
    @Then("the register button is pressed")
    public void the_register_button_is_pressed() {
        log.info("This is accountLinkMenuIsClicked logger" );
        LoginPage login = new LoginPage(driver);
        login.button_register.isSelected();
        login.button_register.click();
        log.info("This is registry button click " );

        }

    @When("message  is displayed")
    public void messageIsDisplayed() {


        driver.getCurrentUrl();
 // and normalize-space(text()) = 'Your session has expired because it has been over 60 minutes since your last login. Please log back in to continue.']
        login.message_login.getText();

        log.info("This is accountLinkMenuIsClicked logger" + driver.getCurrentUrl());



    }

    @Then("account page is displayed")
    public void accountPageIsDisplayed() {
        driver.getTitle();
        log.info("This is Log In ‹ ToolsQA Demo Site — WordPress page = " + driver.getTitle());

    }

    @When("redf")
    public void redf() {
    }

    @Then("the username  and password are populated")
    public void theUsernameAndPasswordArePopulated() {
    }

    @And("the enter button is pressed")
    public void theEnterButtonIsPressed() {
    }

    @When("my-accounts page is loaded")
    public void myAccountsPageIsLoaded() {
    }

    @And("accounts page is displayed")
    public void accountsPageIsDisplayed() {
    }

    @When("error message  is displayed")
    public void errorMessageIsDisplayed() {
    }
}
