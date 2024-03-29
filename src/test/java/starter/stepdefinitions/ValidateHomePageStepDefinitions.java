package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.steps.GenericSteps;
import starter.steps.ValidateHomePageSteps;

public class ValidateHomePageStepDefinitions {


    @Steps
    ValidateHomePageSteps validateHomePageSteps;


    @Given("the app is open on the android device")
    public void the_app_is_open_on_the_android_device() {
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String textOnHomePage) {
        validateHomePageSteps.verifyTextOnHomePage(textOnHomePage);

    }

    @Then("I should see the title {string}")
    public void iShouldSeeTheTitle(String homePageTitle) {

        validateHomePageSteps.validateHomePageTitle(homePageTitle);
    }

    @Then("I should see the mail icon on the homepage")
    public void iShouldSeeTheMailIconOnTheHomepage() {
        validateHomePageSteps.validateMailIconExistsOnHomePage();
    }
}
