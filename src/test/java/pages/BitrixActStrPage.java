package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BitrixActStrPage extends BitrixBasePage{

    public BitrixActStrPage( ){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id="feed-add-post-form-tab-vote")
    public WebElement poll;






}
