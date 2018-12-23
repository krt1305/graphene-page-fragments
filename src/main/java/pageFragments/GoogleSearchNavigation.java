package pageFragments;

import org.jboss.arquillian.graphene.Graphene;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchNavigation {


    @FindBy(xpath="//a[contains(text(),'Images')]")
    WebElement imagesLink;

    @FindBy(xpath="//a[contains(text(),'Videos')]")
    WebElement videosLink;

    @FindBy(xpath="//a[contains(text(),'News')]")
    WebElement newsLink;

    @FindBy(xpath="//a[contains(text(),'Maps')]")
    WebElement mapsLink;

    @FindBy(xpath="//a[contains(text(),'More')]")
    WebElement moreLink;


    public void gotoImages()
    {
        imagesLink.click();
        Graphene.guardHttp(imagesLink);
    }

    public void gotoVideos()
    {
        videosLink.click();
        Graphene.guardHttp(videosLink);
    }

    public void gotoNews()
    {
        newsLink.click();
        Graphene.guardHttp(newsLink);
    }

    public void gotoMore()
    {
        moreLink.click();
        Graphene.guardHttp(moreLink);
    }



}
