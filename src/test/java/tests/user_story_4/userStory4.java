package tests.user_story_4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.BitrixActStrPage;
import pages.BitrixLoginPage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import pages.BitrixPollPage;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;

public class userStory4 extends TestBase {

   @Test
   public void pollTabAddMention(){
      extentLogger = report.createTest("Bitrix24 User Story4 AC6");
      BitrixLoginPage loginPage =new BitrixLoginPage();
      loginPage.loginHelpdesk();

      BitrixActStrPage pollBtn =new BitrixActStrPage();
      pollBtn.poll.click();

      BitrixPollPage pollPage =new BitrixPollPage();
     BrowserUtils.waitFor(2);

      pollPage.addMention.click();
   }
}
     
