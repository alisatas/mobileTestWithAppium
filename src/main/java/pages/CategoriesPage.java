package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class CategoriesPage extends Page {
    public By categoriesTitle = By.id("com.teknasyon.coloringbook:id/toolbarTitle");
    public By navBarCategories = By.id("com.teknasyon.coloringbook:id/categories");
    public By backCategories = By.id("com.teknasyon.coloringbook:id/back");
    public By firstAnimalPicture = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView");

    public CategoriesPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void categoriesPageTitle() {

    }

}
