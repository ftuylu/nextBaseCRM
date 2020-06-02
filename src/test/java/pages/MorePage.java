package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

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

<<<<<<< HEAD
    @FindBy(xpath = "//*[@id='bx-b-link-blogPostForm']/span")
    public WebElement link;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;





=======
    // =====+=+++=+=+====++=+=+==+=+==+=+=+=++=+=+=++=+=+==
    // UPLOAD FINDERS +=====++===+===+=++=+=+=++=+=+=+=+=+=
    @FindBy(xpath = "(//*[.='Upload files and images'])[1]")
    public WebElement uploadFileOrImage;
    // EDITOR TEXT BAR FINDERS ====+=++=+=+=++=+=+=++++=+=+=+=
    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    public WebElement editorTextBar;
    @FindBy(xpath = "//*[@Title='Visual editor']")
    public WebElement visualEditorButton;
    //  TOPIC TEXT FINDERS ======++=+=++=+=+=++++=+=++=+=+=+=++===+
    @FindBy(xpath = "//*[@title='Topic']")
    public WebElement topicTextButton;
    @FindBy(css = ".feed-add-post-inp.feed-add-post-inp-active")
    public WebElement topicTextBox;
    // VIDEO RECORDER FINDERS ===+=+=+==+=+=++=+++=++=+=+=++=+=+=++=+
    @FindBy(xpath = "(//span[.='Record Video'])[1]")
    public WebElement videoRecordButton;
    @FindBy(xpath = "(//*[@class='popup-window-content'])[4]")
    public WebElement videoRecordPopUp;
    @FindBy(css = ".popup-window-button.popup-window-button-blue")
    public WebElement videoSettingAllowButton;
    // ADD TAG FINDERS =====+==+=++=++=+=+=+++=+=++=+=+==+=+=++=+=+=
    @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement addTagButton;
    @FindBy(id = "TAGS_blogPostForm67abSn")
    public WebElement addTagBox;
    @FindBy(id = "TAGS_blogPostForm67abSn_div")
    public List<WebElement> addTagExisting;
    @FindBy(css = ".search-popup-el.search-popup-el-name")
    public List<WebElement> addTagSelected;
    @FindBy(css = ".search-popup-el.search-popup-el-name")
    public WebElement addTagFirstExisting;
    @FindBy(xpath = "(//*[text()='Add'])[2]")
    public WebElement addButton;
    @FindBy(css = ".feed-add-post-tags-wrap")
    public WebElement addSelectedTagContainer;
    // EMOJI FINDERS ===+===+=++=+=+==+=+==+=+=+==+=+=++=+=+==
    @FindBy(css = ".feed-add-grat-box")
    public List<WebElement> emojiList;
    @FindBy(css = ".feed-add-grat-box")
    public WebElement emojiButton;
    // =====++===+==+++==+=++++=+=++=+=+=++=+=+=++++=+=+=++=+=+=
>>>>>>> 35e1f8c79dda46ab8ffafc5bae7d5c47ff5e965d



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





