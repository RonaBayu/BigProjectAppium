package objectPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Footer {

    public Footer(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "Menu\n" +
            "Tab 4 of 4")
    private AndroidElement menuIcon;
    public void clickMenuIcon(){
        menuIcon.click();
    }

    @AndroidFindBy(accessibility = "Inbox")
    private AndroidElement inbox;
    public void clickInbox(){
        inbox.click();
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")
    private AndroidElement addChat;
    public void clickAddChat(){
        addChat.click();
    }

    @AndroidFindBy(accessibility = "Rona Bayu_PQA17")
    private AndroidElement name;
    public void clickName(){
        name.click();
    }

//    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, \"Rona Bayu_PQA17\")]")
//    private AndroidElement nameReceiver;
//    public void clickNameReceiver(){
//        nameReceiver.click();
//    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, \"Hanif Fathurrahman-QA13\")]")
    private AndroidElement nameReceiver;
    public void clickNameReceiver(){
        nameReceiver.click();
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"type message...\"]")
    private AndroidElement messageField;
    public void clickMessageField(){
        messageField.click();
    }
    public void inputMessageField(String keyword){
        messageField.sendKeys(keyword);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@index=\"5\"]")
    private AndroidElement sendButton;
    public void clickSendButton(){
        sendButton.click();
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Search Name')]")
    private AndroidElement searchNameField;
    public void clickSearchNameField(){
        searchNameField.click();
    }

    public void inputSearchNameField(String keyword){
        searchNameField.sendKeys(keyword);
    }
}
