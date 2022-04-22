package pages;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.logging.log4j.core.tools.Generate;
import org.openqa.selenium.*;
import org.testng.Assert;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static org.testng.AssertJUnit.assertTrue;
import utils.CustomLogger;

public class Page {
    protected AndroidDriver<MobileElement> driver;
    public static CustomLogger logger = new CustomLogger(Page.class);

    By skipButton = By.id("com.teknasyon.coloringbook:id/skipButton");
    By navBarHomePage = By.id("com.teknasyon.coloringbook:id/home");
    By navBarCategories = By.id("com.teknasyon.coloringbook:id/categories");
    By advertising1Close = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView");
    By advertising2Close = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView");

    public Page(AndroidDriver driver) {
        this.driver = driver;
    }

    public Page() {
    }

    public void getTitlePage(By element, String getValue) {
        String actualTitle = driver.findElement(element).getText();
        waitForVisibilityOfElement(actualTitle);
        //System.out.println("Title is: "+ actualTitle);
        logger.info("' " + actualTitle + " ' " + " ' " + getValue + " '" + " =>Element text");
        Assert.assertEquals(actualTitle,getValue);

    }

    public LandingPage clickSkipButton() {
        driver.findElement(skipButton).click();
        return new LandingPage(driver);
    }

    public HomePage navBarHomePage() {
        driver.findElement(navBarHomePage);
        return new HomePage(driver);
    }

    public CategoriesPage categoriesPage() {
        driver.findElement(navBarCategories);
        return new CategoriesPage(driver);
    }

    public MyStudiesPage myStudiesPage() {
        driver.findElement(navBarCategories);
        return new MyStudiesPage(driver);
    }

    public OtherPage otherPage() {
        driver.findElement(navBarCategories);
        return new OtherPage(driver);
    }

    public void clikCloseAdvertising() {
            driver.findElement(advertising1Close).click();
    }

    public void tapCordinatesCloseAdvertising() {
        List<MobileElement> dynamicElement = driver.findElements(advertising2Close);
        if (dynamicElement.size()!=0) {
            System.out.println("Element 2 present");
            tapElementCordinates(1013,68);
        } else {
            System.out.println("Element not present");
        }

    }

    public void tapElementCordinates(int x, int y) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(x, y))
                .perform();
    }

    public void clickElement(By element) throws InterruptedException {
        MobileElement element1 = driver.findElement(element);
        element1.click();
        Thread.sleep(1000);
    }

    public void sendText(By element, String text){
        MobileElement mobileElement=driver.findElement(element);
        mobileElement.sendKeys(text);
    }

    protected void waitForVisibilityOfElement(String a) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage){

        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        implicitlyWait(1);
        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

    public void implicitlyWait(int wait) {
        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
    }

    public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);
        new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }

    public void elementDisplayed(By element,String isDisplayed) {

        boolean isDisplayedElement = driver.findElement(element).isDisplayed();
        logger.info("' " + isDisplayed + " ' " + " ' " + isDisplayedElement + " '" + " => Is displayed element");
        assertTrue("' " + element + " ' " + " ' " + isDisplayedElement + " '" + " => Is displayed element", isDisplayedElement);
    }
}
