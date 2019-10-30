Feature: Login

  Scenario: AS a user I want to check I can log in successfully when I enter a valid registration number
    Given I am on the HomePage
    When I enter my valid registration number
    And I click on the Find vehicle input box
    Then I should see  a result of my registration details

  Scenario: As a user I want to see an error message saying Please enter a valid car registration  when I enter special character along with the valid registration number
    Given I am on  the HomePage
    When I enter a special character along with valid registration number
    And I click on the Find vehicle input box
    Then i should see an error message saying Please enter a valid car registration

  Scenario: Given I am on the HomePage
    When I enter an invalid registration number
    And I click on the Find vehicle input box
    Then I should see a message saying Sorry record not found

  Scenario: Given I am on the HomePage
    When I do not enter my registration details
    And I click on the Find vehicle input box
    Then i should see an error message saying Please enter a valid car registration
