Feature: Puchase Product Application Test

  Scenario: To test user is able to purchase product using registered email id
    Given user is on Home Page
    And user verify Home Page title
    And user click on My Account link
    And user log in with previous created credentials
    #Then user click on Account
   # And user mouses over to on My Account
  # Then user clicks on create an account link
    And user click on my Wishlist link
   # And user clicks on added item wishlist
   Then user selects of the product Sony Xperia
    Then user click on Add To Cart link
    And user enter shipping informations
   # And user clicks on province
    And user types zip code
    Then user click on Estimate button
    
  ##  Then user confirm the price
 
    
   ## And user verify shipping cost that was generated
    
    Then user clicks on update total
  # # And user confirm shipping cost was added to total
    And user user clicks on proceed To Checkout
   # Then user clicks on Flat rate radio button
    Then user clicks on continue in billing page
   # Then user should see billing and shipping address
    #
    Then user click continue button on shipping page
    #Then user confims the grand total
    And user selects mode of payment
   # And user enters card payment details
   And user log into order page
    Then user click on Place Order
    And user confirm that order is placed
