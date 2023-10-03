package screens;

import base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginScreen extends ScreenBase {



    @AndroidFindBy(id = "flipboard.app:id/icon_button_text")
    private WebElement getStartedButton;


    public void alreadyOnFirstPage(){
        waitFor(ExpectedConditions.elementToBeClickable(getStartedButton));
    }


    public void clickGetStartedButton(){
            getStartedButton.click();
    }



}
