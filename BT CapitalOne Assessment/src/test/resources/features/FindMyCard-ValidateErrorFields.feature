@Regression @Test2
Feature: To check that error messages appear on page

  Background: Successfully launch the Capital One - Fill in your details page
    Given I open the demo application

  Scenario: User sees error message when mandatory fields are left blank

    When user submits the application
    And user clicks on find address button
    Then user will see error messages on the mandatory fields