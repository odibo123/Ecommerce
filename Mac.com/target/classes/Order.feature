Feature: Buying a MacBook Pro on the website
  
  As an online customer
  I want to choose a MacBook Pro with accessories on the website So that I can buy it online

  Scenario: A MacBook with accessories can be ordered on the website
    Given I go to the url
    And I click on Mac link
    And I also click on MacBook Pro Icon
    When I choose a MacBook Pro with the following features and accessories
      | Options         | Specifications       |
      | Screen          | 15''                 |
      | Processor       | 2.9GHz               |
      | Memory RAM      | 16GB                 |
      | Colour          | Silver               |
      | Software        | Logic Pro X          |
      | Display adapter | USB-C to USB Adapter |
    Then I can place an order for it
