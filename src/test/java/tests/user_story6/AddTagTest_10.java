package tests.user_story6;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MorePage;
import pages.BitrixLoginPage;
import pages.MorePage;
import tests.TestBase;
import utilities.Driver;

public class AddTagTest_10 extends TestBase {

    /**
     * AC
     *10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
     *
     * Test case;
     * open chrome
     * go to https://login2.nextbasecrm.com
     * login as a Help Desk person
     * navigate to "More..." through "Appreciation" page and click to "Add Tag" button
     * Verify that Add Tag Box is displayed.
     * click Add more button
     * write the box "cybertek" send and click to Key
     * click add existing tag and click to Key
     * verify that tags are selected
     *
     *
     */

    @Test
    public void AddTagTest() {

        extentLogger = report.createTest("Add Tag Test");
        extentLogger.info("Login as a Help Desk");
        BitrixLoginPage loginPage = new BitrixLoginPage();
        loginPage.loginHelpdesk();
        MorePage MorePage = new MorePage();


        extentLogger.info("navigating to Add Tag button and clicking");
        MorePage.navigateInMore("Appreciation");
        MorePage.addTagButton.click();


        extentLogger.info("adding new tag in the box is displayed");
        MorePage.addTagBox.sendKeys("CyberteckSchool" + Keys.ENTER);

        MorePage.addTagButton.click();
        MorePage.addTagBox.sendKeys("a");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("arguments[0].click()", MorePage.addTagFirstExisting);
        javascriptExecutor.executeScript("arguments[0].click()", MorePage.addButton);

        extentLogger.info("verifying new tag is printed");
        Assert.assertTrue(MorePage.addSelectedTagContainer.getText().contains("CyberteckSchool"), "verify that cybertekschool added");

        extentLogger.info("verifying existing tag is selected");
        Assert.assertTrue(MorePage.addSelectedTagContainer.getText().contains("Advice"), "verify that existing Advice tag is selected");

        extentLogger.pass("PASS : Add tag Test");



    }
}
