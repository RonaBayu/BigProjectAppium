package objectPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CheckInPage {
    public CheckInPage(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")
    private AndroidElement addCheckInsButton;
    public void clickAddCheckInsButton(){
        addCheckInsButton.click();
    }
    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"type question here...\"]")
    private AndroidElement questionField;
    public void clickQuestionField(){
        questionField.click();
    }
    public void inputQuestionField(String keyword){
        questionField.sendKeys(keyword);
    }
    @AndroidFindBy(accessibility = "set time")
    private AndroidElement setTimeButton;
    public void clickSetTimeButton(){
        setTimeButton.click();
    }
    @AndroidFindBy(accessibility = "OK")
    private AndroidElement oKSetTimeButton;
    public void clickOKSetTimeButton(){
        oKSetTimeButton.click();
    }
    @AndroidFindBy(accessibility = "Start collecting answer!")
    private AndroidElement startCollectingAnswerButton;
    public void clickStartCollectingAnswerButton(){
        startCollectingAnswerButton.click();
    }
    @AndroidFindBy(xpath = "//android.view.View[2]/android.widget.Switch")
    private AndroidElement privateOnlySwitchButton;
    public void clickPrivateOnlySwitchButton(){
        privateOnlySwitchButton.click();
    }
    @AndroidFindBy(accessibility = "Mon")
    private AndroidElement monDay;
    public void clickMonDay(){
        monDay.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, \"How is it going?\")]")
    private AndroidElement theQuestion1;
    public void clickTheQuestion1(){
        theQuestion1.click();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Tell your comment here...\"]")
    private AndroidElement tellTheCommentField;
    public void clickTellTheCommentField(){
        tellTheCommentField.click();
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@index=\"0\"]")
    private AndroidElement tellTheCommentField1;
    public void inputTellTheCommentField(String keyword){
        tellTheCommentField1.sendKeys(keyword);
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, \"I'm good\")]/android.view.View[1]")
    private AndroidElement threeDotsOfComment;
    public void clickThreeDotsOfComment(){
        threeDotsOfComment.click();
    }

    @AndroidFindBy(accessibility = "Archive")
    private AndroidElement archiveButton;
    public void clickArchiveButton(){
        archiveButton.click();
    }

    @AndroidFindBy(accessibility = "Edit Comment")
    private AndroidElement editCommentButton;
    public void clickEditCommentButton(){
        editCommentButton.click();
    }

    @AndroidFindBy(xpath= "//android.widget.EditText[contains(@text, \"I'm good\")]")
    private AndroidElement editCommentField;
    public void clickEditCommentField(){
        editCommentField.click();
    }
    public void inputEditCommentField(String keyword){
        editCommentField.sendKeys(keyword);
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, \"Rona Bayu PQA17\")]/android.widget.ImageView[2]")
    private AndroidElement cheersButton;
    public void clickCheersButton(){
        cheersButton.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, \"Rona Bayu PQA17\")]/android.widget.EditText")
    private AndroidElement cheersField;

    public void clickCheersField(){
        cheersButton.click();
    }
    public void inputCheersField(String keyword){
        cheersButton.sendKeys(keyword);
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, \"Rona Bayu PQA17\")]/android.view.View[2]")
    private AndroidElement checklistCheersbutton;
    public void clickChecklistCheersbutton(){
        checklistCheersbutton.click();
    }

}