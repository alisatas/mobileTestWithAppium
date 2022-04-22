package base;

import utils.CustomLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Links;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public static AndroidDriver<MobileElement> driver;
    protected static DesiredCapabilities caps;
    private static final CustomLogger customLogger = new CustomLogger(BaseTest.class);

    @BeforeTest
    public static void setUp() throws MalformedURLException {

        caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        //caps.setCapability("udid", "15efb925");
        caps.setCapability("platformVersion", "12");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "sdk_gphone64_arm64");
        //caps.setCapability("noReset", "True");
        //caps.setCapability("fullReset", "False");
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/app-release.apk");
        driver = new AndroidDriver(new URL(Links.appiumLocal), caps);

    }

    @AfterTest
    public static void tearDown() {

            driver.quit();

    }
}
