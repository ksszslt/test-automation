package hu.unideb.inf;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterBlankStepDefs extends AbstractStepDefs {

    @Then("the {string} error message is popped up")
    public void theErrorMessageIsPoppedUp(String errorMessage) {
        assertEquals(errorMessage, homePage.getSignupPopupErrorMessage());
    }
}
