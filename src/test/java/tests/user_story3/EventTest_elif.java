package tests.user_story3;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BitrixActStrPage;
import pages.BitrixEventPage;
import pages.BitrixLoginPage;
import tests.TestBase;
import utilities.BrowserUtils;



public class EventTest_elif extends TestBase {

    @Test
    public void createEventTest() throws InterruptedException {
        extentLogger = report.createTest("Create New Event ");
        extentLogger.info("Login as HelpDesk");
        new BitrixLoginPage().loginHelpdesk();
        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        extentLogger.info("Go to the event page");
        bitrixActStrPage.event.click();
        BrowserUtils.waitFor(2);
     /*   extentLogger.info(" Create new Event Page");
        eventPage.dateFrom.clear();
        eventPage.dateFrom.sendKeys("06/20/2019");*/
    }




    // User Story-3: As a user, I should be able to create events by clicking on Event tab under Activity Stream."
    // AC-1:  User should be able to click on upload files icon to upload files and pictures from local disks,
    // download from external drive, select documents from bixtrix24, and create files to upload.
    @Test
    public void UploadFileFromLocal() throws InterruptedException {
        extentLogger = report.createTest("Upload File ");
        extentLogger.info("Login as HelpDesk");
        new BitrixLoginPage().loginHelpdesk();
        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        extentLogger.info("Go to the event page");
        bitrixActStrPage.event.click();
        BrowserUtils.waitFor(2);
        BitrixEventPage bitrixEventPage = new BitrixEventPage();

        bitrixEventPage.uploadFile.click();
        BrowserUtils.waitFor(2);

        new BitrixEventPage().choosefile.sendKeys("C:/Users/User/Desktop/Text.file.txt");
        Thread.sleep(2000);

    }


    // User Story-3: As a user, I should be able to create events by clicking on Event tab under Activity Stream."
    //AC-2:User should be able to attach link by clicking on the link icon.
    @Test
    public void LinkIcon() throws InterruptedException {
        extentLogger = report.createTest("Link Icon ");
        extentLogger.info("Login as HelpDesk");
        new BitrixLoginPage().loginHelpdesk();
        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        extentLogger.info("Go to the event page");
        bitrixActStrPage.event.click();
        BrowserUtils.waitFor(2);
        BitrixEventPage bitrixEventPage=new BitrixEventPage();

        bitrixEventPage.Link.click();
        Assert.assertTrue(bitrixEventPage.linkTextBar.isDisplayed());
        bitrixEventPage.linkText.click();
        bitrixEventPage.linkText.sendKeys("Still trying..");
        Thread.sleep(3000);
        bitrixEventPage.linkURL.click();
        Thread.sleep(2000);
        bitrixEventPage.linkURL.sendKeys("https://www.youtube.com/watch?v=BlcvKOUaSTI");
        Thread.sleep(2000);
        // bitrixEventPage.cancelButton.click();
        // Thread.sleep(2000);

        bitrixEventPage.linkSave.click();
        Thread.sleep(2000);
        bitrixEventPage.eventSendButton.click();
        Thread.sleep(2000);
    }



    // User Story-3: As a user, I should be able to create events by clicking on Event tab under Activity Stream.
    //AC-4: User should be able to insert videos by clicking on the video icon and entering the video URL.
    @Test
    public void InsertVideoIcon(){
        extentLogger = report.createTest("Inser Video Icon ");
        extentLogger.info("Login as HelpDesk");
        new BitrixLoginPage().loginHelpdesk();
        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        extentLogger.info("Go to the event page");
        bitrixActStrPage.event.click();
        BrowserUtils.waitFor(2);
        BitrixEventPage bitrixEventPage=new BitrixEventPage();
        bitrixEventPage.insertVideoIcon.click();
        BrowserUtils.waitFor(2);
        bitrixEventPage.videoInputBox.click();
        BrowserUtils.waitFor(2);
        bitrixEventPage.videoInputBox.sendKeys("https://www.youtube.com/watch?v=LQNv7raR2Lk");
        BrowserUtils.waitFor(2);
        bitrixEventPage.videoSource.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(bitrixEventPage.videoTitle.isDisplayed());

        bitrixEventPage.videoSaveButton.click();
        BrowserUtils.waitFor(5);


    }


    // User Story-3: As a user, I should be able to create events by clicking on Event tab under Activity Stream.
    //AC-5:  User should be able to create a quote by clicking on the Comma icon.
    @Test
    public void QuoteTextIcon() throws InterruptedException {
        extentLogger = report.createTest("Comma Icon ");
        extentLogger.info("Login as HelpDesk");
        new BitrixLoginPage().loginHelpdesk();
        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        extentLogger.info("Go to the event page");
        bitrixActStrPage.event.click();
        BrowserUtils.waitFor(2);
        BitrixEventPage bitrixEventPage=new BitrixEventPage();

        bitrixEventPage.commaIcon.click();
        Thread.sleep(2000);
        Assert.assertTrue(bitrixEventPage.blockquote.isDisplayed());

    }


    // User Story-3: As a user, I should be able to create events by clicking on Event tab under Activity Stream.
    //AC-6:  User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
    @Test
    public void VisualEditorIcon(){
        extentLogger = report.createTest("Visual Editor ");
        extentLogger.info("Login as HelpDesk");
        new BitrixLoginPage().loginHelpdesk();
        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        extentLogger.info("Go to the event page");
        bitrixActStrPage.event.click();
        BrowserUtils.waitFor(2);
        BitrixEventPage bitrixEventPage=new BitrixEventPage();
        bitrixEventPage.visualEditor.click();
        BrowserUtils.waitFor(2);

        Assert.assertTrue(bitrixEventPage.textBar.isDisplayed());

    }



}
