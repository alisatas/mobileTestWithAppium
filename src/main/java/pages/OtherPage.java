package pages;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OtherPage extends Page {

    public By navBarOtherPage = By.id("com.teknasyon.coloringbook:id/others");
    public By concactUsButton = By.id("com.teknasyon.coloringbook:id/contactUsTextView");
    public By addMessageButton = By.id("com.teknasyon.coloringbook:id/action_add_new_ticket");
    public By writeToUsButton = By.id("com.teknasyon.coloringbook:id/pre_screen_button");
    public By topicField = By.id("com.teknasyon.coloringbook:id/dropdown");
    public By messageField = By.id("com.teknasyon.coloringbook:id/textarea_edit_text");
    public By submitButton = By.id("com.teknasyon.coloringbook:id/create_ticket_button");
    public By selectTopic = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");

    public By nameField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
    public By emailField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
    public By successMessage = By.id("com.teknasyon.coloringbook:id/success_screen_subtitle");

    public By appLanguageButton=By.id("com.teknasyon.coloringbook:id/languageText");
    public By englishLanguage=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[7]/android.widget.TextView");
    public By turkishLanguage=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[12]/android.widget.TextView");


    public By otherPageTitle = By.id("com.teknasyon.coloringbook:id/toolbarTitle");

    public OtherPage(AndroidDriver driver) {
        super(driver);
    }

    public void otherPageTitle(String title) {

        String acTitle = driver.findElement(otherPageTitle).getText();
        Assert.assertTrue(acTitle.contains(title));

    }
}
