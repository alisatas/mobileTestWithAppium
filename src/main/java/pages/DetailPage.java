package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class DetailPage extends Page {

    public By firstPicture= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView");
    public By firstColor=By.id("com.teknasyon.coloringbook:id/back1");
    public By doneButton=By.id("com.teknasyon.coloringbook:id/doneIcon");
    public By saveButton=By.id("com.teknasyon.coloringbook:id/save");

    public DetailPage(AndroidDriver driver) {
        this.driver = driver;
    }
}
