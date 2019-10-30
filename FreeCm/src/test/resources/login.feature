Feature: Free CRM login feature

  Scenario Outline: Free CRM login Test Scenario
    Given User is already on login page
    And user click on login button
    And user clicks on classic crm button
    And user verify that title of login page is CRM PROM
    Then user enters "<username>" and "<password>"
    Then user enter username and password
    And user hit the login button
    And user land on the home page

    Examples: 
      | username      | password  |
      | christopodibo | Tkogl1979 |
     #| naveenk       | test@123  |
