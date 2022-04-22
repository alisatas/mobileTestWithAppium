package pages;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStudiesPage extends Page {

    public By myStudiesTitle = By.id("com.teknasyon.coloringbook:id/toolbarTitle");
    public By navBarMyStudies = By.id("com.teknasyon.coloringbook:id/myWork");
    public By startPaintingButton = By.id("com.teknasyon.coloringbook:id/startPainting");

    public MyStudiesPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void myStudiesPageTitle(By element, String myStTitle) {
        String acTitle = driver.findElement(element).getText();
        Assert.assertTrue(acTitle.contains(myStTitle));
    }
}
