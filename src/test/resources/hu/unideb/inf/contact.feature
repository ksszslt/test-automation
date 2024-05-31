Feature: Automationexercise contact

  Background:
    Given the home page is opened

  Scenario: Contact message sending attempt
    Given the 'Contact us' link is clicked
    And the 'Contact us name' field is filled with 'Zsolt'
    And the 'Contact us email' field is filled with 'zsolt@email.hu'
    And the 'Contact us subject' field is filled with 'This is a subject'
    And the 'Contact us message' field is filled with 'This is a message!'
    And the 'Submit' button is clicked
    When the alert is accepted
    Then the 'Success! Your details have been submitted successfully.' success contact message is shown