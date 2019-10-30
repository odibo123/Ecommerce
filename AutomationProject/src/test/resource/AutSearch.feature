
Feature: Search Test

Background:
 Given user goes to Home Page
   And I see a logo banner
  Scenario: As a user I want to purchase a product successfully
   # Given user goes to Home Page
   #And I see a logo banner
   And i click on Search input field
   And I type dresses 
   And user mouses over blouse
   And user confirms seeing the dress in the product listing page
   And user chooses  the quantity
  # And user selects size
   And user choose the colour
   And user confirms the price 
   And user clicks on Add to cart text field
 And i confirm seeing product has been successfully added to your shopping cart
   And user click on proceed to checkout