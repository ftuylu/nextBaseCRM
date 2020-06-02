package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class BitrixEventPage extends BitrixBasePage {
    public BitrixEventPage( ){ PageFactory.initElements(Driver.get(),this); }

    @FindBy(id="bx-b-uploadfile-blogPostForm_calendar")
    public WebElement uploadFile;

    @FindBy(name = "bxu_files[]")
    public WebElement choosefile;

    @FindBy(xpath = "//*[@id='diskuf-selectdialog-XGe4C6k']")
    public WebElement uploadsBar;

    @FindBy(xpath = "(//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link'])[2]")
    public WebElement Link;

    @FindBy(xpath = "//*[@id='linkoCalEditorcal_3Jcl-text']")
    public WebElement linkText;

    @FindBy(xpath = "//*[@id='linkoCalEditorcal_3Jcl-href']")
    public  WebElement linkURL;

    @FindBy(xpath = "//*[@id='bx-html-editor-iframe-cnt-oCalEditorcal_3Jcl']")
    public WebElement linkTextBar;

    @FindBy(xpath ="//*[@id='bx-admin-prefix']/div[2]/div[2]/input")
    public WebElement linkSave;

    @FindBy(xpath = "(//*[@id='cancel'])[1]")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[@id='bx-b-quote-blogPostForm_calendar']/span")
    public WebElement commaIcon;

    @FindBy(xpath = "//*[@id='bx-b-video-blogPostForm_calendar']/span/i")
    public WebElement insertVideoIcon;

    @FindBy(xpath = "//*[@id='video_oCalEditorcal_3Jcl-source']")
    public WebElement videoInputBox;

    @FindBy(xpath = "//*[@id='bx-admin-prefix']/div[2]/div[1]/div[2]/div/table/tbody/tr[3]/td/table/tbody/tr[1]/td[1]/label")
    public WebElement videoTitle;

    @FindBy(xpath = "//*[@id='undefined']")
    public WebElement videoSaveButton;

    @FindBy(xpath = "//*[@id='bx-admin-prefix']/div[2]/div[1]/div[2]/div/table/tbody/tr[3]/td/table")
    public WebElement videoSource;

    @FindBy(xpath = "//*[@id='bx-html-editor-iframe-cnt-oCalEditorcal_3Jcl']/iframe")
    public WebElement blockquote;

    @FindBy(xpath = "(//*[@id='post-buttons-bottom'])[2]/div")
    public  WebElement visualEditor;

    @FindBy(xpath = "//*[@id='bx-html-editor-iframe-cnt-oCalEditorcal_3Jcl']/iframe")
    public WebElement textBar;


    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement eventSendButton;


    @FindBy (name="DATE_FROM")
    public WebElement dateFrom;

    @FindBy(name="TIME_FROM_")
    public WebElement timeFrom;

    @FindBy (name="DATE_TO")
    public WebElement dateTo;

    @FindBy (name="TIME_TO_")
    public WebElement timeTo;

    @FindBy(className = "feed-ev-tz-open")
    public WebElement timeZone;

    @FindBy(name="EVENT_REMIND")
    public WebElement eventRemind;

    @FindBy(name="EVENT_REMIND_COUNT")
    public WebElement eventReminderCount;

    @FindBy(name="EVENT_REMIND_TYPE")
    public WebElement eventReminderType;

    @FindBy(name="EVENT_LOCATION")
    public WebElement eventLocation;

    @FindBy(css = "input[title='Hours']")
    public WebElement Hours;

    @FindBy(css = "input[title='Minutes']")
    public WebElement Minutes;

    @FindBy(css = "img[title='Close']")
    public WebElement Close;

    @FindBy(xpath = "//*[@id=feed-add-post-form-tab-vote]/span")
    public WebElement Poll;
    @FindBy(xpath = "((//*[@id='post-buttons-bottom'])[1]/span/span/..)[2] ")
    public WebElement pollUploadFile;

    @FindBy(linkText ="Add persons, groups or department")
    public WebElement addPersonGroupDepartment;
    public Select EventReminderType() {
        return new Select(eventReminderType);
    }
    public Select EventLocation() {
        return new Select(eventLocation);
    }

}
