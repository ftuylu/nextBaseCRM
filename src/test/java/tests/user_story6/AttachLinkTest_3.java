package tests.user_story6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BitrixAppreciationPage;
import tests.TestBase;
import utilities.BrowserUtils;
public class AttachLinkTest_3 extends TestBase {

    @Test
    public void linkButtontTest(){
        BitrixAppreciationPage appreciationPage=new BitrixAppreciationPage();
        appreciationPage.navigateToAppreciation();
        BrowserUtils.waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"bx-b-link-blogPostForm\"]")).click();
        BrowserUtils.waitFor(1);
        appreciationPage.addUrlToLink("Google","www.google.com");
        appreciationPage.saveLinkButton.click();
        WebElement frameElement = driver.findElement(By.className("bx-editor-iframe"));
        driver.switchTo().frame(frameElement);
        BrowserUtils.waitFor(1);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body")).getText()!=null);
    }
}
