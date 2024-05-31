package hu.unideb.inf;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;

public class CommonStepDefs extends AbstractStepDefs {

    @BeforeAll
    public static void acceptCookies() {
        homePage.openPage();
        homePage.acceptCookies();
    }

    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @Given("the {string} field is filled with {string}")
    public void theFieldIsFilledWithText(String field, String text) {
        homePage.fillOutField(field, text);
    }

    @When("the {string} button is clicked")
    public void theButtonIsClicked(String button) { homePage.clickButton(button); }

    @When("the {string} link is clicked")
    public void theLinkIsClicked(String link) { homePage.clickLink(link); }

    @After
    public void logout() {
        try {
            homePage.clickLink("Logout");
        } catch(NoSuchElementException e) {}
    }

    @AfterAll
    public static void cleanUp() { homePage.closePage(); }

}
