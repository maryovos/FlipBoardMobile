//package testcases;
//
//import base.BaseTest;
//import net.serenitybdd.annotations.Managed;
//import net.serenitybdd.annotations.Steps;
//import net.serenitybdd.annotations.Title;
//import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
//import net.serenitybdd.junit.runners.SerenityRunner;
//import net.thucydides.junit.annotations.UseTestDataFrom;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.WebDriver;
//import steps.FlipboardSteps;
//import steps.SearchSteps;
//
//@RunWith(SerenityRunner.class)
//public class SearchItemTest extends BaseTest {
//
//
//    @Managed(driver = "appium")
//    public WebDriver driver;
//
//    @Steps
//    FlipboardSteps flipboardSteps;
//
//    @Steps
//    SearchSteps searchSteps;
//
//    @Title("Search Item in Search Box")
//    @Test
//    public void searchItemTest(){
//
//        flipboardSteps.clickGetStartedButton();
//        flipboardSteps.setChooseTopic(4);
//        flipboardSteps.clickContinue();
//        flipboardSteps.clickSkipLogin();
//        searchSteps.clickExploreMenu(2);
//        searchSteps.clickingOnSearchBox();
//        searchSteps.inputValueinSearchBox("Lion");
//        searchSteps.verifySearchText("lion");
//
//
//    }
//}
