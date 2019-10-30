Feature: Red Wine Test

  Scenario: As a user I want to  purchase Red wine
    Given user goes to Home Page
    And user mouser over and clicks on Red Wine
    And I confirm I am on page that displays Red Wine
    And I click on star rating
    And I click on colour and grape and region
    And I click on a choice wine
    And I should be able to see my wine
    And I increase the quantity
    And I click add 6 bottles
    And I click add to basket
  #  And I click view basket
  And I click  checkout
    Then I should see your shopping basket
    And I confirm the total price
    And I click checkout securedly
    Then I should be in my checkout page
    And I enter my email address
    And I also choose password option 
    And I click continue button
    And 
    
    
