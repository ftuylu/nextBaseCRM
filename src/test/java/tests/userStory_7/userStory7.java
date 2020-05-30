package tests.userStory_7;

import org.testng.annotations.Test;
import pages.BitrixLoginPage;
import pages.MorePage;

import tests.TestBase;

import pages.TaskPageForUserStory2;
import tests.TestBase;
import utilities.BrowserUtils;


public class userStory7 extends TestBase {

    @Test

    public void uploadFiles() throws InterruptedException {

        public void uploadFiles () {

            BitrixLoginPage loginPage = new BitrixLoginPage();
            loginPage.loginMarketing();

            MorePage morePage = new MorePage();
            morePage.navigateInMore("Announcement");


//          morePage.uploadFiles.click();
//          morePage.getUploadFilesAndImages.click();


            BrowserUtils.waitFor(3);
            morePage.uploadFiles.click();
            BrowserUtils.waitFor(3);

            morePage.getUploadFilesAndImages.sendKeys("C:/Users/havva/Desktop/Whale.jpg");
            // BrowserUtils.clickWithTimeOut(morePage.sendButton, 5);
            BrowserUtils.waitFor(3);
            morePage.sendButton.click();

        }

        @Test
        public void selectDocumentFromBitrix () {
            BitrixLoginPage loginPage = new BitrixLoginPage();
            loginPage.loginMarketing();

            MorePage morePage = new MorePage();
            morePage.navigateInMore("Announcement");

            //Delete AllEmployees option
            morePage.deleteAllEmployee.click();

            //Add more recepients
            morePage.addRecipent.click();
            TaskPageForUserStory2 employeeAndDepartment = new TaskPageForUserStory2();

            employeeAndDepartment.employeeAndDepartments.click();
            employeeAndDepartment.userMail.click();


            BrowserUtils.waitFor(3);
            morePage.uploadFiles.click();
            BrowserUtils.waitFor(3);


            morePage.selectDocumentFromBitrix.click();

            BrowserUtils.clickWithJS(morePage.myDrive);
            BrowserUtils.clickWithJS(morePage.selectDocumentButton);
            morePage.sendButton.click();

        }

    }

}
