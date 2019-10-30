@Register
Feature: Register

  Scenario Outline: As a new user I want to open an account
    Given I am on Home Page
    When I click on Sign in button
    And I enter my new email address
    And I click on create account button
    And I click on male radio button
    And I type  firstname "<firstname>"
    And I enter lastname "<lastname>"
    And I enter a "<password>"
    And I select my date of Birth
    When I enter name of "<Company>"
    And I type a "<value>" as my company address
    And I enters company second "<addressLine>"
    Then I type company "<City>"
    And I select Company State
    And I type my state zip code with "<number>"
    Then I type my message into "<AdditionalInformation>" box
    And I type  "<HomePhone>" number
    And I insert "<MobilePhone>"
    And I add my "<address>"
    And I also click on Register button
    #    And I should see my name as proof I am registered successfully
    Then I verify that "<user>" is registered successfully
    And I close the browser

    Examples: 
      | firstname | lastname | password | Company | value | addressLine    | City        | number | AdditionalInformation | HomePhone   | MobilePhone | address      | user        |
      | mike      | great    | Today2   | Abc ltd |     5 | Green Suite    | Los Angeles |  90001 | None                  | 07491323879 | 07432123345 | 7 James Rd   | mike great  |
      | johns     | terry    | Today7   | XYZ Ltd |    67 | Queen Building | Miami       |  33101 | Expecting your calls  | 07765432124 | 07654321323 | 6 ince Road  | johns terry |
      | hunt      | peter    | Today45  | ECY Ltd |    69 | Grace building | Miami       |  32321 | waiting for action    | 07734325432 | 07976543212 | 4 Queen Road | hunt peter  |
