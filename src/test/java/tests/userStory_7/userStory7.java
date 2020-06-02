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

    public void uploadFiles() {
            BitrixLoginPage loginPage = new BitrixLoginPage();
            loginPage.loginMarketing();

            MorePage morePage = new MorePage();
            morePage.navigateInMore("Announcement");

            BrowserUtils.waitFor(3);
            morePage.uploadFiles.click();
            BrowserUtils.waitFor(3);

            String projectPath = System.getProperty("user.dir");
            String relativePath = "src/test/resources/Whale.jpg";
            String filePath = projectPath + "/"+relativePath;

            morePage.getUploadFilesAndImages.sendKeys(filePath);
            // BrowserUtils.clickWithTimeOut(morePage.sendButton, 5);
            BrowserUtils.waitFor(3);
            morePage.sendButton.click();

        }

        @Test
        public void selectDocumentFromBitrix(){
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

            //attach link
            BrowserUtils.waitFor(3);
            morePage.navigateInMore("Announcement");
            morePage.link.click();

            morePage.linkText.sendKeys();

        }

        @Test
        public void attachLink(){

        }

    }

