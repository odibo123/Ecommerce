Feature: SavedOrder Test

  Scenario: To verify that user is able to save previously order in a pdf file
    Given user is on Home Page
    And user verify Home Page title
    And user click on My Account link
    And user log in with previous created credentials
    And I click on My Orders
    And I click on view Order
    And I verify that the previously created Order is displayed in ORDER TABLE and status was  PENDING
    And I click on print Order link
