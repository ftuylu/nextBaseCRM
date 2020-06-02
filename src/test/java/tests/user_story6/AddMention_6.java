package tests.user_story6;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BitrixAppreciationPage;
import pages.BitrixPollPage;
import tests.TestBase;
import utilities.BrowserUtils;

public class AddMention_6 extends TestBase {
    @Test
    public void addMention(){
        BitrixAppreciationPage appreciationPage=new BitrixAppreciationPage();
        appreciationPage.navigateToAppreciation();
        BrowserUtils.waitFor(2);
        BitrixPollPage pollPage = new BitrixPollPage();
        pollPage.addMention.click();
        String choosen = pollPage.selectContact.getText();
        pollPage.selectContact.click();
        Assert.assertEquals(pollPage.text2.getText(), choosen, "verify add mention");
    }
}
