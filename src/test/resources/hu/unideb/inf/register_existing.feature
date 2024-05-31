Feature: Automationexercise user sign up

  Background:
    Given the home page is opened
    And the 'Signup / Login' link is clicked

  Scenario: Registration attempt with an existing email
    Given the 'Signup name' field is filled with 'Zsolt'
    And the 'Signup email' field is filled with 'zsolt@email.hu'
    When the 'Signup' button is clicked
    Then the 'Email Address already exist!' error message is shown