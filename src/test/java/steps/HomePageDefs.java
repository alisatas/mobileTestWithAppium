package steps;

import base.BaseTest;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import java.net.MalformedURLException;

public class HomePageDefs extends BaseTest {

    HomePage homePage;

    @Given("Home Page Start")
    public void homePageStart( ) throws MalformedURLException {
        setUp();

        homePage = new HomePage(driver);
        homePage.implicitlyWait(3);
        homePage.clikCloseAdvertising();
        homePage.tapCordinatesCloseAdvertising();
        homePage.homePage();

    }

    @And("Slider Image Click")
    public void sliderImageClick() {
        homePage.clickElement(homePage.sliderImage);
    }


    @Then("Page Swipe {string} {string} {string}")
    public void sliderDetailPageWithVerticalSwipe(double startPercentage, double endPercentage, double anchorPercentage) throws InterruptedException {
        homePage.implicitlyWait(0);
        homePage.verticalSwipeByPercentages(startPercentage,endPercentage,anchorPercentage);
    }

    @And("Click Picture")
    public void clickPicture() {
        homePage.implicitlyWait(3);
        homePage.clickElement(homePage.flowerDetailELement);
    }

    @And("Color Picture Detail")
    public void colorPictureDetail() throws InterruptedException {
        Thread.sleep(3000);
        assert driver.findElement(homePage.pictureDetail).isDisplayed() : "Picture Detail Success";
    }

    @And("Back To Categories Page")
    public void backToCategoriesPage() {
        homePage.implicitlyWait(2);
        homePage.clickElement(homePage.pictureDetailBackButton);

    }

    @Then("Back To Home Page")
    public void backToHomePage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickElement(homePage.backToHomePage);
    }

    @And("Home Page Vertical Swipe")
    public void homePageVerticalSwipe() throws InterruptedException {
        homePage.implicitlyWait(3);
        homePage.verticalSwipeByPercentages(0.9, 0.3, 0.5);
    }

    @And("Tap On Coordinates")
    public void tapOnCoordinates() {
        homePage.tapElementCordinates(800,450);
    }

    @Then("Open Picture Detail")
    public void openPictureDetail() throws InterruptedException {
        Thread.sleep(3000);
        assert driver.findElement(homePage.catPicure).isDisplayed():"Picture Detail Success";

    }
}
