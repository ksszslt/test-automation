Feature: Automationexercise cart

  Background:
    Given the home page is opened

  Scenario: Verify product quantity in cart
    Given the 'Products' link is clicked
    And the 'Search' field is filled with 'Regular Fit Straight Jeans'
    And the 'Search' button is clicked
    And the 'View product' link is clicked
    And the 'Quantity' field is filled with '6'
    And the 'Add to cart (Product details)' button is clicked
    And the 'Continue shopping' button is clicked
    When the 'Cart' link is clicked
    Then the quantity is 6 in the cart