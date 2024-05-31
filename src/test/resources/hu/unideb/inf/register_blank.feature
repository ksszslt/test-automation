Feature: Automationexercise user sign up

  Background:
    Given the home page is opened
    And the 'Signup / Login' link is clicked

  Scenario Outline: Registration attempt with blank fields
    Given the 'Signup name' field is filled with '<name>'
    And the 'Signup email' field is filled with '<email>'
    When the 'Signup' button is clicked
    Then the '<errorMessage>' error message is popped up
  Examples:
    | name  | email           | errorMessage                   |
    |       |                 | Kérjük, töltse ki ezt a mezőt. |
    | Zsolt |                 | Kérjük, töltse ki ezt a mezőt. |
    |       | zsolt2@email.hu | Kérjük, töltse ki ezt a mezőt. |