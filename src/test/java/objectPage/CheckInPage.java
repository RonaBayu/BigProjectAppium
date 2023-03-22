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
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"set time\"]]")
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


}
