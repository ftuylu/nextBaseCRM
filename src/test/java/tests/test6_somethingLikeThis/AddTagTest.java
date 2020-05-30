package tests.test6_somethingLikeThis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ActivityStream;
import pages.LoginPage;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;

import java.awt.event.MouseEvent;
import java.util.List;

public class AddTagTest extends TestBase {

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
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpdesk();
        ActivityStream activityStream = new ActivityStream();


        extentLogger.info("navigating to Add Tag button and clicking");
        activityStream.navigateTo("More", "Appreciation");
        activityStream.addTagButton.click();


        extentLogger.info("adding new tag in the box is displayed");
        activityStream.addTagBox.sendKeys("CyberteckSchool" + Keys.ENTER);

        activityStream.addTagButton.click();
        activityStream.addTagBox.sendKeys("a");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("arguments[0].click()", activityStream.addTagFirstExisting);
        javascriptExecutor.executeScript("arguments[0].click()", activityStream.addButton);

        extentLogger.info("verifying new tag is printed");
        Assert.assertTrue(activityStream.addSelectedTagContainer.getText().contains("CyberteckSchool"), "verify that cybertekschool added");

        extentLogger.info("verifying existing tag is selected");
        Assert.assertTrue(activityStream.addSelectedTagContainer.getText().contains("Advice"), "verify that existing Advice tag is selected");

        extentLogger.pass("PASS : Add tag Test");

    }
}
