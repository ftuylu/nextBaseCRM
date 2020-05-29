package tests;

import org.testng.annotations.Test;
import pages.BitrixLoginPage;
import pages.MorePage;

public class userStory7 extends TestBase {

    @Test
    public void uploadFiles() throws InterruptedException {
          BitrixLoginPage loginPage = new BitrixLoginPage();
          loginPage.loginMarketing();

          MorePage morePage = new MorePage();
          morePage.navigateInMore("Announcement");

//          morePage.uploadFiles.click();
//          morePage.getUploadFilesAndImages.click();




    }



}
