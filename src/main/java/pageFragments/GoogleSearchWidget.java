package pageFragments;

import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchWidget {


    @FindBy(xpath="//input[@name='q']")
    WebElement searchBox;

    @FindBy(xpath="//button[@class='Tg7LZd']")
    WebElement searchBtn;

    public void searchFor(String searchString) {
        searchBox.clear();

        //Google makes ajax calls during search
        int length = searchString.length();
        searchBox.sendKeys(searchString.substring(0, length - 1));
        Graphene.guardAjax(searchBox).sendKeys(searchString.substring(length - 1));
    }


    public void search() {
        Graphene.guardAjax(searchBtn).click();
    }
}
