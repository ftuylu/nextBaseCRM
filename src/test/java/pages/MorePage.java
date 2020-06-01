package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class MorePage extends BitrixBasePage {
    public MorePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFiles;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement getUploadFilesAndImages;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(css = "span[class ='wd-fa-add-file-light-title-text diskuf-selector-link']")
    public WebElement selectDocumentFromBitrix;

    @FindBy(linkText = "Whale (7).jpg")
    public WebElement myDrive;

    @FindBy(xpath = "//div[@class='popup-window-buttons']/span[1]")
    public WebElement selectDocumentButton;

    @FindBy(id="bx-destination-tag")
    public WebElement addRecipent;

//    @FindBy(css = ".bx-finder-box-tab bx-lm-tab-department")
//    public WebElement employeeaAndDepartment;

    @FindBy(xpath = "//div[text() = 'marketing15@cybertekschool.com']")
    public WebElement emailFromEmployee;

    @FindBy(css = ".feed-add-post-del-but")
    public WebElement deleteAllEmployee;




    public void navigateInMore(String module) {
        String tabLocator = "//span[@id='feed-add-post-form-link-text']";
        String moduleLocator = "//span[@class='menu-popup-item-text' and text() = '"+module+"']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)),  5);
        }
    }
}