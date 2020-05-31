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
    @FindBy(xpath = "//*[@id='bx-b-video-blogPostForm']/span")
    public  WebElement videoInsert;
    @FindBy (xpath = "//span[@id='bxid615991897']")
    public WebElement compContact;
    @FindBy (xpath = "(//iframe)[1]")
    public WebElement text;
    @FindBy (xpath = "(//span[@class='feed-add-post-destination-text'])[2]")
    public  WebElement text2;



    }

