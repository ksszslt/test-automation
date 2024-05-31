Feature: Automationexercise account deletion

  Background:
    Given the home page is opened
    And the 'Signup / Login' link is clicked

  Scenario: Registration and deletion attempt
    Given the 'Signup name' field is filled with 'Zsolt'
    And the 'Signup email' field is filled with 'zsolt2@email.hu'
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
    When the 'Delete account' link is clicked
    Then the 'ACCOUNT DELETED!' success deletion message is shown
