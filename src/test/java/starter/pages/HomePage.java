package starter.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {



    @AndroidFindBy(xpath="//*[@resource-id='com.abnamro.apps.referenceandroid:id/fragment']/android.widget.TextView")
    private WebElement homePageWelcomeMessage;

    @AndroidFindBy(xpath="//*[@resource-id='com.abnamro.apps.referenceandroid:id/toolbar']/android.widget.TextView")
    private WebElement homePageTitle;

    @AndroidFindBy(id="com.abnamro.apps.referenceandroid:id/fab")
    private WebElement mailIcon;

    @AndroidFindBy(id="com.abnamro.apps.referenceandroid:id/snackbar_text")
    private WebElement onClickMessage;

    public String getTextOnHomePage(){
        return homePageWelcomeMessage.getText();
    }

    public String getHomePageTitle(){
        return homePageTitle.getText();
    }

    public boolean checkMailIconExists(){
        return mailIcon.isDisplayed();
    }

    public void clickMailIcon(){
        mailIcon.click();
    }

    public String getOnClickMessageText(){
        return onClickMessage.getText();
    }


}
