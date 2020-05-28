package pages;

import utilities.BrowserUtils;
import utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;
import utilities.Driver;

public class BitrixBasePage {


    @FindBy(css = "#pagetitle")
    public WebElement pageSubTitle;

    @FindBy(css = "#user-name")
    public WebElement userName;

    @FindBy(xpath = "//*[text()='Log out']")
    public WebElement logOutLink;

    @FindBy(xpath = "(//div[@id='microoPostFormLHE_blogPostForm_inner']/span)[1]")
    public WebElement sendMsg;


    public String getPageSubTitle() {
        return pageSubTitle.getText();
    }

    public String getUserName() {

        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }

    public void logOut() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
    }


    public void navigateToModule(String module) {

        Driver.get().findElement(By.id("left-menu-more-btn")).click();

        String moduleLocator = "//a[@title='" + module + "']";

        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 5);
        }
    }


}
