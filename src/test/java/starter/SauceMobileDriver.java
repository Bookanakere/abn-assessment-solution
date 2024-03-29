package starter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceMobileDriver implements DriverSource {


    private final String URL = getSerenityPropertiesValues("starter.sauce.url");
    private String platformName = getSerenityPropertiesValues("starter.sauce.platformName");
    private String deviceName = getSerenityPropertiesValues("starter.sauce.deviceName");
    private String platformVersion = getSerenityPropertiesValues("starter.sauce.platformVersion");
    private String deviceOrientation = getSerenityPropertiesValues("starter.sauce.deviceOrientation");
    private String appiumVersion = getSerenityPropertiesValues("starter.sauce.appiumVersion");
    private String browserName = getSerenityPropertiesValues("starter.sauce.browserName");
    private String appFileName = getSerenityPropertiesValues("starter.sauce.appFileName");
    private WebDriver driver;
    private MutableCapabilities sauceOptions;
    private DesiredCapabilities capabilities;


    public String getSerenityPropertiesValues(String propertyName){
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        return variables.getProperty(propertyName);
    }

    @Override
    public WebDriver newDriver() {
        try {
                    sauceOptions = new MutableCapabilities();
                    sauceOptions.setCapability("name", "abn-automation-assessment-solution");
                    sauceOptions.setCapability("recordVideo","true");

                    capabilities = new DesiredCapabilities().android();
                    capabilities.setCapability("platformName", platformName);
                    capabilities.setCapability("deviceName", deviceName);
                    capabilities.setCapability("platformVersion", platformVersion);
                    capabilities.setCapability("deviceOrientation", deviceOrientation);
                    capabilities.setCapability("appiumVersion", appiumVersion);
                    capabilities.setCapability("browserName", browserName);
                    capabilities.setCapability("app", appFileName);
                    capabilities.setCapability("sauce:options", sauceOptions);
                    driver= new AndroidDriver<AndroidElement>(new URL(URL), capabilities);

            return driver;
        } catch (MalformedURLException e) {
            throw new Error(e);
        }
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
