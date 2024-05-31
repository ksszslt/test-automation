Feature: Automationexercise order

  Background:
    Given the home page is opened

  Scenario: Attempt to place an order
    Given the 'Signup / Login' link is clicked
    And the 'Signup name' field is filled with 'Zsolt'
    And the 'Signup email' field is filled with 'zsolt3@email.hu'
    And the 'Signup' button is clicked
    And the 'Signup password' field is filled with 'asdfg12345'
    And the 'Signup first name' field is filled with 'Zsolt'
    And the 'Signup last name' field is filled with 'Kiss'
    And the 'Signup address' field is filled with 'Kossuth u. 888.'
    And as 'Signup country' 'Singapore' is selected
    And the 'Signup state' field is filled with 'State'
    And the 'Signup city' field is filled with 'City'
    And the 'Signup zipcode' field is filled with '8888'
    And the 'Signup mobile number' field is filled with '06888888888'
    And the 'Create Account' button is clicked
    And the 'ACCOUNT CREATED!' success signup message is shown
    And the 'Continue' button is clicked
    And the 'Products' link is clicked
    And the 'Search' field is filled with 'Regular Fit Straight Jeans'
    And the 'Search' button is clicked
    And the 'Add to cart (Search)' button is clicked
    And the 'Continue shopping' button is clicked
    And the 'Products' link is clicked
    And the 'Search' field is filled with 'Grunt Blue Slim Fit Jeans'
    And the 'Search' button is clicked
    And the 'Add to cart (Search)' button is clicked
    And the 'Continue shopping' button is clicked
    And the 'Cart' link is clicked
    And the 'Regular Fit Straight Jeans' product is in the cart
    And the 'Grunt Blue Slim Fit Jeans' product is in the cart
    And the 'Proceed To Checkout' button is clicked
    And the 'Place Order' button is clicked
    And the 'Name on card' field is filled with 'Zsolt'
    And the 'Card number' field is filled with '8888888888888888'
    And the 'CVC' field is filled with '888'
    And the 'Expiration month' field is filled with '08'
    And the 'Expiration year' field is filled with '88'
    And the 'Pay and Confirm Order' button is clicked
    And the 'ORDER PLACED!' success order message is shown
    And the 'Home' link is clicked
    When the 'Delete account' link is clicked
    Then the 'ACCOUNT DELETED!' success deletion message is shown
