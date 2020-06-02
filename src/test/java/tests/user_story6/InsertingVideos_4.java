package tests.user_story6;

import org.testng.annotations.Test;
import pages.BitrixAppreciationPage;
import pages.BitrixPollPage;
import tests.TestBase;
import utilities.BrowserUtils;

public class InsertingVideos_4 extends TestBase {

    @Test
    public void insertVideos(){
        BitrixAppreciationPage appreciationPage=new BitrixAppreciationPage();
        appreciationPage.navigateToAppreciation();
        BrowserUtils.waitFor(2);

        BitrixPollPage bitrixPollPage = new BitrixPollPage();
        BrowserUtils.waitForVisibility(bitrixPollPage.videoIcon, 5).click();

        String videoUrl ="https://www.youtube.com/watch?v=uzfFItqjEis";

        BrowserUtils.waitForVisibility(bitrixPollPage.videoUrlBox, 5).sendKeys(videoUrl);
        BrowserUtils.waitFor(5);
        bitrixPollPage.linkTextBoxSaveButton.click();
        BrowserUtils.waitFor(3);

        appreciationPage.sendButton.click();
    }
}
