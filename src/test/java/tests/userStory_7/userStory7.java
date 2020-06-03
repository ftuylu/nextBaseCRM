package tests.userStory_7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;


public class userStory7 extends TestBase {

    //#AC_1
    @Test
    public void uploadFiles() {
        BitrixLoginPage loginPage = new BitrixLoginPage();
        loginPage.loginMarketing();

        MorePage morePage = new MorePage();
        morePage.navigateInMore("Announcement");


        BrowserUtils.waitFor(3);
        morePage.uploadFiles.click();
        BrowserUtils.waitFor(3);


        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/Whale.jpg";
        String filePath = projectPath + "/" + relativePath;

        morePage.getUploadFilesAndImages.sendKeys(filePath);
        // BrowserUtils.clickWithTimeOut(morePage.sendButton, 5);
        BrowserUtils.waitFor(3);
        morePage.sendButton.click();

    }

    //#AC_2
    @Test
    public void selectDocumentFromBitrix() {
        new BitrixLoginPage().loginMarketing();

        MorePage morePage = new MorePage();
        morePage.navigateInMore("Announcement");

        //Delete AllEmployees option
        morePage.deleteAllEmployee.click();

        //Add more recepients
        morePage.addRecipent.click();
        TaskPageForUserStory2 employeeAndDepartment = new TaskPageForUserStory2();

        employeeAndDepartment.employeeAndDepartments.click();
        employeeAndDepartment.userMail.click();

        BrowserUtils.waitFor(3);
        morePage.uploadFiles.click();
        BrowserUtils.waitFor(3);

        morePage.selectDocumentFromBitrix.click();
        BrowserUtils.clickWithJS(morePage.myDrive);
        BrowserUtils.clickWithJS(morePage.selectDocumentButton);

        morePage.sendButton.click();

    }

    //#AC_3
    @Test
    public void attachLink(){
        new BitrixLoginPage().loginHr();

        MorePage morePage = new MorePage();
        morePage.navigateInMore("Announcement");
        morePage.link.click();

        BitrixAppreciationPage appreciationPage = new BitrixAppreciationPage();
        appreciationPage.addUrlToLink("Google","www.google.com");
        appreciationPage.saveLinkButton.click();
        BrowserUtils.waitFor(3);
        morePage.sendButton.click();

    }

    //#AC_4
    @Test
    public void insertVideo(){
        new BitrixLoginPage().loginHr();

        MorePage morePage = new MorePage();
        morePage.navigateInMore("Announcement");

        BitrixPollPage pollPage = new BitrixPollPage();
        pollPage.videoIcon.click();

        String videoUrl ="https://www.youtube.com/watch?v=IVsLfuWISlM";

        BrowserUtils.waitForVisibility(pollPage.videoUrlBox, 5).sendKeys(videoUrl);
        BrowserUtils.waitFor(5);
        pollPage.linkTextBoxSaveButton.click();
        BrowserUtils.waitFor(3);

        morePage.sendButton.click();
    }

    //#AC_5
    @Test
    public void quote(){
        new BitrixLoginPage().loginHr();

        MorePage morePage = new MorePage();

        morePage.navigateInMore("Announcement");

        BitrixAppreciationPage appreciationPage = new BitrixAppreciationPage();

        BrowserUtils.waitForVisibility(appreciationPage.commaIcon,5).click();
        BrowserUtils.waitFor(3);
        driver.switchTo().frame(driver.findElement(By.xpath("//form//iframe")));
        appreciationPage.quoteTextBox.sendKeys("Practice makes perfect");
        BrowserUtils.waitFor(3);
        driver.switchTo().parentFrame();
        morePage.sendButton.click();

    }

    //AC_6
    @Test
    public void addMention(){
        new BitrixLoginPage().loginHr();

        BitrixPollPage pollPage = new BitrixPollPage();
        pollPage.addMention.click();
        pollPage.selectContact.click();
        String selected = pollPage.selectContact.getText();
        Assert.assertEquals(pollPage.text2.getText(), selected, "verify add mention");
    }

    //AC_7
    @Test
    public void VisualEditor(){
        new BitrixLoginPage().loginHr();

        MorePage morePage = new MorePage();
        morePage.navigateInMore("Announcement");
        morePage.visualEditorButton.click();

        Assert.assertTrue(morePage.editorTextBar.isDisplayed(), "Verify that editor text bar is displayed");
    }

    //#AC_8
    @Test
    public void topicIsDisplayed(){
        new BitrixLoginPage().loginHr();

        MorePage morePage = new MorePage();
        morePage.navigateInMore("Announcement");
        morePage.topicTextButton.click();

        Assert.assertTrue(morePage.topicTextBox.isDisplayed(),"Verify that topic text box is displayed");

    }

    //#AC_9
    @Test
    public void recordVideo(){
        System.out.println("There is bug here");
    }

    //#AC_10
    @Test
    public void tags(){
        new BitrixLoginPage().loginHr();
        MorePage morePage = new MorePage();
        morePage.navigateInMore("Announcement");

        morePage.addTagButton.click();
        morePage.addTagBox.sendKeys("selale" + Keys.ENTER);

        morePage.addTagButton.click();
        morePage.addTagBox.sendKeys("a");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("arguments[0].click()", morePage.addTagFirstExisting);
        javascriptExecutor.executeScript("arguments[0].click()", morePage.addButton);

        //  Assert.assertTrue(morePage.addSelectedTagContainer.getText().contains("CyberteckSchool"), "verify that cybertekschool added");
        // Assert.assertTrue(morePage.addSelectedTagContainer.getText().contains("Advice"), "verify that existing Advice tag is selected");

    }
}


