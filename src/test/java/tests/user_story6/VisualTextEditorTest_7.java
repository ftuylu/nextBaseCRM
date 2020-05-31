package tests.user_story6;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MorePage;
import pages.BitrixLoginPage;
import tests.TestBase;

public class VisualTextEditorTest_7 extends TestBase {

    /**
     * AC
     *7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
     *
     * Test case;
     * open chrome
     * go to https://login2.nextbasecrm.com
     * login as a Help Desk person
     * navigate to "More..." through "Appreciation" page and click to "Visual editor" button
     * Verify that text editor text bar is displayed.
     *
     */

    @Test
    public void visualEditorTest() {

        extentLogger = report.createTest("Visual Editor Test");

        extentLogger.info("Login as a Help Desk");
        BitrixLoginPage loginPage = new BitrixLoginPage();
        loginPage.loginHelpdesk();
        MorePage MorePage = new MorePage();

        extentLogger.info("navigating to visual editor");
        MorePage.navigateInMore( "Appreciation");
        MorePage.visualEditorButton.click();


        extentLogger.info("verifying editor text bar is displayed");
        Assert.assertTrue(MorePage.editorTextBar.isDisplayed(), "verify that editor text bar visible");

        extentLogger.pass("PASS: Visual Editor Test");
    }
}
