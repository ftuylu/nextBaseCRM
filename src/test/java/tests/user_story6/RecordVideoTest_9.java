package tests.user_story6;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MorePage;
import pages.BitrixLoginPage;
import tests.TestBase;
import utilities.Driver;

public class RecordVideoTest_9 extends TestBase {

    /**
     * AC
     *9. User should be able to click on "Record Video" tab to record a video and attach it with the message.
     * Test case;
     * open chrome
     * go to https://login2.nextbasecrm.com
     * login as a Help Desk person
     * navigate to "More..." through "Appreciation" page and click to "Record Video Button" button
     * attach this file to a post
     * Verify that video file attached to the post.
     *
     */

    @Test
    public void topicTextBoxTest() {

        extentLogger = report.createTest("Video recording and sending test");

        extentLogger.info("Login as a Help Desk");
        BitrixLoginPage loginPage = new BitrixLoginPage();
        loginPage.loginHelpdesk();
        MorePage MorePage = new MorePage();


        extentLogger.info("navigating appreciation page and clicking video record button");
        MorePage.navigateInMore("Appreciation");
        MorePage.videoRecordButton.click();


        extentLogger.info("verifying topic video recording pop up is showed up");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("arguments[0].click()", MorePage.videoSettingAllowButton);



        extentLogger.info("verifiying popup is showed up");
        Assert.assertTrue(MorePage.videoSettingAllowButton.getText().equals("ALLOW"),"verify Device Access Button is 'ALLOW'");
        extentLogger.pass("PASS: Topic text box Test");
    }
}
