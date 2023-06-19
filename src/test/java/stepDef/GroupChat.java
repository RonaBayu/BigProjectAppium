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
import objectPage.GroupChatPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import runner.Hooks;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GroupChat {
    public static AndroidDriver<AndroidElement> driver;
    Footer footer;
    CompanyPage companyPage;
    BigProjectTeam bigProjectTeam;
    GroupChatPage groupChat;

    public GroupChat() {
        super();
        this.driver = Hooks.driver;
    }
    @BeforeStep
    public void setup() {
        companyPage = new CompanyPage(driver);
        bigProjectTeam = new BigProjectTeam(driver);
        groupChat = new GroupChatPage(driver);
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

    @And("User input blank data in message field")
    public void userInputBlankDataInMessageField() {
        groupChat.clickMessageField();
    }

    @Then("User cannot send message and send button is not displayed")
    public void userCannotSendMessageAndSendButtonIsNotDisplayed() {
        WebElement sendButton = null;
        try {
            sendButton = driver.findElement(By.xpath("//android.widget.Button[@index=\\\"6\\\"]"));
        } catch (NoSuchElementException e) {
        }
        assertNull(sendButton);
    }

    @And("^User click Document & Video$")
    public void userClickDocumentVideo() {
        groupChat.clickAttachDocumentVideoButton();
    }

    @And("User choose and click pdf file")
    public void userChooseAndClickPdfFile() {
        groupChat.clickPdfFile();
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
        WebElement namaBayu = (WebElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Rona Bayu_PQA17\"]");
        Assert.assertEquals(true, namaBayu.isDisplayed());
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
        groupChat.clickOkButton();
    }

    @Then("The message is successfully deleted and text {string} on message is displayed")
    public void theMessageIsSuccessfullyDeletedAndTextOnMessageIsDisplayed(String arg0) {
        WebElement deletedMessage = (WebElement) driver.findElementByXPath("//android.view.View[contains(@content-desc, 'This message was deleted')]");
        Assert.assertEquals(true, deletedMessage.isDisplayed());
    }

    @Then("pdf file is successfully sent and displayed in group chat")
    public void pdfFileIsSuccessfullySentAndDisplayedInGroupChat() {
        WebElement pdfFile = (WebElement) driver.findElementByXPath("//android.widget.ImageView[contains(@content-desc, 'File pdf.pdf')]");
        Assert.assertEquals(true, pdfFile.isDisplayed());
    }

    @And("User choose and click word file")
    public void userChooseAndClickWordFile() {
        groupChat.clickWordFile();
    }

    @Then("Word file is successfully sent and displayed in group chat")
    public void wordFileIsSuccessfullySentAndDisplayedInGroupChat() {
        WebElement wordFile = (WebElement) driver.findElementByXPath("//android.widget.ImageView[contains(@content-desc, 'File word.docx')]");
        Assert.assertEquals(true, wordFile.isDisplayed());
    }

    @And("User choose and click excel file")
    public void userChooseAndClickExcelFile() {
        groupChat.clickExcelFile();
    }

    @Then("Excel file is successfully sent and displayed in group chat")
    public void excelFileIsSuccessfullySentAndDisplayedInGroupChat() {
        WebElement excelFile = (WebElement) driver.findElementByXPath("//android.widget.ImageView[contains(@content-desc, 'File excel.xlsx')]");
        Assert.assertEquals(true, excelFile.isDisplayed());
    }

    @And("User choose and click txt file")
    public void userChooseAndClickTxtFile() {
        groupChat.clickTxtFile();
    }

    @Then("Txt file is unsuccessfully sent")
    public void txtFileIsUnsuccessfullySent() {
        WebElement txtFile = null;
        try {
            txtFile = driver.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc, 'File txt.txt')]"));
        } catch (NoSuchElementException e) {
        }
        assertNull(txtFile);
    }

    @And("User choose and click apk file")
    public void userChooseAndClickApkFile() {
        groupChat.clickApkFile();
    }

    @Then("Apk file is unsuccessfully sent")
    public void apkFileIsUnsuccessfullySent() {
        WebElement apkFile = null;
        try {
            apkFile = driver.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc, 'Apk file.apk')]"));
        } catch (NoSuchElementException e) {
        }
        assertNull(apkFile);
    }
}
