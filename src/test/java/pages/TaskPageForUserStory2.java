package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TaskPageForUserStory2 extends BitrixBasePage {

    public TaskPageForUserStory2() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@class='feed-add-post-form-link']/span[.='Task']")
    public WebElement taskButton;

    @FindBy(css = "#tasks-task-priority-cb")
    public WebElement highPriorityBox;

    @FindBy(css = "#lhe_button_editor_task-form-lifefeed_task_form")
    public WebElement visualEditorButton;

    @FindBy(css = "#bx-html-editor-tlbr-lifefeed_task_form")
    public WebElement texBar;

    @FindBy(css = "#bx-b-quote-task-form-lifefeed_task_form")
    public WebElement comaButton;

    @FindBy(css = ".bxhtmled-quote")
    public WebElement qoute;

    @FindBy(css = "#bx-b-mention-task-form-lifefeed_task_form")
    public WebElement addMentionIcon;

    @FindBy(css = "[id^='destDepartmentTab_']") //id dinamik. contains demek id^
    public WebElement employeeAndDepartments;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[1]/div[1]/div[1]") //ilk siradaki mail(kullanici adi)
    public WebElement userMail;

    @FindBy(xpath = "(//span[@class='bxhtmled-metion']") //metin kutusundaki yazi
    public WebElement userMailInTheTexBox;


    @FindBy(xpath = "(//span[@title='Link'])[2]") // link icon
    public WebElement linkIcon;

    @FindBy(css = "#linklifefeed_task_form-text") // link text
    public WebElement linkText;

    @FindBy(css = "#linklifefeed_task_form-href")// url text
    public WebElement linkUrlText;

    @FindBy(css = "input[value='save'")// link save
    public WebElement linkSave;

    @FindBy(css = "input[value='cancel'")// link cancel
    public WebElement linkcancel;

    public void attachLink(String text, String urlText) {
       linkIcon.click();
       linkUrlText.sendKeys(text);
       linkUrlText.sendKeys(urlText);
       linkSave.click();
    }

    @FindBy(xpath = "//span[.='Checklist']")
    public WebElement checklist;

    @FindBy(css = ".js-id-checklist-is-form-title")
    public WebElement checklistText;

    public void checklistSubmit(String submitOrclose) {            //submit or close
        String locator = ".js-id-checklist-is-form-" + submitOrclose;
        Driver.get().findElement(By.cssSelector(locator)).click();
    }

    @FindBy(css = ".js-id-checklist-is-open-form")
    public WebElement addChecklist;

    @FindBy(css = ".js-id-checklist-add-separator")
    public WebElement separatorChecklist;

    @FindBy(xpath = "(//a[contains(text(),'Add more')])[2]")
    public WebElement responsibleAddMore;

    public void responsibleAdd(String contact, String name) {            //E-mail user, Employees and Departments and Recent contact lists
        responsibleAddMore.click();
        String contactLocator = ".bx-lm-tab-" + contact;           //name --> last , department or email
        Driver.get().findElement(By.cssSelector(contactLocator)).click();

        String nameLocator = "//div[.='" + name + "']/div";
        Driver.get().findElement(By.xpath(nameLocator)).click();
    }
    public void assignmentCategory(String category) {
        String categoryLocator = "//span[contains(text(),'" + category + "')])[1]"; // location --> "Created by" , "Participants", "Observers"
        Driver.get().findElement(By.cssSelector(categoryLocator)).click();
    }

    @FindBy(xpath = "(//a[contains(text(),'Change')])[3]")
    public WebElement ChangeCreatedBy;

    @FindBy(xpath = "(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-empty task-form-field-link add'])[2]")
    public WebElement AddParticipants;

    @FindBy(xpath = "(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-empty task-form-field-link add'])[2]")
    public WebElement AddObserves;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[1]") // Deadline picker
    public WebElement deadline;

    @FindBy(xpath = " //.bx-calendar-right-arrow") // Calender Right Arrow
    public WebElement CalenderRightArrow;

    @FindBy(xpath = " //.bx-calendar-right-arrow") // Calender Left Arrow
    public WebElement CalenderLeftArrow;

    @FindBy(xpath ="//span[.='Time planning']")
    public WebElement timePlanning;

    @FindBy(css = "a[data-action='time_ampm_up']") //AM or PM arrow up
    public WebElement amPmUp;

    @FindBy(css = "a[data-action='time_ampm_down']") //AM or PM arrow down
    public WebElement amPmdown;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[2]") //Start date
    public WebElement startTaskOn;

    @FindBy(xpath = "//input[@*='dateplanmanager-duration']")  //Duration
    public WebElement duration;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[3]") //Finish date
    public WebElement finishTaskOn;

    @FindBy(css = ".task-additional-alt-more")  //More to specify the task details
    public WebElement More;

    public void datePicker(String day, String month, String year, String hour,String minute) {

        String dayLocator = "//a[.='" + day + "']";
        Driver.get().findElement(By.xpath(dayLocator)).click();

        Driver.get().findElement(By.cssSelector(".bx-calendar-top-year")).click();
        String yearInput = ".bx-calendar-year-input";
        Driver.get().findElement(By.xpath(yearInput)).sendKeys(year);

        Driver.get().findElement(By.cssSelector(".bx-calendar-top-month")).click();
        String monthLocator = "//span[.='" + month + "']";
        Driver.get().findElement(By.xpath(monthLocator)).click();

        Driver.get().findElement(By.xpath("\"bx-calendar-form-input\"")).sendKeys(hour);
        Driver.get().findElement(By.xpath("\"bx-calendar-form-input\"")).sendKeys(minute);
        Driver.get().findElement(By.xpath("//span[.='Select']")).click();

    }
    public void setDuration(String unitOfTime,String amountOfTime) {
        if (unitOfTime == "day") {
            Driver.get().findElement(By.xpath("//span[.='days']")).click();
            duration.sendKeys(amountOfTime);
        } else if (unitOfTime == "hour") {
            Driver.get().findElement(By.xpath("//span[.='hours']")).click();
            duration.sendKeys(amountOfTime);
        } else if (unitOfTime == "minute") {
            Driver.get().findElement(By.xpath("//span[.='minutes']")).click();
            duration.sendKeys(amountOfTime);
        }
    }

}