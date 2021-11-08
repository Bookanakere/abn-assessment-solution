package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.GenericSteps;
import starter.steps.ValidateHomePageSteps;
import starter.steps.ValidateOnClickMessageFunctionSteps;

public class ValidateOnClickMessageStepDefinitions {

    @Steps
    GenericSteps genericSteps;

    @Steps
    ValidateHomePageSteps validateHomePageSteps;

    @Steps
    ValidateOnClickMessageFunctionSteps validateOnClickMessageFunctionSteps;

    @When("I click on the mail icon")
    public void iClickOnTheMailIcon() {
        validateOnClickMessageFunctionSteps.clickOnMailIcon();
        
    }

    @Then("I should see a notification message {string}")
    public void iShouldSeeANotificationMessage(String onClickMessage) {
        validateOnClickMessageFunctionSteps.validateMessageShownOnClick(onClickMessage);
    }
}
