package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LandingPage extends Page {

    public By skipButton = By.id("com.teknasyon.coloringbook:id/skipButton");
    public By pageTitle = By.id("com.teknasyon.coloringbook:id/headerText");
    public By pageDetailText = By.id("com.teknasyon.coloringbook:id/detailText");

    public LandingPage(AndroidDriver driver) {
        this.driver = driver;
    }




}
