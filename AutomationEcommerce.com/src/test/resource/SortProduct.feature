Feature: GuruBank Product Sorting Test

  Scenario: To test user should be able to sort product by their names
    Given user is on Home Page
    # And user sees a Logo banner
    And user verify Home Page title
    When I click on  MOBILE link
    Then user verify seeing  mobile title
    Then user select name in SORTBY dropdown menu
    Then user verify all three products are sorted by name
