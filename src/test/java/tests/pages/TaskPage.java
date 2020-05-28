package tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TaskPage {

    public TaskPage() {
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







}
