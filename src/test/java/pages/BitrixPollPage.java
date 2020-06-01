package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class BitrixPollPage extends BitrixBasePage{


    public BitrixPollPage(){

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
    @FindBy(xpath = "//*[@id='bx-b-video-blogPostForm']/span")
    public  WebElement videoInsert;
    @FindBy (xpath = "//span[@id='bxid615991897']")
    public WebElement compContact;
    @FindBy (xpath = "(//iframe)[1]")
    public WebElement text;
    @FindBy (xpath = "(//span[@class='feed-add-post-destination-text'])[2]")
    public  WebElement text2;

    @FindBy(xpath = "(//span[@title='Upload files'])[1]")
    public WebElement uploadFileButton;

    @FindBy(id = "feed-add-post-destination-input-box")
    public WebElement toPeopleBox;

    @FindBy(xpath = "(//span[@title='Link'])[1]")
    public WebElement linkIcon;

    @FindBy(xpath = "(//span[@title='Insert video'])")
    public WebElement videoIcon;

    @FindBy(xpath = "(//span[@title='Quote text'])")
    public WebElement insertQuotebutton;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement getUploadFileButton;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkTextBox;

    @FindBy(css = "input[value*=\"Save\"]")
    public WebElement linkTextBoxSaveButton;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoUrlBox;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement addQuoteTextBox;




}

