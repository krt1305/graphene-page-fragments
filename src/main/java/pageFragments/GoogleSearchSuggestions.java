package pageFragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleSearchSuggestions {

    @FindBy(xpath="//div[@class='sbqs_c']")
    List<WebElement> suggestions;


    public int getCount() {
        return suggestions.size();
    }

    public void show() {
        for (WebElement s: suggestions)
            System.out.println(s.getText());
    }

}
