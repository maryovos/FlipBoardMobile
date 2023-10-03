package screens;

import base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomeScreen extends ScreenBase {


    @AndroidFindBy(id = "flipboard.app:id/bottom_nav_view_icon")
    public List<WebElement> bottomNavigation;



    public void selectBottomPanel(Integer index){

        bottomNavigation.get(index).click();

    }

    public boolean verifyAlreadyOnHomePage(String title){

        String titleActual = titleEachMenu.get(0).getText().toLowerCase();
        String titleExpected = title.toLowerCase();

        return waitFor(ExpectedConditions.textToBePresentInElement(titleEachMenu.get(0),title.toUpperCase()));

    }

}
