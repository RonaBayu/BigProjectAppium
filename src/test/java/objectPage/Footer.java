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
    @AndroidFindBy(accessibility = "Home Tab 1 of 4")
    private AndroidElement homeIcon;
    public void clickHomeIcon(){
        homeIcon.click();
    }
    @AndroidFindBy(accessibility = "Notification Tab 2 of 4")
    private AndroidElement notificationIcon;
    public void clickNotificationIcon(){
        notificationIcon.click();
    }
    @AndroidFindBy(accessibility = "Menu Tab 4 of 4")
    private AndroidElement menuIcon;
    public void clickMenuIcon(){
        menuIcon.click();
    }

    @AndroidFindBy(accessibility = "Inbox")
    private AndroidElement inbox;
    public void clickInbox(){
        inbox.click();
    }
    @AndroidFindBy(xpath = "//android.widget.Button[@index=\"4\"]")
    private AndroidElement addChat;
    public void clickAddChat(){
        addChat.click();
    }

}
