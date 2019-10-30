Feature: Compare Product Test

  Scenario: To compare and verify that the product page in list and detail page are equal
    Given user is on Home Page
    And user verify Home Page title
    When I click on  MOBILE link
    Then user reads the cost of Sony Xperia
    And user clicks on Sony Xperia mobile
    Then user confirm he is on Sony Xperia mobile Page
    Then user confirm the price of Sony Xperia in Sony Xperia mobile Page is $100