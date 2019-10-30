Feature: Contact us

  Scenario: To demonstrate l can successfully create contact us page
    Given I am on the Home Page
    When I click on Contact us button
    And I choose customer service
    And I enter my email address
    And I input a number in  the Order reference box
    When I type a message in the message field
    And I click on send text box
    Then I should be logged in successfully
