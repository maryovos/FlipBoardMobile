package steps;

import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import screens.HomeScreen;
import screens.SearchScreen;

public class SearchSteps {

    SearchScreen searchScreen;

    HomeScreen homeScreen;

    @Step("Clicking on Explore menu")
    public void clickExploreMenu(Integer index){
        homeScreen.selectBottomPanel(index);
    }

    @Step("Clicking on Search Box")
    public void clickingOnSearchBox(){
        searchScreen.clickSearchBox();
    }

    @Step("Input Value in Search Box")
    public void inputValueinSearchBox(String text){
        searchScreen.inputSearchView(text);
    }

    @Step("Verify searched text {string}")
    public void verifySearchText(String text){
        Assert.assertTrue(searchScreen.verifySearchText(text));
    }

}
