package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(css = "#linklifefeed_task_form-text")// url text
    public WebElement linkUrlText;

    public void attachLink(String saveOrCancel) {            //save or cancel
        String locator = "input[value='" + saveOrCancel + "']";
        Driver.get().findElement(By.cssSelector(locator)).click();
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

    public void selectContact(String contact, String name) {            //E-mail user, Employees and Departments and Recent contact lists
        String contactLocator = ".bx-lm-tab-" + contact;           //last-department-email
        Driver.get().findElement(By.cssSelector(contactLocator)).click();

        String nameLocator = "//div[.='" + name + "']/div";
        Driver.get().findElement(By.xpath(nameLocator)).click();
    }

    public void assignmentCategory(String category) {
        String categoryLocator = "//span[contains(text(),'" + category + "')])[1]";
        Driver.get().findElement(By.cssSelector(categoryLocator)).click();
    }


    @FindBy(xpath = "(//a[contains(text(),'Change')])[3]")
    public WebElement change;

}