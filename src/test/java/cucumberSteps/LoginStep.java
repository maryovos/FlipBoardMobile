package cucumberSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.FlipboardSteps;

public class LoginStep {


    @Steps
    FlipboardSteps flipboardSteps;


    
    @Given("User navigate to first page")
    public void userNavigateToFirstPage() {

        flipboardSteps.alreadyOnFirstPage();

    }

    @And("User select get started")
    public void userSelectGetStarted() {
        flipboardSteps.clickGetStartedButton();
        
    }

    @And("User select {int} topics")
    public void userSelectTopics(int countTopics) {

        flipboardSteps.setChooseTopic(countTopics);
        
    }

    @And("User select continue")
    public void userSelectContinue() {

        flipboardSteps.clickContinue();
        
    }

    @When("User select skip login")
    public void userSelectSkipLogin() {

        flipboardSteps.clickSkipLogin();
        
    }

    @Then("User is already on the home page")
    public void userIsAlreadyOnTheHomePage() {

        flipboardSteps.alreadyOnHomePage();
    }
}
