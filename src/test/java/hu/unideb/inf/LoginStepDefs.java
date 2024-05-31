package hu.unideb.inf;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepDefs extends AbstractStepDefs {

    @Then("the {string} text is visible")
    public void theLoggedInUserTextIsVisible(String loggedInUserText) {
        assertEquals(loggedInUserText, homePage.getLoggedInUserText());
    }
}
