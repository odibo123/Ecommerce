Feature: Automated End2End test
  
  Discription: The purpose of the feature is to test End 2 End integration

  Scenario Outline: Customer places an order by plurchasing an item from search
    Given user goes to Home Page
    And he clicks the search icon
    And I enter "<items>" in the input text field
    # And searches for "<description>" and "<item>" and "<price>"
    And chooses "<colour>" and "<size>"

    #And clicks on cart link
    #And user clicks proceed to checkout
    #And enters personal details "<firstname>" and "<lastname>"  and "<address>" and "<town>" and "<postcode>" and "<phone>"and "<email>"   on checkout Page
    #And place the order
    #Then user confirms seeing order details
    Examples: 
      | items | description | item  | price | colour           | size | firstname | lastname | address           | town       | postcode | phone       | email                   |
      | shoe  | shoe        | shoe  | shoes | nude             |   36 | chris     | ovie     | 3 orton buildings | london     | br1 4rd  | 07654323675 | hristophodibo@gmail.com |
      | shirt | shirt       | shirt | shirt | nude             |   37 | peter     | brown    | 4 horse road      | manchester | mn4 6yt  | 07564536754 | peter56@yahoo.com       |
      | dress | dress       | dress | dress | choose an option |   38 | john      | mike     | 34 calm st        | leiceste   | le10 8uh |  0765434556 | john67@hotmail.com      |
