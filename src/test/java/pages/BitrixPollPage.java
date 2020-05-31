package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BitrixPollPage extends BitrixBasePage{

    public BitrixPollPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "(//span[@title='Add mention'])[1]")
    public WebElement addMention;
    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public  WebElement selectContact;

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




}
