Feature: SignIn Test

  Scenario Outline: As a user I want to login successfully
    Given user is on Home Page
    And user click on Sign in link
    And user enters "<email>" and "<password>"
    And user clicks on the Sign in button
    Then user verify that he is logged in successfully
    And user sign out

    Examples: 
      | email                    | password  |
      | christophodibo@yahoo.com | Tkogl1979 |
     # | mike506@yahoo.com      | Today2   | 
     #| johnpeter@gmail.com     | Today3   |
