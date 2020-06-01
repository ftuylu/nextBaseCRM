package tests.user_story1;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;

public class messageTabTest_1 extends TestBase {

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
