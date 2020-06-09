@Run
@Before
Feature: User is not able to create account


  Background:
    Given homepage is loaded

  @After
  Scenario: create an account in Demoqa with not valid data
    And account link menu is clicked
    And my-account page is loaded
    Then the username, email  and password are populated
    And the register button is pressed
    When   error message  is displayed

