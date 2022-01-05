@Regression @Test1
Feature: Happy path to check that application is submitted

  Background: Successfully launch the Capital One Fill in your details page
    Given I open the demo application

  Scenario: User successfully completes the application

    When user completes the about you section
      | title | firstName | lastName | day | month | year | emailAddress          | mobileNumber | homeNumber  |
      | Mr    | Sola      | Collins  | 10  | 12    | 1965 | sola_coll@yahoo.co.uk | 07985562323  | 01612365484 |
    And user completes the work and finance section
      | employmentStatus | occupation | grossIncome | otherIncome | noOfDependants | cashAdvance |
      | Employed         | Teacher    | 50000       | No          | 1              | No          |
    And user completes the where you live section
      | residentialStatus | rentMtgContribution | yearsAtAddress | postCode | myAddress                              |
      | Homeowner         | 200                 | 17             | M8 5XJ   | 14 Brightside Road, MANCHESTER, M8 5XJ |
    And user submits the application
    Then user will be taken to the results page
