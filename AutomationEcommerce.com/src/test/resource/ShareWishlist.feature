Feature: ShareWishlist  Test

  Scenario Outline: To test user should be able to sort product by their names
    Given user is on Home Page
    And user verify Home Page title
    And user click on My Account link
    Then user clicks on create an account link
    And user enters "<firstname>" and "<middlename>" and email and "<lastname>" and "<password>" and "<confirmPassword>"
    And user click on Register button
   Then "<IntendedUser>"  verifies that registration is done
    Then user clicks on TV Menu
    And user click on add product to  your wishlist
    Then user click on Share Wishlist
   ##    And user log in after entering neccessary information
    Then user enters his "<emailId>"
    And user types in a "<message>"
    Then user user clicks Share Wishlist
    And user confirms his Wishlist is shared

    Examples: 
    
      | firstname | middlename | lastname | password   | confirmPassword | IntendedUser        | emailId                   | message  |
      | peter     | c          | mikel    | mikel123   | mikel123        | peter c  mikel      | christophodiboo@yahoo.com | prepared |
      | michael   | d          | Jackson  | jackson123 | jackson123      | michael  d  Jackson | christophodibo@gmail.com  | ready    |

