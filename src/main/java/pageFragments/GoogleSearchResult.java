package pageFragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchResult {

    @FindBy(xpath="//h3[@class='LC20lb']")
    WebElement resultHeader;


    public String getResultHeader() {
        return resultHeader.getText();
    }

}
