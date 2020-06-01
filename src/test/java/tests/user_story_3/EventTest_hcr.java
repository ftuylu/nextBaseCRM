package tests.user_story_3;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BitrixActStrPage;
import pages.BitrixEventPage;
import pages.BitrixLoginPage;
import tests.TestBase;
import utilities.BrowserUtils;

public class EventTest_hcr extends TestBase {


    @Test
    public void SetReminder_8(){

        extentLogger = report.createTest("Set Reminder Test");
        extentLogger.info("Login as help desk");
        new BitrixLoginPage().loginHelpdesk();
        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        extentLogger.info("Go to the event page");
        bitrixActStrPage.event.click();
        BrowserUtils.waitFor(2);

        BitrixEventPage bitrixEventPage = new BitrixEventPage();
        extentLogger.info("Verify that eventReminder is   selected");
        Assert.assertTrue(bitrixEventPage.eventRemind.isSelected(),"verify  checkbox2 is   selected");

        extentLogger.info("Send a value for count");
        bitrixEventPage.eventReminderCount.clear();
        bitrixEventPage.eventReminderCount.sendKeys("10");

        extentLogger.info("Click to choose reminder type");
        bitrixEventPage.eventReminderType.click();
        bitrixEventPage.EventReminderType().selectByValue("hour");
        String expectedOption = "hours";
        String actualOption = bitrixEventPage.EventReminderType().getFirstSelectedOption().getText();
        extentLogger.info("Verify that count and reminder are send");
        Assert.assertEquals(actualOption, expectedOption);
        extentLogger.pass("PASS: Topic text box Test");


    }

    @Test
    public void EventLocation_9(){

        extentLogger = report.createTest("Choose Location Test");
        extentLogger.info("Login as help desk");
        new BitrixLoginPage().loginHelpdesk();
        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        extentLogger.info("Go to the event page");
        bitrixActStrPage.event.click();
        BrowserUtils.waitFor(2);

        BitrixEventPage bitrixEventPage = new BitrixEventPage();
        extentLogger.info("Click to set location");
        bitrixEventPage.eventLocation.click();
        extentLogger.info("Verify that all locations are displayed");
        Assert.assertTrue(bitrixEventPage.eventLocation.isDisplayed());
        extentLogger.pass("PASS: Topic text box Test");

    }

    @Test
    public void AddEmployeeOrDepartmentMail_10(){

        extentLogger = report.createTest("Adding Email Test");
        extentLogger.info("Login as help desk");
        new BitrixLoginPage().loginHelpdesk();
        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        extentLogger.info("Go to the event page");
        bitrixActStrPage.event.click();
        BrowserUtils.waitFor(2);

        BitrixEventPage bitrixEventPage = new BitrixEventPage();
        extentLogger.info("Click on the link to go to choose email");
        bitrixEventPage.addPeople.click();
        extentLogger.info("Click to open email list");
        bitrixEventPage.addMore.click();
        extentLogger.info("Click on an email to add");
        bitrixEventPage.pickEmail.click();
        BrowserUtils.waitFor(2);
        String actualResult =bitrixEventPage.getEmailName.getText();
        bitrixEventPage.inputEmail.click();
        extentLogger.info("Verify that the email is added");
        Assert.assertEquals( actualResult, bitrixEventPage.inputEmail.getText());
        extentLogger.pass("PASS: Topic text box Test");

    }

    @Test
    public void ClickMore_11(){

        extentLogger = report.createTest("More Button Test");
        extentLogger.info("Login as help desk");
        new BitrixLoginPage().loginHelpdesk();
        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        extentLogger.info("Go to the event page");
        bitrixActStrPage.event.click();
        BrowserUtils.waitFor(2);

        BitrixEventPage bitrixEventPage = new BitrixEventPage();
        extentLogger.info("Click on the More button");
        bitrixEventPage.More.click();
        extentLogger.info("Verify that all event details are seen");
        Assert.assertTrue(bitrixEventPage.eventDetails.isDisplayed());
        extentLogger.pass("PASS: Topic text box Test");

    }
}
