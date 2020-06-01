package pages;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import utilities.Driver;

public class BitrixMessagePage extends BitrixBasePage {

    public BitrixMessagePage(){
        PageFactory.initElements(Driver.get(), this);
    }
          @FindBy(id="feed-add-post-form-tab-message")
          public WebElement Message;

          @FindBy(css = ".bx-finder-box-tab.bx-lm-tab-email")
          public WebElement EmailUsers;

          @FindBy(css = ".bx-finder-box-tab.bx-lm-tab-department")
          public WebElement EmployeesAndDepart;

          @FindBy(css = ".bx-finder-box-tab.bx-lm-tab-last.bx-finder-box-tab-selected")
          public WebElement Recent;

          @FindBy(xpath = "(//span[@title='Link'])[1]")
          public WebElement Link;

          @FindBy(xpath = "//span[@title='Insert video']")
           public WebElement InsertVideo;

          @FindBy(xpath = "//span[@title='Quote text']")
           public WebElement QuoteText;

          @FindBy(xpath = "//blockquote")
          public WebElement QuoteBox;

          @FindBy(id = "bx-b-mention-blogPostForm")
           public WebElement Addmention;

          @FindBy(xpath = "//span[@title='Add tag']")
           public WebElement Addtag;

          @FindBy(xpath = "(//span[.='Record Video'])[1]")
           public WebElement RecordVideo;

          @FindBy(xpath = "(//span[@title='Visual editor'])[1]")
          public WebElement VisualEditor;

          @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
          public WebElement editorTextBar;


          @FindBy(xpath = "//span[@title='Topic']")
          public WebElement Topic;

          @FindBy(id = "POST_TITLE")
          public WebElement TopicText;




}







