package tests.test6_somethingLikeThis;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ActivityStream;
import pages.LoginPage;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class EmojiTest extends TestBase {

    /**
     * AC
     * 11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis.
     *
     * Test case;
     * open chrome
     * go to https://login2.nextbasecrm.com
     * login as a Help Desk person
     * navigate to "More..." through "Appreciation" page and click to "Emoji Tump Up" button
     * Verify that All Emojies are displayed.
     *
     *
     */

    @Test
    public void EmojiTest() {

        extentLogger = report.createTest("Emoji Test");

        extentLogger.info("Login as a Help Desk");
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpdesk();
        ActivityStream activityStream = new ActivityStream();

        extentLogger.info("navigating to Appreciation and clicking to emoji button");
        activityStream.navigateTo("More", "Appreciation");
        activityStream.emojiButton.click();


        extentLogger.info("selecting an emoji");
        List<WebElement> emojiList = activityStream.emojiList;
        extentLogger.info("verifying that all emojis are displayed");
        for (WebElement emoji : emojiList) {
            Assert.assertTrue(emoji.isDisplayed(), "verify that all emojis are displayed");
        }
        extentLogger.pass("PASS:Emoji test");


    }
}
