package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaceOrderStepDefs extends AbstractStepDefs {

    @And("the {string} success order message is shown")
    public void theSuccessOrderMessageIsShown(String successOrderMessage) {
        assertEquals(successOrderMessage, homePage.getSuccessOrderMessage());
    }
}
