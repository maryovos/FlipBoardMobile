package screens;

import base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchScreen extends ScreenBase {

    @AndroidFindBy(id = "flipboard.app:id/search_box_place_holder")
    private WebElement searchBox;

    @AndroidFindBy(id = "flipboard.app:id/search_view_input")
    private WebElement searchView;

    @AndroidFindBy(id = "flipboard.app:id/search_result_topic_tag")
    private WebElement searchTitleText;

    public void clickSearchBox(){

        searchBox.click();
    }

    public void inputSearchView(String text){
        waitFor(ExpectedConditions.elementToBeClickable(searchView));
        searchView.sendKeys(text);
        enter();
    }

    public boolean verifySearchText(String text){

        waitFor(searchTitleText);
        return searchTitleText.getText().toLowerCase().contains(text.toLowerCase());
    }

}
