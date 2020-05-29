package tests.user_story_2;

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
        Assert.assertTrue(taskPage.texBar.isDisplayed(),"tex-bar is displayed");

        extentLogger.pass("PASS: task module test");




    }


}
