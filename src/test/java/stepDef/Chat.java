package stepDef;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.BigProjectTeam;
import objectPage.CompanyPage;
import objectPage.Footer;
import objectPage.GroupChat;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.Hooks;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

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

    @Given("^User already opened Staging Cicle app and click big project team$")
    public void userAlreadyOpenedStagingCicleApp() {
        companyPage = new CompanyPage(driver);
        companyPage.clickBigProjectTeam();
    }

    @When("^User click group chat in Team$")
    public void userClickGroupChat() {
        bigProjectTeam = new BigProjectTeam(driver);
        bigProjectTeam.clickGroupChat();
    }

    @And("^User click send button$")
    public void userClickSendButton() {
        groupChat = new GroupChat(driver);
        groupChat.clickSendMessageButton();
    }

    @Then("^Message is successfully sent and displayed in group chat$")
    public void messageIsSuccessfullySentAndDisplayedInGroupChat() throws InterruptedException {
        WebElement message = (WebElement) driver.findElementByXPath("//android.view.View[contains(@content-desc, 'Hello all!')]");
        Assert.assertEquals(true, message.isDisplayed());
    }

    @And("^User click attach logo$")
    public void userClickAttachLogo() {

        groupChat = new GroupChat(driver);
        groupChat.clickAttachFileButton();
    }

    @And("^User click image from gallery$")
    public void userClickImageFromGallery() throws InterruptedException {
        groupChat = new GroupChat(driver);
        groupChat.clickAttachImagefromGalleryButton();
    }

    @And("^User click image from camera$")
    public void userClickImageFromCamera() {
        groupChat = new GroupChat(driver);
        groupChat.clickAttachImagefromCameraButton();

    }

    @And("^User click shutter camera$")
    public void userClickShutterCamera() {
        groupChat = new GroupChat(driver);
        groupChat.clickShutterCameraButton();
    }

    @And("^User click checklist logo$")
    public void userClickChecklistLogo() {
        groupChat = new GroupChat(driver);
        groupChat.clickChecklistCameraButton();
    }

    @And("^User choose and click image$")
    public void userChooseAndClickImage() {
        groupChat = new GroupChat(driver);
        groupChat.clickImage();
    }

    @Then("^Image from camera is successfully sent and displayed in group chat$")
    public void imageFromCameraIsSuccessfullySentAndDisplayedInGroupChat() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Then("^Image from gallery is successfully sent and displayed in group chat$")
    public void imageFromGalleryIsSuccessfullySentAndDisplayedInGroupChat() throws InterruptedException {
        Thread.sleep(5000);
    }

    @And("User input blank data in message field")
    public void userInputBlankDataInMessageField() {
        groupChat = new GroupChat(driver);
        groupChat.clickMessageField();
    }

    @Then("User cannot send message and send button is not displayed")
    public void userCannotSendMessageAndSendButtonIsNotDisplayed() {
        WebElement sendButton = (WebElement) driver.findElementByXPath("//android.widget.Button[@index=\"6\"]");
        Assert.assertEquals(false, sendButton.isDisplayed());
    }

    @And("^User click Document & Video$")
    public void userClickDocumentVideo() {
        groupChat = new GroupChat(driver);
        groupChat.clickAttachDocumentVideoButton();
    }

    @And("^User choose and click Video$")
    public void userChooseAndClickVideo() {
        groupChat = new GroupChat(driver);
        groupChat.clickVideo();
    }
    @And("User choose and click pdf file")
    public void userChooseAndClickPdfFile() {
        groupChat = new GroupChat(driver);
        groupChat.clickPdfFile();
    }
    @Then("Video is successfully sent and displayed in group chat")
    public void videoIsSuccessfullySentAndDisplayedInGroupChat() {
        groupChat = new GroupChat(driver);

    }

    @And("User click message field")
    public void userClickMessageField() {
        groupChat = new GroupChat(driver);
        groupChat.clickMessageField();
    }

    @And("User click @ button")
    public void userClickButton() {
        groupChat = new GroupChat(driver);
        groupChat.clickMentionButton();
    }

    @And("User click mention all button")
    public void userClickMentionAllButton() {
        groupChat = new GroupChat(driver);
        groupChat.clickMentionAllButton();
    }

    @Then("Message is successfully mentioned all sent and displayed in group chat")
    public void messageIsSuccessfullyMentionedAllSentAndDisplayedInGroupChat() {
    }

    @And("User input data {string} in message field")
    public void userInputDataInMessageField(String arg0) {
        groupChat = new GroupChat(driver);
        groupChat.clickMessageField();
        groupChat.inputMessageField("Hello all!");
    }

    @And("User click on the message that they want to delete")
    public void userClickOnTheMessageThatTheyWantToDelete() {
        groupChat = new GroupChat(driver);
        groupChat.clickMessage();
    }
    @And("User click Delete button in pop up menu")
    public void userClickDeleteButtonInPopUpMenu() {
        groupChat = new GroupChat(driver);
        groupChat.clickDeleteMessage();
    }
    @And("User click OK button in the pop-up alert")
    public void userClickOKButtonInThePopUpAlert() {
        groupChat = new GroupChat(driver);
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
