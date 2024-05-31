package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountDeletionStepDefs extends AbstractStepDefs {

    @Given("as {string} {string} is selected")
    public void asIsSelected(String selectBox, String country) {
        homePage.selectOption(selectBox, country);
    }

    @Given("the {string} success signup message is shown")
    public void theSuccessSignupMessageIsShown(String successSignupMessage) {
        assertEquals(successSignupMessage, homePage.getSuccessSignupMessage());
    }

    @Then("the {string} success deletion message is shown")
    public void theSuccessDeletionMessageIsShown(String successSignupMessage) {
        assertEquals(successSignupMessage, homePage.getSuccessDeletionMessage());
    }
}
