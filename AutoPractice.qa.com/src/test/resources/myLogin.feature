Feature: Login Page Test

  Scenario: As a user I want to login successfully
    Given user goes to Home Page
    And I see a logo banner
    And I click on Sign in button
    And I enter Login details
      |myemail                  |mypassword  |
      | davin.riches@gmail.com | Today01   |
      | escosolo7@gmail.com    | Ikeama78  |
      | switch146@gmail.com    | Escosolo7 |
    
    When I click  Login 
  #  Then I verify that  I am logged in successfully

   
 
    