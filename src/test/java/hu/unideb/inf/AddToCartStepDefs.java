package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddToCartStepDefs extends AbstractStepDefs {

    @Then("the {string} product is in the cart")
    public void theProductIsInTheCart(String productName) {
        assertTrue(homePage.isTheProductinTheCart(productName));
    }
}
