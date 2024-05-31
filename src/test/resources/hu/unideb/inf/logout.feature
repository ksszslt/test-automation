Feature: Automationexercise user logout

  Background:
    Given the home page is opened
    And the 'Signup / Login' link is clicked
    And the 'Login email' field is filled with 'zsolt@email.hu'
    And the 'Login password' field is filled with 'asdfg12345'
    And the 'Login' button is clicked

  Scenario: Logout of a logged in registered user
    When the 'Logout' link is clicked
    Then the current page url is 'https://automationexercise.com/login'
