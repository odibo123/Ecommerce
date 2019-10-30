Feature: comparing two Product Test

 Scenario: To verify that user is able to compare two products
    Given user is on Home Page
    And user verify Home Page title
    When I click on  MOBILE link
    And user clicks on Add To Compare on IPhone link
    And user also clicks on Add To Compare on Samson Galaxy
    Then user clicks on Compare button
    #Then user verify selected products on for pop up window
    And user closes the Pop up window