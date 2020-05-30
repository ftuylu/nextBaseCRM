package tests.test6_somethingLikeThis;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ActivityStream;
import pages.LoginPage;
import tests.TestBase;
import utilities.Driver;

import static utilities.Driver.*;

public class RecordVideoTest extends TestBase {

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
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpdesk();
        ActivityStream activityStream = new ActivityStream();


        extentLogger.info("navigating appreciation page and clicking video record button");
        activityStream.navigateTo("More", "Appreciation");
        activityStream.videoRecordButton.click();


        extentLogger.info("verifying topic video recording pop up is showed up");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("arguments[0].click()", activityStream.videoSettingAllowButton);



        extentLogger.info("verifiying popup is showed up");
        Assert.assertTrue(activityStream.videoSettingAllowButton.getText().equals("ALLOW"),"verify Device Access Button is 'ALLOW'");
        extentLogger.pass("PASS: Topic text box Test");
    }
}
