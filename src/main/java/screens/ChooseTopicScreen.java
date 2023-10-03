package screens;

import base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChooseTopicScreen extends ScreenBase {



    @AndroidFindBy(id = "flipboard.app:id/topic_picker_topic_row_topic_tag")
    private List<WebElement> listTopics;

    @AndroidFindBy(id = "flipboard.app:id/topic_picker_continue_button")
    private WebElement continueButton;

    @AndroidFindBy(id = "flipboard.app:id/icon_button_text")
    private WebElement skipLoginButton;


    public void chooseTopics(int topicsCount){

        for (int i = 0 ; i < topicsCount; i++ ){
            listTopics.get(i).click();
        }
    }

    public void clickContinue(){
        continueButton.click();
    }

    public void clickSkipLogin(){
        skipLoginButton.click();
    }

}
