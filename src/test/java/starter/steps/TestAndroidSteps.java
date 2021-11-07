package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.TestAndroidPage;

import static org.junit.Assert.assertEquals;

public class TestAndroidSteps {

    private TestAndroidPage testAndroidPage;

    @Step("Verify test on home page")
    public void verifyTextOnHomePage(String textOnHomePage){
        assertEquals(textOnHomePage, testAndroidPage.getTextOnHomePage());
    }

    @Step("Validate title on the homepage screen")
    public void validateHomePageTitle(String homePageTitle){
        assertEquals(homePageTitle, testAndroidPage.getHomePageTitle());
    }
}