package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class HomePage extends Page {

    public By navBarHomePage = By.id("com.teknasyon.coloringbook:id/home");
    public By sliderImage = By.id("com.teknasyon.coloringbook:id/sliderImage");
    public By pictureDetailBackButton = By.id("com.teknasyon.coloringbook:id/back");
    public By pictureDetail = By.id("com.teknasyon.coloringbook:id/colorImageView");
    public By backToHomePage = By.id("com.teknasyon.coloringbook:id/backButton");
    public By catPicure = By.id("com.teknasyon.coloringbook:id/colorImageView");
    public By flowerDetailELement = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.ImageView");
    public By skipButton = By.id("com.teknasyon.coloringbook:id/skipButton");

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void homePage() {
        assert driver.findElement(navBarHomePage).isDisplayed() : "Home Page Loaded Success";
    }


}
