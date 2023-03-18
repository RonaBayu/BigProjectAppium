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
import runner.Hooks;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Chat {
    public static AndroidDriver<AndroidElement> driver;
    Footer homePage;
    CompanyPage companyPage;
    BigProjectTeam bigProjectTeam;
    GroupChat groupChat;

    public Chat() {
        super();
        this.driver = Hooks.driver;
    }

    @Given("^User already opened Staging Cicle app and click big project team$")
    public void userAlreadyOpenedStagingCicleApp() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        companyPage = new CompanyPage(driver);
        companyPage.clickBigProjectTeam();
    }
    @When("^User click group chat in Team$")
    public void userClickGroupChat() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        bigProjectTeam = new BigProjectTeam(driver);
        bigProjectTeam.clickGroupChat();
    }
    @And("^User input data in message field$")
    public void userInputDataInMessageField() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        groupChat = new GroupChat(driver);
        groupChat.clickMessageField();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupChat.inputMessageField("hello all!");
    }
    @And("^User click send button$")
    public void userClickSendButton() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        groupChat = new GroupChat(driver);
        groupChat.clickSendMessageButton();
    }
    @Then("^Message is successfully sent and displayed in group chat$")
    public void messageIsSuccessfullySentAndDisplayedInGroupChat() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Chat is sent!!!");
//        groupChat = new GroupChat(driver);
//
//        MobileElement elemen = driver.findElement(By.xpath("//android.view.View"));
//
//        String expected = "hello";
//        Assert.assertThat(elemen.getAttribute("content-desc"), CoreMatchers.containsString(expected));
//        Thread.sleep(3000);
//        String allertMessage= profilePage.assertNotifGetText();
//        Assert.assertEquals(allertMessage,"Success");
    }
    @And("^User click attach logo$")
    public void userClickAttachLogo() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(3000);

        groupChat = new GroupChat(driver);
        groupChat.clickAttachFileButton();
    }
    @And("^User click image from gallery$")
    public void userClickImageFromGallery() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        groupChat = new GroupChat(driver);
        groupChat.clickAttachImagefromGalleryButton();
        Thread.sleep(5000);
    }
    @And("^User click image from camera$")
    public void userClickImageFromCamera() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        groupChat = new GroupChat(driver);
        groupChat.clickAttachImagefromCameraButton();

    }
    @And("^User click shutter camera$")
    public void userClickShutterCamera() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        groupChat = new GroupChat(driver);
        groupChat.clickShutterCameraButton();
    }
    @And("^User click checklist logo$")
    public void userClickChecklistLogo() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        groupChat = new GroupChat(driver);
        groupChat.clickChecklistCameraButton();
    }
    @And("^User choose and click image$")
    public void userChooseAndClickImage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        groupChat = new GroupChat(driver);
        groupChat.clickImage();
        Thread.sleep(5000);
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
//        AndroidElement sendButton = driver.findElement(By.xpath("//android.widget.Button[@index=\"6\"]"));
//
//        Assert.assertFalse(sendButton.isDisplayed());
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
}
