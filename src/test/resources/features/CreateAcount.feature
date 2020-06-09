@Run
@Before

@After
Feature: User able to create account and login in site


     Background:
     Given homepage is loaded


  Scenario: create an account
    And account link menu is clicked
    And my-account page is loaded
    When the username, email  and password are populated
    And the register button is pressed
    Then  message  is displayed
    And  account page is displayed


  Scenario: Login with account
    //And account link menu is clicked
    //And my-account page is loaded
    //Then the username  and password are populated
    ////And the enter button is pressed
    //When my-accounts page is loaded
    //And  accounts page is displayed


