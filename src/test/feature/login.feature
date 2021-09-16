@Test
Feature: Login

  Background:
    Given user is on the home page
    And user clicks on login button
    Then user should be on the login page

  Scenario: User should be able to login successfully with valid credentials
    When user enters email as "vicky_sturd@hotmail.com" and password as "Vivek321"
    And user clicks Sign in button
    Then user should be logged in