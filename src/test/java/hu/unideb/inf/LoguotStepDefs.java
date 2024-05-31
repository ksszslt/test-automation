package hu.unideb.inf;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoguotStepDefs extends AbstractStepDefs {

    @Then("the current page url is {string}")
    public void theCurrentPageUrlIs(String url) {
        assertEquals(url, homePage.getCurrentPageUrl());
    }

}
