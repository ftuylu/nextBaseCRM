package tests.user_story_4;

import org.testng.annotations.Test;
import pages.BitrixActStrPage;
import pages.BitrixLoginPage;
import pages.DashboardPage;
import tests.TestBase;

public class userStory4Liz extends TestBase {

    @Test
    public void pollTab (){

        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginHelpdesk();

        new DashboardPage().navigateToModule("Activity Stream");

        BitrixActStrPage activityStream = new BitrixActStrPage();

        //activityStream.poll.click();








    }


}
