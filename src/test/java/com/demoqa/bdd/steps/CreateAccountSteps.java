package com.demoqa.bdd.steps;

import book_test.LogsMain;
import com.demoqa.shop.CreateNewUser;
import com.demoqa.shop.FirstPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.demoqa.shop.ControlDeclaration.registerButton;
import static junit.framework.TestCase.assertEquals;

public class CreateAccountSteps {

    WebDriver driver;
    FirstPage firstPage;
    private final static Logger log = LoggerFactory.getLogger(LogsMain.class);
    private WebDriver getWebDriver() {
        // File file = new File("src\\test\\resources\\WebDrivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
       // driver.get("http://shop.demoqa.com/");
        driver.get("http://shop.demoqa.com/");
        driver.manage().window().maximize();
        return driver;
    }
    private FirstPage getPage() {
        FirstPage firstPage = new FirstPage(driver);
        firstPage.waiter();
        return firstPage;

    }



    @Given("homepage is loaded")
    public void homepageIsLoaded() {
       driver = getWebDriver();

        //Adding page objects

        log.info("This is accountLinkMenuIsClicked logger" + driver.getTitle());
    }

    @Given("account link menu is clicked")
    public void accountLinkMenuIsClicked() {

        WebElement username = driver.findElement(By.className("woocommerce-store-notice__dismiss-link"));
        username.click();
        WebElement elMyAccount = getPage().find_element_by_xpat("//a[contains(text(),'My Account')]");
        elMyAccount.click();
       // assertTrue(Boolean.parseBoolean("My Account"),getPage().toString());
        assertEquals("My Account – ToolsQA Demo Site",driver.getTitle());
        log.info("Account Link was clicked. Account open page" );
    }

    @Given("my-account page is loaded")
    public void myAccountPageIsLoaded() {
        driver.getCurrentUrl();
        log.info("This is accountLinkMenuIsClicked logger" + driver.getCurrentUrl());


    }

    @Given("the username, email  and password are populated")
    public void theUsernameEmailAndPasswordArePopulated() {

       CreateNewUser user = new CreateNewUser(getPage(),"a3dr45e5277","a54r6n2@mail.ru","d4@5qwe12");
        log.info("This is account" + user.toString());
    }
    @Then("the register button is pressed")
    public void the_register_button_is_pressed() {
        log.info("This is accountLinkMenuIsClicked logger" );
        getPage().waiter();
       WebElement button = getPage().find_element_by_xpat(registerButton);

               button.isSelected();
                       button.click();
        log.info("This is "+ button+ "is clicked" );

        }

    @When("message  is displayed")
    public void messageIsDisplayed() {

        getPage().waiter();
        driver.getCurrentUrl();
 // and normalize-space(text()) = 'Your session has expired because it has been over 60 minutes since your last login. Please log back in to continue.']
        getPage().find_element_by_xpat("//p[@class='login message']");

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
