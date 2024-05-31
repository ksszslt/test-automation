Feature: Automationexercise cart

  Background:
    Given the home page is opened

  Scenario: Remove product from cart
    Given the 'Products' link is clicked
    And the 'Search' field is filled with 'Regular Fit Straight Jeans'
    And the 'Search' button is clicked
    And the 'Add to cart (Search)' button is clicked
    And the 'Continue shopping' button is clicked
    And the 'Search' field is filled with 'Grunt Blue Slim Fit Jeans'
    And the 'Search' button is clicked
    And the 'Add to cart (Search)' button is clicked
    And the 'Continue shopping' button is clicked
    And the 'Cart' link is clicked
    And the 'Remove (Grunt Blue Slim Fit Jeans)' button is clicked
    And the 'Home' link is clicked
    And the 'Cart' link is clicked
    Then the 'Regular Fit Straight Jeans' product is in the cart
    But the 'Grunt Blue Slim Fit Jeans' product is not in the cart