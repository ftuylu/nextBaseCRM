package tests.test6_somethingLikeThis;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ActivityStream;
import pages.LoginPage;
import tests.TestBase;

public class TopicTextBoxTest extends TestBase {

    /**
     * AC
     *8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
     *
     * Test case;
     * open chrome
     * go to https://login2.nextbasecrm.com
     * login as a Help Desk person
     * navigate to "More..." through "Appreciation" page and click to "Topic Text" button
     * Verify that Topic text box is displayed.
     *
     */

    @Test
    public void topicTextBoxTest() {

        extentLogger = report.createTest("Topic Test");

        extentLogger.info("Login as a Help Desk");
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpdesk();
        ActivityStream activityStream = new ActivityStream();

        extentLogger.info("navigating to topic button");
        activityStream.navigateTo("More", "Appreciation");
        activityStream.topicTextButton.click();


        extentLogger.info("verifying topic text box is displayed");
        Assert.assertTrue(activityStream.topicTextBox.isDisplayed(), "verify that topic text box visible");

        extentLogger.pass("PASS: Topic text box Test");
    }
}
