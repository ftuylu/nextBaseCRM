package tests.user_story_4;

import org.testng.annotations.Test;
import pages.BitrixLoginPage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import tests.TestBase;

public class userStory4 extends TestBase {

   @Test
   public void pollTabClickUpload(){
      extentLogger = report.createTest("Bitrix24 User Story4 AC1");
      BitrixLoginPage loginPage =new BitrixLoginPage();
      loginPage.loginHelpdesk();

   }
}
     
