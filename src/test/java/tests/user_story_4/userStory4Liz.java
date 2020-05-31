package tests.user_story_4;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.BitrixActStrPage;
import pages.BitrixLoginPage;
import pages.BitrixPollPage;
import pages.DashboardPage;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;

public class userStory4Liz extends TestBase {

    @Test
    public void pollTab (){

        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginHelpdesk();

        new DashboardPage().navigateToModule("Activity Stream");

        BitrixActStrPage activityStream = new BitrixActStrPage();

        activityStream.poll.click();

    }

    @Test
    public void AC1UploadFiles() {

        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginHelpdesk();

        new DashboardPage().navigateToModule("Activity Stream");

        BitrixActStrPage activityStream = new BitrixActStrPage();
        activityStream.poll.click();

        BitrixPollPage bitrixPollPage = new BitrixPollPage();
        BrowserUtils.waitForVisibility(bitrixPollPage.uploadFileButton,5).click();









        }
    }



