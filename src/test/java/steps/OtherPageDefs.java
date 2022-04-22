//package steps;
//
//import base.BaseTest;
//
//
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.testng.Assert;
//import pages.OtherPage;
//
//import java.net.MalformedURLException;
//
//public class OtherPageDefs extends BaseTest {
//    OtherPage otherPage;
//
//
//    @Given("Go To Other Page")
//    public void goToOtherPage( ) throws MalformedURLException {
//        setUp();
//        otherPage = new OtherPage(driver);
//
//
//        otherPage.clikCloseAdvertising();
//        otherPage.tapCordinatesCloseAdvertising();
//
//        otherPage.implicitlyWait(3);
//        otherPage.clickElement(otherPage.navBarOtherPage);
//
//    }
//
//    @Given("Other Page Get Title {string}")
//    public void categoriesPage(String categoriesTitle) {
//       otherPage.getTitlePage(otherPage.otherPageTitle,categoriesTitle);
//    }
//
//    @And("Click Contact Us Button")
//    public void clickContactUsButton() {
//        otherPage.clickElement(otherPage.concactUsButton);
//    }
//
//    @Then("Open Contact Us Page")
//    public void addContactUsPage() {
//        otherPage.clickElement(otherPage.addMessageButton);
//    }
//
//    @And("Click Write To Us Button")
//    public void clickWriteToUsButton() {
//        otherPage.implicitlyWait(2);
//        otherPage.clickElement(otherPage.writeToUsButton);
//    }
//
//    @And("Name Field is Filled {string}")
//    public void nameFieldIsFilled(String userName) {
//        otherPage.implicitlyWait(2);
//        otherPage.sendText(otherPage.nameField,userName);
//    }
//
//    @And("Email Field is Filled {string}")
//    public void emailFieldIsFilled(String email) {
//        otherPage.sendText(otherPage.emailField, email);
//    }
//
//    @And("Topic is Selected")
//    public void topicIsSelected() throws InterruptedException {
//        otherPage.clickElement(otherPage.topicField);
//        Thread.sleep(3000);
//        otherPage.clickElement(otherPage.selectTopic);
//    }
//
//    @And("Write To Message {string}")
//    public void writeToMessage(String message) {
//        otherPage.sendText(otherPage.messageField, message);
//    }
//
//
//    @And("Screen Down Swipe")
//    public void screenDownSwipe() throws InterruptedException {
//        otherPage.verticalSwipeByPercentages(0.5, 0.3, 0.5);
//    }
//
//    @And("Click Submit Button")
//    public void clickSubmitButton() {
//        otherPage.clickElement(otherPage.submitButton);
//    }
//
//    @Then("Send Message Successfully {string}")
//    public void sendMessageSuccessfully(String senMessageText) {
//        String actualText = driver.findElement(otherPage.successMessage).getText();
//        Assert.assertTrue(actualText.contains(senMessageText));
//
//    }
//
//    @And("Click App Language Button")
//    public void clickAppLanguageButton() {
//        otherPage.implicitlyWait(2);
//        otherPage.clickElement(otherPage.appLanguageButton);
//    }
//
//    @And("Select English")
//    public void selectEnglish() {
//        otherPage.clickElement(otherPage.englishLanguage);
//    }
//
//    @Then("Change App Language English")
//    public void changeAppLanguageEnglish() {
//        otherPage.implicitlyWait(2);
//        String actualtext=driver.findElement(otherPage.appLanguageButton).getText();
//        Assert.assertTrue(actualtext.contains("English"));
//    }
//
//    @And("Second Click App Language Button")
//    public void secondClickAppLanguageButton() {
//        otherPage.clickElement(otherPage.appLanguageButton);
//    }
//
//    @And("List Vertical Swipe")
//    public void listVerticalSwipe() throws InterruptedException {
//        Thread.sleep(3000);
//        otherPage.verticalSwipeByPercentages(0.9, 0.1, 0.5);
//
//    }
//
//    @And("Select Turkish")
//    public void selectTurkish() throws InterruptedException {
//        Thread.sleep(3000);
//        otherPage.clickElement(otherPage.turkishLanguage);
//
//    }
//
//    @Then("Change App Language Turkish")
//    public void changeAppLanguageTurkish() {
//        otherPage.implicitlyWait(2);
//        String actualtext=driver.findElement(otherPage.appLanguageButton).getText();
//        Assert.assertTrue(actualtext.contains("Türkçe"));
//    }
//
//
//    @Then("^Categories Page Get Title $")
//    public void categoriesPageGetTitleTitle() {
//
//    }
//}
