package testcases;


import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.testng.Arquillian;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Google;

@RunAsClient
public class GoogleTest extends Arquillian {

    @Page
    Google google;

    @Test(priority = 1)
    public void launchGoogle() {

        google.goTo();
        Assert.assertTrue(google.isAt());

    }
    @Test(priority = 4)
    public void canGoogleNavigate() {

        //Navigate - assert : TBD
       // google.getTopNavigation().gotoImages();
        google.getTopNavigation().gotoVideos();


    }


}
