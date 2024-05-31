package hu.unideb.inf;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveFromCartStepDefs extends AbstractStepDefs {

    @But("the {string} product is not in the cart")
    public void theProductIsNotInTheCart(String productName) {
        assertFalse(homePage.isTheProductinTheCart(productName));
    }
}
