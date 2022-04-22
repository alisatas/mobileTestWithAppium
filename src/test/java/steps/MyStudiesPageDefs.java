//package steps;
//
//import base.BaseTest;
//
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import pages.CategoriesPage;
//import pages.MyStudiesPage;
//import pages.Page;
//
//import java.net.MalformedURLException;
//
//public class MyStudiesPageDefs extends BaseTest {
//    MyStudiesPage myStudiesPage;
//    CategoriesPage categoriesPage;
//    Page page;
//
//
//
//    @Given("Go To My Studies Page")
//    public void goToMyStudiesPage( ) throws MalformedURLException, InterruptedException {
//        setUp();
//
//        myStudiesPage = new MyStudiesPage(driver);
//        page = new Page(driver);
//        page.implicitlyWait(3);
//        myStudiesPage.clikCloseAdvertising();
//
//        try {
//            myStudiesPage.clickElement(myStudiesPage.navBarMyStudies);
//        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Then("My Studies Page Get Title {string}")
//    public void myStudiesPageGetTitle(String title) {
//        myStudiesPage.myStudiesPageTitle(myStudiesPage.myStudiesTitle,title);
//    }
//
//    @Given("Click Start Painting Button")
//    public void clickStartPaintingButton() throws InterruptedException {
//        myStudiesPage.clickElement(myStudiesPage.startPaintingButton);
//    }
//
//    @Then("Go To Categories Page")
//    public void goToCategoriesPage() throws InterruptedException {
//        Thread.sleep(3000);
//        categoriesPage = new CategoriesPage(driver);
//        categoriesPage.categoriesPageTitle();
//    }
//
//
//}
