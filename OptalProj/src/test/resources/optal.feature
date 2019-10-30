Feature: OptalApplication SigniN test

  Scenario Outline: To test I can sign into the application successfully
    Given I am on Optal homepage
    When I click on Sign in link
   # And I enter "<username>" in username input field
   # And I enter "<password>" in password text field
   # And I click the sign In link

    Examples: 
      | username | password        |
      | chris    | chris@gmail.com |
    #  | peter    | peter@yahoo.com |
