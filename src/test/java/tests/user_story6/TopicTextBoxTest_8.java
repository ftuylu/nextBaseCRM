package tests.user_story6;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MorePage;
import pages.BitrixLoginPage;
import tests.TestBase;

public class TopicTextBoxTest_8 extends TestBase {

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
        BitrixLoginPage loginPage = new BitrixLoginPage();
        loginPage.loginHelpdesk();
        MorePage MorePage = new MorePage();

        extentLogger.info("navigating to topic button");
        MorePage.navigateInMore( "Appreciation");
        MorePage.topicTextButton.click();


        extentLogger.info("verifying topic text box is displayed");
        Assert.assertTrue(MorePage.topicTextBox.isDisplayed(), "verify that topic text box visible");

        extentLogger.pass("PASS: Topic text box Test");
    }
}
