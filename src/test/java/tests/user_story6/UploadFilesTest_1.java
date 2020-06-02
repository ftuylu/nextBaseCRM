package tests.user_story6;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BitrixAppreciationPage;
import pages.BitrixLoginPage;
import pages.MorePage;
import tests.TestBase;
import utilities.BrowserUtils;

public class UploadFilesTest_1 extends TestBase {

    @Test
    public void uploadFilesFromLocal(){
        new BitrixLoginPage().loginHr();
        MorePage morePage=new MorePage();
        morePage.navigateInMore("Appreciation");
        BrowserUtils.waitFor(3);
        morePage.uploadFiles.click();

        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/Whale.jpg";
        String filePath = projectPath + "/"+relativePath;

        morePage.getUploadFilesAndImages.sendKeys(filePath);
        BrowserUtils.waitFor(3);
//        morePage.sendButton.click();
    }
    @Test
    public void uploadFilesFromBitrix(){
        new BitrixLoginPage().loginHr();
        MorePage morePage=new MorePage();
        morePage.navigateInMore("Appreciation");
        BrowserUtils.waitFor(3);
        morePage.uploadFiles.click();
//        driver.findElement(By.xpath("(//span[text()='Select document from Bitrix24'])[1]")).click();
        BrowserUtils.waitFor(2);
        morePage.selectDocumentFromBitrix.click();
        new BitrixAppreciationPage().fileFromLocal.click();
//        morePage.myDrive.click();
        Assert.assertTrue(new BitrixAppreciationPage().alertAfterBitrixUpload.isDisplayed());
        new BitrixAppreciationPage().alertAfterBitrixUpload.click();
        BrowserUtils.waitFor(3);
//        morePage.sendButton.click();

    }

    @Test
    public void uploadFilesFromExternalDrive(){
        new BitrixLoginPage().loginHr();
        MorePage morePage=new MorePage();
        morePage.navigateInMore("Appreciation");
        BrowserUtils.waitFor(3);
        morePage.uploadFiles.click();
        new BitrixAppreciationPage().externalFileUpload.click();
        BrowserUtils.waitFor(2);
        new BitrixAppreciationPage().extUplBox.click();
        //If error message is Displayed
        Assert.assertTrue( new BitrixAppreciationPage().extUplErrBox.isDisplayed());
    }

    @Test
    public void uploadFilesFromByCreatingApps(){

    }
}
