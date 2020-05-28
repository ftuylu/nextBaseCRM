package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
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

    public void loginHelpdesk() {
        String username = ConfigurationReader.get("helpdesk_username");
        String password = ConfigurationReader.get("helpdesk_password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }
    public void loginMarketing() {
        String username = ConfigurationReader.get("marketing_username");
        String password = ConfigurationReader.get("marketing_password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }
    public void loginHr() {
        String username = ConfigurationReader.get("hr_username");
        String password = ConfigurationReader.get("hr_password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }



}

