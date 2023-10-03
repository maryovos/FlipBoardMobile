//package testcases;
//
//import base.BaseTest;
//import net.serenitybdd.annotations.Managed;
//import net.serenitybdd.annotations.Steps;
//import net.serenitybdd.annotations.Title;
//import net.serenitybdd.junit.runners.SerenityRunner;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.WebDriver;
//import steps.FlipboardSteps;
//
//@RunWith(SerenityRunner.class)
//public class SwipeTest extends BaseTest {
//
//    @Managed(driver = "appium")
//    public WebDriver driver;
//
//    @Steps
//    FlipboardSteps flipboardSteps;
//
//    @Title("Swaping Test")
//    @Test
//    public void searchItemTest(){
//
//        flipboardSteps.clickGetStartedButton();
//        flipboardSteps.setChooseTopic(4);
//        flipboardSteps.clickContinue();
//        flipboardSteps.clickSkipLogin();
//        try{
//            Thread.sleep(3000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        flipboardSteps.scrollUp(10);
//        try{
//            Thread.sleep(3000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        flipboardSteps.scrollDown(10);
//
//
//
//
//    }
//
//
//}
