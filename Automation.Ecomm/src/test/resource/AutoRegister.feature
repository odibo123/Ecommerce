@AutoRegister
Feature: Register Test

  Scenario Outline: As a user I want to Register successfully
    Given I go to Home Page
    And I click on Sign in link
    And I enters "<myEmail>" email address
    And user click on create account button
    And user click on female radio button
    And user types  firstname "<firstname>"
    And user enters lastname "<lastname>"
    And user enter a "<password>"
    And user select my date of Birth
    When user enter address
    And user enter city
    And user enters state
    Then user types postal code
    And user enters country
    And user enters mobile number
    And user enter an address
    And user click on Register button
    And I should see my name as proof I am registered successfully
   # Then user verify that "<user>" is registered successfully
    And I close the browser

    Examples: 
      | myEmail          | firstname | lastname | password |
      | sarah@gmail.com  | sarah     | peters   | Today1   |
      | mary2@gmail.com  | mary      | white    | Today1   |
      | vivian@gmail.com | vivian    | Grace    | Today1   |
