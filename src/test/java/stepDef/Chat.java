package stepDef;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.BigProjectTeam;
import objectPage.CompanyPage;
import objectPage.Footer;
import objectPage.GroupChat;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import runner.Hooks;

public class Chat {
    public static AndroidDriver<AndroidElement> driver;
    Footer footer;
    CompanyPage companyPage;
    BigProjectTeam bigProjectTeam;
    GroupChat groupChat;

    public Chat() {
        super();
        this.driver = Hooks.driver;
    }

    @BeforeStep
    public void setup() {
        companyPage = new CompanyPage(driver);
        bigProjectTeam = new BigProjectTeam(driver);
        groupChat = new GroupChat(driver);
    }

    @Given("^User already opened Staging Cicle app and click big project team$")
    public void userAlreadyOpenedStagingCicleApp() {
        companyPage.clickBigProjectTeam();
    }

    @When("^User click group chat in Team$")
    public void userClickGroupChat() {
        bigProjectTeam.clickGroupChat();
    }

    @And("^User click send button$")
    public void userClickSendButton() {
        groupChat.clickSendMessageButton();
    }

    @Then("^Message is successfully sent and displayed in group chat$")
    public void messageIsSuccessfullySentAndDisplayedInGroupChat() throws InterruptedException {
        WebElement message = (WebElement) driver.findElementByXPath("//android.view.View[contains(@content-desc, 'Hello all!')]");
        Assert.assertEquals(true, message.isDisplayed());
    }

    @And("^User click attach logo$")
    public void userClickAttachLogo() {
        groupChat.clickAttachFileButton();
    }

    @And("^User click image from gallery$")
    public void userClickImageFromGallery() throws InterruptedException {
        groupChat.clickAttachImagefromGalleryButton();
    }

    @And("^User click image from camera$")
    public void userClickImageFromCamera() {
        groupChat.clickAttachImagefromCameraButton();
    }

    @And("^User click shutter camera$")
    public void userClickShutterCamera() {
        groupChat.clickShutterCameraButton();
    }

    @And("^User click checklist logo$")
    public void userClickChecklistLogo() {
        groupChat.clickChecklistCameraButton();
    }

    @And("^User choose and click image$")
    public void userChooseAndClickImage() {
        groupChat.clickImage();
    }

    @Then("^Image from camera is successfully sent and displayed in group chat$")
    public void imageFromCameraIsSuccessfullySentAndDisplayedInGroupChat() throws InterruptedException {
    }

    @Then("^Image from gallery is successfully sent and displayed in group chat$")
    public void imageFromGalleryIsSuccessfullySentAndDisplayedInGroupChat() throws InterruptedException {
    }

    @And("User input blank data in message field")
    public void userInputBlankDataInMessageField() {
        groupChat.clickMessageField();
    }

    @Then("User cannot send message and send button is not displayed")
    public void userCannotSendMessageAndSendButtonIsNotDisplayed() {
        WebElement sendButton = (WebElement) driver.findElementByXPath("//android.widget.Button[@index=\"6\"]");
        Assert.assertEquals(false, sendButton.isDisplayed());
    }

    @And("^User click Document & Video$")
    public void userClickDocumentVideo() {
        groupChat.clickAttachDocumentVideoButton();
    }

    @And("^User choose and click Video$")
    public void userChooseAndClickVideo() {
        groupChat.clickVideo();
    }

    @And("User choose and click pdf file")
    public void userChooseAndClickPdfFile() {
        groupChat.clickPdfFile();
    }

    @Then("Video is successfully sent and displayed in group chat")
    public void videoIsSuccessfullySentAndDisplayedInGroupChat() {
        groupChat = new GroupChat(driver);
    }

    @And("User click message field")
    public void userClickMessageField() {
        groupChat.clickMessageField();
    }

    @And("User click @ button")
    public void userClickButton() {
        groupChat.clickMentionButton();
    }

    @And("User click mention all button")
    public void userClickMentionAllButton() {
        groupChat.clickMentionAllButton();
    }

    @Then("Message is successfully mentioned all sent and displayed in group chat")
    public void messageIsSuccessfullyMentionedAllSentAndDisplayedInGroupChat() {
    }

    @And("User input data {string} in message field")
    public void userInputDataInMessageField(String arg0) {
        groupChat.clickMessageField();
        groupChat.inputMessageField("Hello all!");
    }

    @And("User click on the message that they want to delete")
    public void userClickOnTheMessageThatTheyWantToDelete() {
        groupChat.clickMessage();
    }

    @And("User click Delete button in pop up menu")
    public void userClickDeleteButtonInPopUpMenu() {
        groupChat.clickDeleteMessage();
    }

    @And("User click OK button in the pop-up alert")
    public void userClickOKButtonInThePopUpAlert() {
        groupChat.clickOkDeleteMessage();
    }

    @Then("The message is successfully deleted and text {string} on message is displayed")
    public void theMessageIsSuccessfullyDeletedAndTextOnMessageIsDisplayed(String arg0) {
        WebElement deletedMessage = (WebElement) driver.findElementByXPath("//android.view.View[contains(@content-desc, 'This message was deleted')]");
        Assert.assertEquals(true, deletedMessage.isDisplayed());
    }

    @Then("pdf file is successfully sent and displayed in group chat")
    public void pdfFileIsSuccessfullySentAndDisplayedInGroupChat() {
        WebElement pdfFile = (WebElement) driver.findElementByXPath("//android.widget.ImageView[contains(@content-desc, 'File pdf.docx')]");
        Assert.assertEquals(true, pdfFile.isDisplayed());
    }

}
