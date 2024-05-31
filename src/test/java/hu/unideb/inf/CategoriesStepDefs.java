package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CategoriesStepDefs extends AbstractStepDefs {

    @Given("the {string} category is opened")
    public void theCategoryCategoryIsOpened(String category) {
        homePage.clickCategory(category);
    }

    @When("the {string} subcategory is clicked")
    public void theSubcategorySubcategoryIsClicked(String subcategory) {
        homePage.clickSubcategory(subcategory);
    }

    @Then("the {string} products are shown")
    public void theProductsAreShown(String productType) {
        assertTrue(homePage.isTheProductListCorrect(productType));
    }

    @When("the {string} path is visible")
    public void theCategorySubcategoryPathIsVisible(String path) {
        assertEquals(path, homePage.getCategorySubcategoryPath());
    }
}
