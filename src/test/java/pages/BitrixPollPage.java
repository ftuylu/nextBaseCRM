package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class BitrixPollPage extends BitrixBasePage{
    public  BitrixPollPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void loginPollPage(){

        BitrixLoginPage loginPage =new BitrixLoginPage();
        loginPage.loginHelpdesk();

        BitrixActStrPage pollBtn =new BitrixActStrPage();
        pollBtn.poll.click();

        BitrixPollPage pollPage =new BitrixPollPage();
        BrowserUtils.waitFor(2);
    }
    @FindBy(xpath = "//*[@id='bx-b-mention-blogPostForm']")
    public WebElement addMention;
    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public  WebElement selectContact;
    @FindBy (xpath = "(//span[@class='feed-add-post-destination-text'])[2]")
    public  WebElement text2;
    @FindBy(id ="lhe_button_editor_blogPostForm" )
    public WebElement visualEditor;
    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    public WebElement visualBar;
    //@FindBy(id="lhe_button_title_blogPostForm")
    @FindBy(xpath ="//span[@title='Topic']" )
    public WebElement topicBtn;
    @FindBy(xpath = "//input[@id='POST_TITLE']")
    public WebElement topicMessBox;
    @FindBy(xpath = "(//span[contains(text(),'Record Video')])[1]")
    public WebElement videoRecorderBtn;
    @FindBy(css = "span.popup-window-button.popup-window-button-blue")
    public WebElement popupAllowBtn;



    }

