package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPageForUserStory2 {

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

    @FindBy(xpath = "(//div[@id='bx-lm-category-relation-129']/a)[1]") //ilk siradaki mail(kullanici adi)
    public WebElement userMail;

    @FindBy(xpath = "(//span[@class='bxhtmled-metion']") //metin kutusundaki yazi
    public WebElement userMailInTheTexBox;





}
