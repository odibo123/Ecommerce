Feature: Free CRM Contact Scenario

  Scenario Outline: Free CRM Contact Test Scenario
    Given User is already on login page
    And user click on login button
    And user clicks on classic crm button
    And user verify that title of login page is CRM PRO
    Then user enters "<username>" and "<password>"
    And user hit the login button
    And user land on the home page
    And user moves to new contact page
    And user enter new "<firstname>" and "<lastname>" and "<position>"
    And I click on the save button
    And user verifies he is in new contact page
    Then user close the browser

    Examples: 
      | username       | password  | firstname   | lastname | position       |
      | christophodibo | Tkogl1979 | christopher | ovie     | Automation eng |
