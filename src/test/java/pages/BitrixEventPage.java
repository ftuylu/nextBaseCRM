package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import java.util.List;

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


    //Event Start Date
    @FindBy (name="DATE_FROM")
    public WebElement dateFrom;

    @FindBy (className="bx-calendar-top-month")
    public WebElement topMonth;

    @FindBy (className="bx-calendar-month")
    public WebElement Month;

    public Select Month() {
        return new Select(Month);
    }

    @FindBy (className="bx-calendar-top-year")
    public WebElement topYear;

    @FindBy (xpath = "(//span[@class ='bx-calendar-year-number'])[4]")
    public WebElement Year;

    @FindBy (xpath = " (//a[@class='bx-calendar-cell'])[4]")
    public WebElement startDay;

   //Event Start Time

    @FindBy(name="TIME_FROM_")
    public WebElement timeFrom;


    @FindBy(css ="input[title='Hours']")
    public WebElement hours;

    @FindBy(css ="input[title='Minutes']")
    public WebElement minutes;

    @FindBy(css = "input[value='Set Time']")
    public WebElement setTime;
//Event End Date
    @FindBy (name="DATE_TO")
    public WebElement dateTo;


//Event End Time
    @FindBy (name="TIME_TO_")
    public WebElement timeTo;

//Event TimeZone
    @FindBy(className = "feed-ev-tz-open")
    public WebElement timeZone;

//Event Reminder

    @FindBy(name="EVENT_REMIND")
    public WebElement eventRemind;

    @FindBy(name="EVENT_REMIND_COUNT")
    public WebElement eventReminderCount;

    @FindBy(name="EVENT_REMIND_TYPE")
    public WebElement eventReminderType;


    public Select EventReminderType() {
        return new Select(eventReminderType);
    }
//Event Location
    @FindBy(name="EVENT_LOCATION")
    public WebElement eventLocation;

    @FindBy(id = "event-location-newcal_3Jcl")
    public WebElement locationName;

//Event Add Employee or Department
    @FindBy(id = "feed-event-dest-add-link")
    public WebElement addPeople;
    @FindBy(linkText = "Employees and departments")
    public WebElement addMore;

    @FindBy(linkText ="Add persons, groups or department")
    public WebElement addPersonGroupDepartment;

    @FindBy(xpath = "//a[@class='bx-finder-company-department-employee  bx-finder-element'][3]")
    public WebElement pickEmail;
    @FindBy(xpath = "//*[@id='bx-lm-category-relation-129']/a[3]/div[1]/div[1]")
    public WebElement getEmailName;


    @FindBy(className = "feed-event-destination-text")
    public WebElement inputEmail;

    //a[text()='Employees and departments']

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

    public Select EventLocation() {
        return new Select(eventLocation);
    }


//Event More Button
    @FindBy(className = "feed-event-more-link-text")
    public WebElement More;

    @FindBy(id = "feed-cal-additional-inner")
    public WebElement eventDetails;




}
