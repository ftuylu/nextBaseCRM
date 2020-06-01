package tests.user_story6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.BitrixAppreciationPage;
import tests.TestBase;
import utilities.BrowserUtils;

public class AddingQuote_5 extends TestBase {
    @Test
    public void addingQuote(){
        BitrixAppreciationPage appreciationPage=new BitrixAppreciationPage();
        appreciationPage.navigateToAppreciation();
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForVisibility(appreciationPage.commaIcon, 5).click();
        BrowserUtils.waitFor(2);
        driver.switchTo().frame( driver.findElement(By.xpath("//form//iframe")));
        appreciationPage.quoteTextBox.sendKeys("Are you working hard or Hardly workin'?");
        BrowserUtils.waitFor(2);
        driver.switchTo().parentFrame();
        appreciationPage.sendButton.click();
    }
}
