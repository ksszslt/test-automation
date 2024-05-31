package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchStepDefs extends AbstractStepDefs {

    @Then("all displayed products match the search {string}")
    public void allDisplayedProductsMatchTheSearch(String criteria) {
        assertTrue(homePage.isTheProductListCorrect(criteria));
    }

    @When("the {string} title is visible")
    public void theSEARCHEDPRODUCTSTitleIsVisible(String title) {
        assertEquals(title, homePage.getSearchedProductsTitle());
    }
}
