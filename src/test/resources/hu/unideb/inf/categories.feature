Feature: Automationexercise categories

  Background:
    Given the home page is opened

  Scenario Outline: Showing products by categories
    Given the '<category>' category is opened
    And the '<subcategory>' subcategory is clicked
    When the '<category> > <subcategory>' path is visible
    Then the '<productType>' products are shown
    Examples:
      | category | subcategory | productType |
      | Women    | Dress       | dress       |
      | Women    | Tops        | top         |
      | Women    | Saree       | saree       |
      | Men      | Tshirts     | shirt       |
      | Men      | Jeans       | jeans       |
