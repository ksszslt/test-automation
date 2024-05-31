Feature: Automationexercise search products

  Background:
    Given the home page is opened
    And the 'Products' link is clicked

  Scenario: Search for products that match the condition
    Given the 'Search' field is filled with 'Green'
    And the 'Search' button is clicked
    When the 'SEARCHED PRODUCTS' title is visible
    Then all displayed products match the search 'green'