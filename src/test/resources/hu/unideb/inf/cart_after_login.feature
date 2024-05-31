Feature: Automationexercise cart

  Background:
    Given the home page is opened

  Scenario: Verify cart after login
    Given the 'Products' link is clicked
    And the 'Search' field is filled with 'Regular Fit Straight Jeans'
    And the 'Search' button is clicked
    And the 'Add to cart (Search)' button is clicked
    And the 'Continue shopping' button is clicked
    And the 'Search' field is filled with 'Grunt Blue Slim Fit Jeans'
    And the 'Search' button is clicked
    And the 'Add to cart (Search)' button is clicked
    And the 'Continue shopping' button is clicked
    And the 'Signup / Login' link is clicked
    And the 'Login email' field is filled with 'zsolt@email.hu'
    And the 'Login password' field is filled with 'asdfg12345'
    And the 'Login' button is clicked
    When the 'Cart' link is clicked
    Then the 'Regular Fit Straight Jeans' product is in the cart
    And the 'Grunt Blue Slim Fit Jeans' product is in the cart
