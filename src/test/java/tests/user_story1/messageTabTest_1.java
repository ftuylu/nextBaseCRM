package tests.user_story1;

import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;

public class messageTabTest_1 extends TestBase {

    @Test
    public void messageTest()  {

        extentLogger = report.createTest("Message tab test");

        extentLogger.info("go to nextbase login page");

        BitrixLoginPage bitrixLogin = new BitrixLoginPage();

        extentLogger.info("username: " + "helpdesk3@cybertekschool.com");
        extentLogger.info("password: " + "UserUser");
        bitrixLogin.loginHelpdesk();



        extentLogger.info("clicking message button");
       // BrowserUtils.clickWithJS(Activity.Message);
        new BitrixMessagePage() .Message.click();



        extentLogger.info("clicking Uploadfiles button");

        MorePage morePage = new MorePage();

        BrowserUtils.waitFor(3);
        morePage.uploadFiles.click();
        BrowserUtils.waitFor(3);
        extentLogger.info("clicking UploadFilesImages button");


        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/Whale.jpg";
        String filePath = projectPath + "/"+relativePath;

        extentLogger.info("uploading file image");
        BrowserUtils.waitFor(3);
        morePage.getUploadFilesAndImages.sendKeys(filePath);

        BrowserUtils.waitFor(3);

        extentLogger.info("selecting document from Bitrix");
        morePage.selectDocumentFromBitrix.click();


    }



}
