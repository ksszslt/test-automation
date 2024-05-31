package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactUsStepDefs extends AbstractStepDefs {

    @When("the alert is accepted")
    public void theAlertIsAccepted() {
        homePage.acceptAlert();
    }

    @Then("the {string} success contact message is shown")
    public void theSuccessContactMessageIsShown(String successContactMessage) {
        assertEquals(successContactMessage, homePage.getSuccessContactMessage());
    }
}
