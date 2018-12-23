package pages;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pageFragments.GoogleSearchNavigation;
import pageFragments.GoogleSearchResult;
import pageFragments.GoogleSearchSuggestions;
import pageFragments.GoogleSearchWidget;

public class Google {

    @Drone
    private WebDriver driver;

    @FindBy(xpath="//div[@class='RNNXgb']")
    private GoogleSearchWidget searchWidget;

    @FindBy(xpath="//div[@id='rcnt']")
    private GoogleSearchResult results;


    @FindBy(xpath="//div[@id='hdtb-msb']")
    private GoogleSearchNavigation googleSearchNavigation;

    @FindBy(xpath ="//div[@class='aajZCb]")
    private GoogleSearchSuggestions suggestions;


    public void goTo()
    {
        driver.get("https://www.google.com");
    }

    public boolean isAt() {
        System.out.println("Title "+driver.getTitle());
        return driver.getTitle().equals("Google");
    }

    public GoogleSearchWidget getSearchWidget() {
        return searchWidget;
    }

    public GoogleSearchResult getSearchResults() {
        return results;
    }

    public GoogleSearchNavigation getTopNavigation() {
        return googleSearchNavigation;
    }

    public GoogleSearchSuggestions getSuggestions() {
        return suggestions;
    }

}
