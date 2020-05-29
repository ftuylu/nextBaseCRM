package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

public class BitrixActStrPage extends BitrixBasePage{

    public BitrixActStrPage( ){
        PageFactory.initElements(Driver.get(),this);
    }


    public void navigateActiveStream(String module, String tab){

        String moduleLocator = "//a[@title='" + module + "']";
        Driver.get().findElement(By.xpath(moduleLocator)).click();
        BrowserUtils.waitForVisibility(By.xpath(moduleLocator),3);

        String tabLocator= "(//span[.='"+tab+"'])[1]";
        Driver.get().findElement(By.xpath(tabLocator)).click();
    }






}
