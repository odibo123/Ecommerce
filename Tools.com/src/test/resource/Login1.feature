@Login1
Feature: Automated End2End test
  
  Discription: The purpose of the feature is to test End 2 End integration

  Scenario Outline: Customer places an order by plurchasing an item from search
    # Given user open Googlechrome and start application
    Given user goes to Home Page
    And he clicks the search icon
    When I search for shoes in the search input box
    Then I see "search description" and "price"  and "item"
    #And he searches for "dress"
    And chooses to buy the first item
    And moves to checkout from mini cart
    And enters personal details on checkout Page
    And select same delivery address
    And select payment method as check
    And place the order

    Examples: 
      | description                        | price   |item|
      | NUDE CLEAR ANKLE STRAP COURT SHOES | £52     |first item    |
                       | 
