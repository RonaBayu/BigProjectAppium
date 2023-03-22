package objectPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BigProjectTeam {
    public BigProjectTeam(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "Group Chat")
    private AndroidElement groupChat;
    public void clickGroupChat(){
        groupChat.click();
    }
    @AndroidFindBy(accessibility = "Board")
    private AndroidElement board;
    public void clickBoard(){
        board.click();
    }
    @AndroidFindBy(accessibility = "Check-Ins")
    private AndroidElement checkIns;
    public void clickCheckIns(){
        checkIns.click();
    }

}
