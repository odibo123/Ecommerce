Feature: DLG Registration test

 Scenario: AS a user I want to check if I my vehicle details is displayed when  I enter a valid registration number
    Given I am on the HomePage
    And I validate my HomePage title
   When I enter my valid registration number
   And I click on the Find vehicle input box
    Then I should see  a result of my registration details
    
    
    Scenario Outline: To test that a user should see an error message when he attempts to register  incorrectly
   Given I am on the HomePage
    And I validate my HomePage title  
    When user enters his "<InvalidDetails>" in the enter reg input text box
    Then user clicks on find vehicle textbox
    Then user should see an "<ErrorMessage>" displayed
   
    
    Examples:
      | InvalidDetails | ErrorMessage                          |
      | UYTREYT        | Sorry record not found                |
      | j@jhy!         | Please enter a valid car registration |
       