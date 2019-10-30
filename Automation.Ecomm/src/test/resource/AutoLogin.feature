@AutoLogin
Feature: SignIn Test

  Scenario Outline: As a user I want to login successfully
    Given user is on Home Page
    And I click on Sign in link
    And I enter my "<email>" in the email  address field
    And I enter my password "<password>"
    When I click on Login button
    Then I verify that  I am logged in successfully
    And I sign out

    Examples: 
      | email                  | password |  
      | davin.riches@gmail.com | Today01  |
     # | mike506@yahoo.com      | Today2   | 
     #| johnpeter@gmail.com     | Today3   |
