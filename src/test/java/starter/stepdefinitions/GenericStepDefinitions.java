package starter.stepdefinitions;

import io.cucumber.java.Before;
import net.thucydides.core.annotations.Steps;
import starter.steps.GenericSteps;

public class GenericStepDefinitions {

    @Steps
    GenericSteps genericSteps;

    @Before
    public void openTheApplication(){
        genericSteps.openApp();
    }


}
