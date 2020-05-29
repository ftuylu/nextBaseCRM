package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BitrixPollPage extends BitrixBasePage{

    public void BitrixPollPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "(//span[@title='Add mention'])[1]")
    public WebElement addMention;
    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public  WebElement selectContact;

}
