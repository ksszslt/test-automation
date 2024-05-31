Feature: Automationexercise user login

  Background:
    Given the home page is opened
    And the 'Signup / Login' link is clicked

    Scenario: Correct login attempt
      Given the 'Login email' field is filled with 'zsolt@email.hu'
      And the 'Login password' field is filled with 'asdfg12345'
      When the 'Login' button is clicked
      Then the 'Logged in as Zsolt' text is visible