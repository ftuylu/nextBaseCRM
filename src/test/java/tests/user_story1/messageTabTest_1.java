package tests.user_story1;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;

//  abdullah      2. User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
//  abdullah    3. User should be able to attach link by clicking on the link icon.
//  abd.       4. User should be able to insert videos by clicking on the video icon and entering the video URL.
//  ahm      6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
//  ahm       9. User should be able to click on ""Record Video"" tab to record a video and attach it with the message."

public class messageTabTest_1 extends TestBase {

    //       "1. User should be able to click on upload files icon to upload files and pictures
    //  ahmet      from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
    @Test
    public void messageTest() {

        extentLogger = report.createTest("Message tab test");

        extentLogger.info("go to nextbase login page");

        BitrixLoginPage bitrixLogin = new BitrixLoginPage();

        extentLogger.info("username: " + "helpdesk3@cybertekschool.com");
        extentLogger.info("password: " + "UserUser");
        bitrixLogin.loginHelpdesk();


        extentLogger.info("clicking message button");
        // BrowserUtils.clickWithJS(Activity.Message);
        new BitrixMessagePage().Message.click();


        extentLogger.info("clicking Uploadfiles button");

        MorePage morePage = new MorePage();

        BrowserUtils.waitFor(3);
        morePage.uploadFiles.click();
        BrowserUtils.waitFor(3);
        extentLogger.info("clicking UploadFilesImages button");

        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/Whale.jpg";
        String filePath = projectPath + "/" + relativePath;

        extentLogger.info("uploading file image");
        BrowserUtils.waitFor(3);
        morePage.getUploadFilesAndImages.sendKeys(filePath);

        BrowserUtils.waitFor(3);

        extentLogger.info("selecting document from Bitrix");
        morePage.selectDocumentFromBitrix.click();


    }
//        7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.

    @Test
    public void visualEditorTest() {

        extentLogger = report.createTest("Visual Editor Test");

        extentLogger.info("Login as a Help Desk3");
        new BitrixLoginPage().loginHelpdesk();

        BitrixMessagePage bitrixMessage = new BitrixMessagePage();

        extentLogger.info("Navigating Message");
        bitrixMessage.Message.click();

        BrowserUtils.waitFor(3);
        extentLogger.info(" visual editor");
        bitrixMessage.VisualEditor.click();

        BrowserUtils.waitFor(3);
        extentLogger.info("verify editor text bar is displayed");
        Assert.assertTrue(bitrixMessage.editorTextBar.isDisplayed(), "verify that editor text bar visible");

        extentLogger.pass("PASS: Visual Editor Test");
    }

    @Test

    //   5. User should be able to create a quote by clicking on the Comma icon.

    public void quoteTest(){
        extentLogger = report.createTest("Quote Test");

        extentLogger.info("Login as a Help Desk3");
        new BitrixLoginPage().loginHelpdesk();

        BitrixMessagePage bitrixMessage = new BitrixMessagePage();

        extentLogger.info("Navigating Message");
        bitrixMessage.Message.click();

        BrowserUtils.waitFor(3);
        extentLogger.info("clicking quote button");
        bitrixMessage.QuoteText.click();

        BrowserUtils.waitFor(3);
        driver.switchTo().frame(0);
        extentLogger.info("verify quote text bar is displayed");
        Assert.assertTrue(bitrixMessage.QuoteBox.isDisplayed(), "verify that quote text box is visible");
        BrowserUtils.waitFor(3);
        extentLogger.pass("PASS: Quote text Test");

}

    @Test

    //        8. User should be able to click on the Topic icon to see the Message Topic text box displays on top of the message box.

    public void topicTextTest() {

        extentLogger = report.createTest("Topic Test");

        extentLogger.info("Login as a Help Desk3");
        new BitrixLoginPage().loginHelpdesk();

        BitrixMessagePage bitrixMessage = new BitrixMessagePage();

        extentLogger.info("Navigating Message");
        bitrixMessage.Message.click();

        BrowserUtils.waitFor(3);
        extentLogger.info("clicking topic button");
        bitrixMessage.Topic.click();

        BrowserUtils.waitFor(5);
        extentLogger.info("verifying topic text box is displayed");
        Assert.assertTrue(bitrixMessage.TopicText.isDisplayed(), "verify that topic text box visible");

        extentLogger.pass("PASS: Topic text  Test");
    }
}
