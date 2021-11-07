package starter.steps;


import io.appium.java_client.AppiumDriver;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class GenericSteps {

    @Step("Opening the app")
    public void openApp(){

        ((AppiumDriver)((WebDriverFacade) getDriver()).getProxiedDriver()).activateApp("com.abnamro.apps.referenceandroid");

    }
}