package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ActivityStream extends BasePage {



    // UPLOAD FINDERS
    @FindBy(xpath = "(//*[.='Upload files and images'])[1]")
    public WebElement uploadFileOrImage;


    // EDITOR TEXT BAR FINDERS
    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    public WebElement editorTextBar;

    @FindBy(xpath = "//*[@Title='Visual editor']")
    public WebElement visualEditorButton;



    //  TOPIC TEXT FINDERS
    @FindBy(xpath = "//*[@title='Topic']")
    public WebElement topicTextButton;

    @FindBy(css = ".feed-add-post-inp.feed-add-post-inp-active")
    public WebElement topicTextBox;



    // VIDEO RECORDER FINDERS
    @FindBy(xpath = "(//span[.='Record Video'])[1]")
    public WebElement videoRecordButton;

    @FindBy(xpath = "(//*[@class='popup-window-content'])[4]")
    public WebElement videoRecordPopUp;

    @FindBy(css = ".popup-window-button.popup-window-button-blue")
    public WebElement videoSettingAllowButton;

    // ADD TAG FINDERS
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



    // EMOJI FINDERS
    @FindBy(css = ".feed-add-grat-box")
    public List<WebElement> emojiList;

    @FindBy(css = ".feed-add-grat-box")
    public WebElement emojiButton;


}
