package hu.unideb.inf;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityInCartStepDefs extends AbstractStepDefs {

    @Then("the quantity is {int} in the cart")
    public void theProductIsInTheCart(int quantity) {
        assertEquals(quantity, homePage.getQuantityInTheCart());
    }
}
