package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PaintDetailPage extends Page{
    private AndroidDriver<MobileElement> driver;
    public PaintDetailPage(AndroidDriver driver) {
        super(driver);
    }
}
