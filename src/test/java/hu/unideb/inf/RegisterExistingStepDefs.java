package hu.unideb.inf;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterExistingStepDefs extends AbstractStepDefs {

    @Then("the {string} error message is shown")
    public void theErrorMessageIsShown(String errorMessage) {
        assertEquals(errorMessage, homePage.getSignupErrorMessage());
    }
}
