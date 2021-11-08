package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;

import static org.junit.Assert.assertEquals;

public class ValidateOnClickMessageFunctionSteps {

    private HomePage homePage;

    @Step("Click on mail icon")
    public void clickOnMailIcon(){
        homePage.clickMailIcon();
    }

    @Step("Validate message shown on clicking")
    public void validateMessageShownOnClick(String onClickMessage){
        assertEquals(onClickMessage,homePage.getOnClickMessageText());

    }
}
