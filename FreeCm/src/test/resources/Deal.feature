Feature: Free CRM Deal feature

  Scenario Outline: Free CRM deal Test Scenario
    Given User is already on login page
   And user click on login button
    And user clicks on classic crm button
   And user verify that title of login page is CRM PROM
    Then user enters "<username>" and "<password>"
    Then user enter username and password
    And user hit the login button
    And user land on the home page
    And user moves to a new deal page
    And user types new "<Title>" and "<Amount>" and "<Probability>"  and  "<Commision>"
    And I click on the save button
   And I verify that I am on a new deal page
  Then user close the browser

   Examples: 
     | password | username         | Title  | Amount      | Probability | Commision |  
    # | Tkogl1979| christopodibo    | Mr     |   5000      |          20 |        50 |  
