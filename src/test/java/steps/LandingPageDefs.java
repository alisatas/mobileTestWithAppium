package steps;

import base.BaseTest;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Wait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.HomePage;
import pages.LandingPage;

import java.net.MalformedURLException;

public class LandingPageDefs extends BaseTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    LandingPage landingPage;
    HomePage homePage;

    @Given("Landing Page Start")
    public void landingPageStart() throws MalformedURLException {
        setUp();

    }

    @And("First Page Get Title {string}")
    public void firstPageGetTitle(String firstTitle) throws InterruptedException {
        Thread.sleep(2000);
        landingPage = new LandingPage(driver);
        landingPage.getTitlePage(landingPage.pageTitle, firstTitle);
    }

    @And("First Page Get Description {string}")
    public void firstPageGetDescription(String firstDesc) {
        landingPage.getTitlePage(landingPage.pageDetailText, firstDesc);
    }

    @When("First Page Skip Button")
    public void firstPageSkipButton() throws InterruptedException {
        landingPage.clickElement(landingPage.skipButton);
    }

    @Then("Go To Second Page Get Title {string}")
    public void goToSecondPageGetTitle(String secondTitle) {
        landingPage.getTitlePage(landingPage.pageTitle, secondTitle);
    }

    @And("Second Page Get Description {string}")
    public void secondPageGetDescription(String secondDesc) {
        landingPage.getTitlePage(landingPage.pageDetailText, secondDesc);
    }

    @When("Second Page Skip Button")
    public void secondPageSkipButton() throws InterruptedException {
        landingPage.clickElement(landingPage.skipButton);
    }

    @Then("Go To Third Page Get Title {string}")
    public void goToThirdPageGetTitle(String thirdTitle) {
        landingPage.getTitlePage(landingPage.pageTitle, thirdTitle);
    }

    @And("Third Page Get Description {string}")
    public void thirdPageGetDescription(String thirdDesc) {
        landingPage.getTitlePage(landingPage.pageDetailText, thirdDesc);
    }

    @When("Third Page Skip Button")
    public void thirdPageSkipButton() throws InterruptedException {
        landingPage.clickElement(landingPage.skipButton);
    }

    @And("Close Advertising")
    public void closeAdvertising() throws InterruptedException {
        Thread.sleep(3000);
        landingPage.clikCloseAdvertising();
        landingPage.tapCordinatesCloseAdvertising();
    }

    @Then("Go To Home Page")
    public void goToHomePage() {
        landingPage.implicitlyWait(2);
        homePage = new HomePage(driver);
        homePage.homePage();
    }

    @And("I expect {string} button is displayed")
    public void iExpectButtonIsDisplayed(String arg0) {
        landingPage.elementDisplayed(landingPage.skipButton,arg0);
    }
}
