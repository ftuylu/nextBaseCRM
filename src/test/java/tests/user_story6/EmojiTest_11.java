package tests.user_story6;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MorePage;
import pages.BitrixLoginPage;
import tests.TestBase;

import java.util.List;

public class EmojiTest_11 extends TestBase {

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
        BitrixLoginPage loginPage = new BitrixLoginPage();
        loginPage.loginHelpdesk();
        MorePage MorePage = new MorePage();

        extentLogger.info("navigating to Appreciation and clicking to emoji button");
        MorePage.navigateInMore( "Appreciation");
        MorePage.emojiButton.click();


        extentLogger.info("selecting an emoji");
        List<WebElement> emojiList = MorePage.emojiList;
        extentLogger.info("verifying that all emojis are displayed");
        for (WebElement emoji : emojiList) {
            Assert.assertTrue(emoji.isDisplayed(), "verify that all emojis are displayed");
        }
        extentLogger.pass("PASS:Emoji test");


    }
}
