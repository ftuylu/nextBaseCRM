package tests.user_story_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.BitrixActStrPage;
import pages.BitrixLoginPage;
import pages.BitrixPollPage;
import pages.DashboardPage;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;

public class userStory4Liz extends TestBase {

    @Test
    public void pollTab() {

        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginHelpdesk();

        new DashboardPage().navigateToModule("Activity Stream");

        BitrixActStrPage activityStream = new BitrixActStrPage();

        activityStream.poll.click();

    }

    @Test
    public void AC1UploadFiles() {

        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginHelpdesk();

        new DashboardPage().navigateToModule("Activity Stream");

        BitrixActStrPage activityStream = new BitrixActStrPage();
        activityStream.poll.click();

        BitrixPollPage bitrixPollPage = new BitrixPollPage();
        BrowserUtils.waitForVisibility(bitrixPollPage.uploadFileButton, 5).click();

        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/quokka.png";
        String filePath = projectPath + "/" + relativePath;

        BrowserUtils.waitFor(3);
        bitrixPollPage.getUploadFileButton.sendKeys(filePath);
        BrowserUtils.waitFor(20);
        bitrixPollPage.sendButton.click();

    }

    @Test
    public void AC3AddLink() {

        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginHelpdesk();

        new DashboardPage().navigateToModule("Activity Stream");

        BitrixActStrPage activityStream = new BitrixActStrPage();
        activityStream.poll.click();

        BitrixPollPage bitrixPollPage = new BitrixPollPage();
        BrowserUtils.waitForVisibility(bitrixPollPage.linkIcon, 5).click();

        String url = "https://theculturetrip.com/pacific/australia/articles/quokka-11-facts-about-australias-cutest-animal/";

        BrowserUtils.waitForVisibility(bitrixPollPage.linkTextBox, 5).sendKeys(url);
        BrowserUtils.waitFor(5);
        bitrixPollPage.linkTextBoxSaveButton.click();
        BrowserUtils.waitFor(3);

        bitrixPollPage.sendButton.click();


    }

    @Test
    public void AC4AddVideo() {

        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginHelpdesk();

        new DashboardPage().navigateToModule("Activity Stream");

        BitrixActStrPage activityStream = new BitrixActStrPage();
        activityStream.poll.click();

        BitrixPollPage bitrixPollPage = new BitrixPollPage();
        BrowserUtils.waitForVisibility(bitrixPollPage.videoIcon, 5).click();

        String videoUrl ="https://www.youtube.com/watch?v=uzfFItqjEis";

        BrowserUtils.waitForVisibility(bitrixPollPage.videoUrlBox, 5).sendKeys(videoUrl);
        BrowserUtils.waitFor(5);
        bitrixPollPage.linkTextBoxSaveButton.click();
        BrowserUtils.waitFor(3);

        bitrixPollPage.sendButton.click();


    }

    @Test
    public void AC5AddQuote() {

        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginHelpdesk();

        new DashboardPage().navigateToModule("Activity Stream");

        BitrixActStrPage activityStream = new BitrixActStrPage();
        activityStream.poll.click();

        BitrixPollPage bitrixPollPage = new BitrixPollPage();
        BrowserUtils.waitForVisibility(bitrixPollPage.insertQuotebutton, 5).click();
        BrowserUtils.waitFor(3);

        WebElement iframeElement = driver.findElement(By.className("bx-editor-iframe"));
        driver.switchTo().frame(iframeElement);

        bitrixPollPage.addQuoteTextBox.sendKeys("You have power over your mind - not outside events. Realize this, and you will find strength. - Marcus Aurelius");

        BrowserUtils.waitFor(3);

        driver.switchTo().defaultContent();
        BrowserUtils.waitFor(5);

        bitrixPollPage.sendButton.click();


    }
}


