package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ValidateHomePageSteps {

    private HomePage homePage;

    @Step("Verify test on home page")
    public void verifyTextOnHomePage(String textOnHomePage){
        assertEquals(textOnHomePage, homePage.getTextOnHomePage());
    }

    @Step("Validate title on the homepage screen")
    public void validateHomePageTitle(String homePageTitle){
        assertEquals(homePageTitle, homePage.getHomePageTitle());
    }

    @Step("Validate mail icon exists on the homepage screen")
    public void validateMailIconExistsOnHomePage(){
        assertTrue(homePage.checkMailIconExists());
    }
}