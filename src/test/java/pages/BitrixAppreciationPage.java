package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class BitrixAppreciationPage {
    public BitrixAppreciationPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    //Adding Files
    @FindBy (css = "[title=\"Name: Whale (1).jpg\"]")
    public WebElement fileFromLocal;
    @FindBy (css = "[class=\"popup-window-button popup-window-button-accept\"]")
    public WebElement alertAfterBitrixUpload;
    @FindBy (xpath = "(//span[text()='Download from external drive'])[1]")
    public WebElement externalFileUpload;
    @FindBy (css = "\"[title='Box']\"")
    public WebElement extUplBox;
    @FindBy (xpath = "//div[contains(text(),'is not configured. Please contact your Bitrix24 administrator.')]")
    public WebElement extUplErrBox;

    //Adding Employees
    @FindBy (css = "[class='popup-window-close-icon']")
    public WebElement newEmployeedDep;
    @FindBy (css = "[class='bx-finder-box-tab bx-lm-tab-email']")
    public WebElement newUserMail;
    @FindBy (css = "[id*='last_U498']")
    public WebElement fromRecentUser;
    @FindBy (css = "id=\"microoPostFormLHE_blogPostForm_inner\"]")
    public WebElement addMessagePlace;
    @FindBy (css = "[class='popup-window-close-icon']")
    public WebElement closeButAfterChose;

    //LinkText Elements
    @FindBy(css = "[id=linkidPostFormLHE_blogPostForm-text]")
    public WebElement linkTextBox;
    @FindBy(css = "[placeholder='Link URL']")
    public WebElement linkUrlBox;
    @FindBy (css = "[value='Save']")
    public WebElement saveLinkButton;

    //AddingQuote
    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement commaIcon;
    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteTextBox;
    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;


    public void addUrlToLink(String x,String y){
        linkTextBox.sendKeys(x);
        linkUrlBox.sendKeys(y);
    }

    public void addQuoteToMessageFrame(String message){
        WebElement frameElement = Driver.get().findElement(By.className("bx-editor-iframe"));
        Driver.get().switchTo().frame(frameElement);
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.xpath("/html/body")).sendKeys(message);
        Driver.get().switchTo().parentFrame();
    }
    public void navigateToAppreciation(){
        new BitrixLoginPage().loginHr();
        MorePage morePage=new MorePage();
        morePage.navigateInMore("Appreciation");
    }

}
