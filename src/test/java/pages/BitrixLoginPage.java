package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class BitrixLoginPage {


    public BitrixLoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;


    public void login(String usernameStr, String passwordStr) {

        usernameInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();
    }


}
