package tests.user_story_4;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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

      BitrixPollPage pollPage=new BitrixPollPage();
      pollPage.loginPollPage();
      extentLogger.info("Login successfully");
      pollPage.addMention.click();
      extentLogger.info("click addMention button");
      String choosen=pollPage.selectContact.getText();
      pollPage.selectContact.click();
      extentLogger.info("select a contact");
      Assert.assertEquals(pollPage.text2.getText(),choosen,"verify add mention");
      extentLogger.pass("Pass");

   }
   @Test
   public void getPollVisualEditor(){



   }
}
     
