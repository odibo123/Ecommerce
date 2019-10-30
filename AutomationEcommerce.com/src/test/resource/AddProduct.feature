Feature: Add Product Test

  Scenario: To verify that user cannot add more product in cart than the product available in store
    Given user is on Home Page
    And user verify Home Page title
    When I click on  MOBILE link
    Then user click on Add To Cart button for Sony Xperia
    And user click on the quantity text box
    And user enters 1000 as quantity
    And user clicks on update button
    Then user should verify seeing an error message
    Then user should click on Empty Cart link in the footer of list of all mobile
    And user verify that the cart is empty
