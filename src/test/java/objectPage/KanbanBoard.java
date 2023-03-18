package objectPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class KanbanBoard {
    private AndroidDriver<AndroidElement> driver;
    public KanbanBoard(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.Button[@index=\"2\"]")
    private AndroidElement addBoardListButton;
    public void clickAddBoardListButton(){
        addBoardListButton.click();
    }
    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Add new list...\"]")
    private AndroidElement boardListNameField;
    public void inputBoardListNameField(String keyword){
        boardListNameField.sendKeys(keyword);
    }
    @AndroidFindBy(accessibility = "Submit")
    private AndroidElement submitBoardButton;
    public void clickBoardSubmitButton(){
        submitBoardButton.click();
    }
    @AndroidFindBy(accessibility = "Add new card")
    private AndroidElement addNewCardButton;
    public void clickAddNewCardButton(){
        addNewCardButton.click();
    }
    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Your card name\"]")
    private AndroidElement cardNameField;
    public void inputCardNameField(String keyword){
        cardNameField.sendKeys(keyword);
    }
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View")
    private AndroidElement saveCardButton;
    public void clickSaveCardButton(){
        saveCardButton.click();
    }
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Private Card\"]/android.widget.Switch")
    private AndroidElement privateCardSwitchButton;
    public void clickPrivateCardSwitchButton() {
        privateCardSwitchButton.click();
    }
    @AndroidFindBy(accessibility = "Attach file")
    private AndroidElement attachFileinCardButton;
    public void clickAttachFileinCardButton(){
        attachFileinCardButton.click();
    }

    @AndroidFindBy(accessibility = "Add new comment...")
    private AndroidElement addNewCommentCardButton;
    public void clickAddNewCommentCardButton(){
        addNewCommentCardButton.click();
    }

}
