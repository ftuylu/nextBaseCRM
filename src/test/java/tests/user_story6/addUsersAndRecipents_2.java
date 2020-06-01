package tests.user_story6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BitrixAppreciationPage;
import pages.BitrixLoginPage;
import pages.MorePage;
import pages.TaskPageForUserStory2;
import tests.TestBase;
import utilities.BrowserUtils;

public class addUsersAndRecipents_2 extends TestBase {
    @Test
    public void addUsersFromEmployeesDep(){
        BitrixAppreciationPage appreciationPage=new BitrixAppreciationPage();
        appreciationPage.navigateToAppreciation();
        MorePage morePage=new MorePage();
        BrowserUtils.waitFor(3);
        appreciationPage.addQuoteToMessageFrame("Add Line toMessage");

        //Delete AllEmployees option
        morePage.deleteAllEmployee.click();

        //Add more recepients
        morePage.addRecipent.click();
        TaskPageForUserStory2 employeeAndDepartment = new TaskPageForUserStory2();

        employeeAndDepartment.employeeAndDepartments.click();
        employeeAndDepartment.userMail.click();
        BrowserUtils.waitFor(1);
        new BitrixAppreciationPage().newEmployeedDep.click();
//        morePage.sendButton.click();
    }

    @Test
    public void addUsersFromEmail(){
        BitrixAppreciationPage appreciationPage=new BitrixAppreciationPage();
        appreciationPage.navigateToAppreciation();
        MorePage morePage=new MorePage();
        BrowserUtils.waitFor(3);
        appreciationPage.addQuoteToMessageFrame("Add Line toMessage");

        //Delete AllEmployees options
        morePage.deleteAllEmployee.click();

        morePage.addRecipent.click();
        new BitrixAppreciationPage().newUserMail.click();
        BrowserUtils.waitFor(1);
        new BitrixAppreciationPage().closeButAfterChose.click();
        morePage.sendButton.click();
    }

    @Test
    public void addUsersFromRecentUser() {
        BitrixAppreciationPage appreciationPage=new BitrixAppreciationPage();
        appreciationPage.navigateToAppreciation();
        MorePage morePage=new MorePage();
        BrowserUtils.waitFor(3);
        appreciationPage.addQuoteToMessageFrame("Add Line toMessage");

        //Delete AllEmployees option
        morePage.deleteAllEmployee.click();

        morePage.addRecipent.click();
        BrowserUtils.waitFor(2);
        new BitrixAppreciationPage().fromRecentUser.click();
        BrowserUtils.waitFor(1);
        new BitrixAppreciationPage().closeButAfterChose.click();
        morePage.sendButton.click();
    }
}
