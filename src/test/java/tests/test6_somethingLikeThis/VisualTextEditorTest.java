package tests.test6_somethingLikeThis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.ActivityStream;
import pages.LoginPage;
import tests.TestBase;
import utilities.Driver;

public class VisualTextEditorTest extends TestBase {

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
    public void visualEditorTest() throws InterruptedException {

        extentLogger = report.createTest("Visual Editor Test");

        extentLogger.info("Login as a Help Desk");
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpdesk();
        ActivityStream activityStream = new ActivityStream();

        extentLogger.info("navigating to visual editor");
        activityStream.navigateTo("More", "Appreciation");
        activityStream.visualEditorButton.click();


        extentLogger.info("verifying editor text bar is displayed");
        Assert.assertTrue(activityStream.editorTextBar.isDisplayed(), "verify that editor text bar visible");

        extentLogger.pass("PASS: Visual Editor Test");
    }
}
