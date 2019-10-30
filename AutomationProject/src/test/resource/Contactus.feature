@ConTactUs
Feature: ContactUs

  Scenario Outline:   Scenario Outline: As a user I want to be contacted by the customer service
     Given user goes to Home Page
    When I click on Contact us link
    And I select Customer service
    And I input my "<email>"
    When I type a "<value>" as my order reference
    And I write my  "<message>" on the message box
    And I click on send button
    Then I should see a green tick verifying I can be contacted by custumer service

    Examples: 
      | email                    | value | message        |
      | davin.ricgches@gmail.com |     6 | I am ready     |
      #| Peter123@gmail.com       |    12 | please call me |
 

    #Examples: 
      #| email                    | value | message        |
      #| davin.ricgches@gmail.com |     6 | I am ready     |
      #| Peter123@gmail.com       |    12 | please call me |
