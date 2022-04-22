//package steps;
//
//import base.BaseTest;
//
//
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import pages.DetailPage;
//
//
//import java.net.MalformedURLException;
//
//public class DetailPageDefs extends BaseTest {
//
//    DetailPage detailPage;
//
//
//    @Given("Go To Home")
//    public void goToHome() throws MalformedURLException {
//        setUp();
//        detailPage = new DetailPage(driver);
//        detailPage.implicitlyWait(3);
//
//        detailPage.clikCloseAdvertising();
//        detailPage.tapCordinatesCloseAdvertising();
//    }
//
//    @And("Click Home Page First Picture")
//    public void clickHomePageFirstPicture() {
//        detailPage.clickElement(detailPage.firstPicture);
//
//    }
//
//    @And("Click First Color In Detail Picture Page")
//    public void clickFirstColorInDetailPicturePage() {
//        detailPage.clickElement(detailPage.firstColor);
//    }
//
//    @And("Click Done Button")
//    public void clickDoneButton() {
//        detailPage.clickElement(detailPage.doneButton);
//
//    }
//
//    @And("Save Button")
//    public void saveButton() {
//        detailPage.clickElement(detailPage.saveButton);
//    }
//
//
//}
