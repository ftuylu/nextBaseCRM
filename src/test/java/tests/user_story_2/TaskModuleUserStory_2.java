package tests.user_story_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BitrixActStrPage;
import pages.BitrixLoginPage;
import pages.TaskPageForUserStory2;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskModuleUserStory_2 extends TestBase {


    @Test
    public void LoginTest() {

        extentLogger = report.createTest("Task module test");

        extentLogger.info("go to nextbase login page");
        Driver.get().get("https://login.nextbasecrm.com/auth/?backurl=%2Fstream%2F");

        BitrixLoginPage bitrixLogin = new BitrixLoginPage();

        extentLogger.info("username: " + "helpdesk3@cybertekschool.com");
        extentLogger.info("password: " + "UserUser");
        bitrixLogin.login("helpdesk3@cybertekschool.com ", "UserUser");

        TaskPageForUserStory2 taskPage = new TaskPageForUserStory2();

        extentLogger.info("clicking task button");
        BrowserUtils.clickWithJS(taskPage.taskButton);

        extentLogger.info("clicking high priority box");
        BrowserUtils.clickWithJS(taskPage.highPriorityBox);

        extentLogger.info("high priority box is selected or not");
        Assert.assertTrue(taskPage.highPriorityBox.isSelected(), "high priority is selected or not");

        extentLogger.info("clicking visual editor button");
        BrowserUtils.clickWithJS(taskPage.visualEditorButton);

        extentLogger.info("visual editor is displayed or not");
        Assert.assertTrue(taskPage.texBar.isDisplayed(), "tex-bar is displayed");

        extentLogger.info("clicking add mention icon");
        taskPage.addMentionIcon.click();

        extentLogger.info("clicking employee and departments icon");
        taskPage.employeeAndDepartments.click();

        String expected = taskPage.userMail.getText();

        extentLogger.info("clicking one user name");
        taskPage.userMail.click();

        WebElement iframeElement = driver.findElement(By.xpath("(//iframe[@class='bx-editor-iframe'])[2]"));

        driver.switchTo().frame(iframeElement);

        WebElement body = driver.findElement(By.cssSelector("body"));

        String actual = body.getText().trim();

        extentLogger.info("verifyin is the same user mail");
        Assert.assertEquals(actual,expected,"verifyin is the same user mail");

        extentLogger.pass("PASS: task module test");

    }
    @Test
    public void test6(){

        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginMarketing();

        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        bitrixActStrPage.navigateActiveStream("Activity Stream","Task");

        TaskPageForUserStory2 taskPageU2 = new TaskPageForUserStory2();
        taskPageU2.linkIcon.click();
        taskPageU2.linkText.sendKeys("Bitrix24 CRM");
        taskPageU2.linkUrlText.sendKeys("https://login.nextbasecrm.com/");
        taskPageU2.attachLink("Save");

    }
    @Test
    public void test7() {

        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginMarketing();

        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        bitrixActStrPage.navigateActiveStream("Activity Stream", "Task");

        TaskPageForUserStory2 taskPageU2 = new TaskPageForUserStory2();
        taskPageU2.checklist.click();
        taskPageU2.checklistText.sendKeys("Java Practice");
        taskPageU2.checklistSubmit("submit");
        taskPageU2.addChecklist.click();
        taskPageU2.checklistSubmit("clase");
        taskPageU2.separatorChecklist.click();

    }
}
