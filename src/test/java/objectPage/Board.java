package objectPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Board {
    public Board(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")
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
    private AndroidElement submitButton;
    public void clickSubmitButton(){
        submitButton.click();
    }

    @AndroidFindBy(accessibility = "submit")
    private AndroidElement submitCommentCardButton;
    public void clickSubmitCommentCardButton(){
        submitCommentCardButton.click();
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
    private AndroidElement addNewCommentCardField;
    public void clickAddNewCommentCardField(){
        addNewCommentCardField.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")
    private AndroidElement threeDotsofListButton;
    public void clickthreeDotsofListButton() {
        threeDotsofListButton.click();
    }

    @AndroidFindBy(accessibility = "Archive all cards in this list")
    private AndroidElement archiveAllCardsButton;
    public void clickArchiveAllCardsButton(){
        archiveAllCardsButton.click();
    }

    @AndroidFindBy(accessibility = "Archive this list")
    private AndroidElement archiveThisListButton;
    public void clickArchiveThisListButton(){
        archiveThisListButton.click();
    }

    @AndroidFindBy(accessibility = "Set as a Complete List")
    private AndroidElement setAsACompleteListButton;
    public void clickSetAsACompleteListButton(){
        setAsACompleteListButton.click();
    }

    @AndroidFindBy(accessibility = "Set as a Complete List")
    private AndroidElement completeListLogo;
    public void completeListLogoIsDisplayed(){
        completeListLogo.isDisplayed();
    }

    @AndroidFindBy(accessibility = "This is card 1\n" +
            "Show menu")
    private AndroidElement card1;
    public void clickCard1(){
        card1.click();
    }
    @AndroidFindBy(accessibility = "Show menu")
    private AndroidElement threeDotsofCardButton;
    public void clickThreeDotsofCardButton() {
        threeDotsofCardButton.click();
    }

    @AndroidFindBy(accessibility = "Set card to private")
    private AndroidElement setCardToPrivateButton;
    public void clickSetCardToPrivateButton() {
        setCardToPrivateButton.click();
    }

    @AndroidFindBy(accessibility = "Share card link")
    private AndroidElement shareCardLinkButton;
    public void clickShareCardLinkButton() {
        shareCardLinkButton.click();
    }

    @AndroidFindBy(accessibility = "Move card")
    private AndroidElement moveCardButton;
    public void clickMoveCardButton() {
        moveCardButton.click();
    }

    @AndroidFindBy(accessibility = "Copy card")
    private AndroidElement copyCardButton;
    public void clickCopyCardButton() {
        copyCardButton.click();
    }


}

