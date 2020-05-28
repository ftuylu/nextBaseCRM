package tests;

import org.testng.annotations.Test;
import pages.BitrixActStrPage;
import pages.BitrixLoginPage;
import pages.DashboardPage;

public class userStory4Liz extends TestBase {

    @Test
    public void pollTab (){

        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginHelpdesk();

        new DashboardPage().navigateToModule("Activity Stream");

        BitrixActStrPage activityStream = new BitrixActStrPage();

        activityStream.poll.click();






    }


}
