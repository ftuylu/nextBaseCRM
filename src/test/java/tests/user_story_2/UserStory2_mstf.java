package tests.user_story_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BitrixActStrPage;
import pages.BitrixLoginPage;
import pages.TaskPageForUserStory2;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;

import java.awt.dnd.DragGestureEvent;

public class UserStory2_mstf extends TestBase {
    @Test
    public void test6() {
        BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
        bitrixLoginPage.loginMarketing();
        BitrixActStrPage bitrixActStrPage = new BitrixActStrPage();
        bitrixActStrPage.navigateActiveStream("Activity Stream", "Task");
        TaskPageForUserStory2 taskPageU2 = new TaskPageForUserStory2();
        taskPageU2.attachLink("Bitrix24 CRM"," https://login.nextbasecrm.com");
        WebElement iframeLocator = Driver.get().findElement(By.xpath("(//iframe[@class='bx-editor-iframe'])[2]"));
        Driver.get().switchTo().frame(iframeLocator);
        String actualResult = Driver.get().findElement(By.xpath("//body")).getText();
        String expectedResult= "Bitrix24 CRM";
        Assert.assertEquals(actualResult,expectedResult,"Verify that link was attached");

    }




}