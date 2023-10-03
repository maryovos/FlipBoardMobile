package steps;

import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import screens.ChooseTopicScreen;
import screens.HomeScreen;
import screens.LoginScreen;

public class FlipboardSteps {

    LoginScreen loginScreen;

    HomeScreen homeScreen;
    ChooseTopicScreen chooseTopicScreen;


    public void clickGetStartedButton(){
        loginScreen.clickGetStartedButton();
    }


    public void setChooseTopic(int topicCount){
        chooseTopicScreen.chooseTopics(topicCount);
    }


    public void clickContinue(){
        chooseTopicScreen.clickContinue();
    }


    public void clickSkipLogin(){
        chooseTopicScreen.clickSkipLogin();
    }


    public void scrollUp (int count) {
        loginScreen.scrollUp(count);

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }


    public void scrollDown (int count){
        loginScreen.scrollDown(count);
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void alreadyOnFirstPage(){
        loginScreen.alreadyOnFirstPage();
    }



    public void alreadyOnHomePage(){


        Assert.assertTrue(homeScreen.verifyAlreadyOnHomePage("FOR YOU"));

    }







}
