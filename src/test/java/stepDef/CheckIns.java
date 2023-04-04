package stepDef;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import runner.Hooks;

import static org.junit.Assert.assertNull;

public class CheckIns {
    public static AndroidDriver<AndroidElement> driver;
    BigProjectTeam bigProjectTeam;
    CheckInPage checkIns;
    Board board;
    GroupChatPage groupChat;
    public CheckIns() {
        super();
        this.driver = Hooks.driver;
    }

    @BeforeStep
    public void setup() {
        bigProjectTeam = new BigProjectTeam(driver);
        board = new Board(driver);
        checkIns = new CheckInPage(driver);
        groupChat = new GroupChatPage(driver);
    }

    @When("User click Check Ins in Team")
    public void userClickCheckInsInTeam() {
        bigProjectTeam.clickCheckIns();
    }

    @And("User click {string} button in Check-Ins page")
    public void userClickButtonInCheckInsPage(String arg0) {
        checkIns.clickAddCheckInsButton();
    }

    @And("User input data {string} in question field")
    public void userInputDataInQuestionField(String arg0) throws InterruptedException {
        checkIns.clickQuestionField();
        Thread.sleep(3000);
        checkIns.inputQuestionField("How is it going?");
    }

    @And("User input which day that want to ask the question")
    public void userInputWhichDayThatWantToAskTheQuestion() {
        checkIns.clickMonDay();
    }

    @And("User set the time")
    public void userSetTheTime() {
        checkIns.clickSetTimeButton();
        checkIns.clickOKSetTimeButton();
    }

    @And("User click start collecting answers! button")
    public void userClickStartCollectingAnswersButton() {
        checkIns.clickStartCollectingAnswerButton();
    }

    @Then("User should see success message and the question is successfully created")
    public void userShouldSeeSuccessMessageAndTheQuestionIsSuccessfullyCreated() throws InterruptedException {
        WebElement question = (WebElement) driver.findElementByXPath("//android.view.View[contains(@content-desc, \"How is it going?\")]");
        Assert.assertEquals(true, question.isDisplayed());
    }

    @And("User click the question that has been created")
    public void userClickTheQuestionThatHasBeenCreated() {
        checkIns.clickTheQuestion1();
    }

    @And("User click Archive button")
    public void userClickArchiveButton() {
        checkIns.clickArchiveButton();
    }

    @And("User input valid data {string} in add new comment field")
    public void userInputValidDataInAddNewCommentField(String arg0) {
        board.clickAddNewCommentField();
        checkIns.clickTellTheCommentField();
        checkIns.inputTellTheCommentField("I'm good!");
    }

    @Then("User should be able to see the comment")
    public void userShouldBeAbleToSeeTheComment() throws InterruptedException {
        Thread.sleep(7000);
        WebElement comment = (WebElement) driver.findElementByXPath("//android.view.View[contains(@content-desc, \"I'm good!\")]");
        Assert.assertEquals(true, comment.isDisplayed());
    }

    @And("User input blank data in add comment field")
    public void userInputBlankDataInAddCommentField() {
        board.clickAddNewCommentField();
        checkIns.clickTellTheCommentField();
    }

    @Then("User should not be able to submit comment")
    public void userShouldNotBeAbleToSubmitComment() {
        WebElement commentField = (WebElement) driver.findElementByXPath("//android.widget.TextView[@text=\"Tell your comment here...\"]");
        Assert.assertEquals(true, commentField.isDisplayed());
    }

    @And("User click three dots of the comment")
    public void userClickThreeDotsOfTheComment() {
        checkIns.clickThreeDotsOfComment();
    }

    @And("user click ok button")
    public void userClickOkButton() {
        groupChat.clickOkButton();
    }

    @And("User click Edit Comment button")
    public void userClickEditCommentButton() {
        checkIns.clickEditCommentButton();
    }

    @And("User input new data {string} in comment field")
    public void userInputNewDataInCommentField(String arg0) {
        checkIns.clickEditCommentField();
        checkIns.inputEditCommentField("I'm good all.");
    }

    @Then("User should see error message and the question is unsuccessfully created")
    public void userShouldSeeErrorMessageAndTheQuestionIsUnsuccessfullyCreated() {
        WebElement startCollectingButton = (WebElement) driver.findElementByAccessibilityId("Start collecting answer!");
        Assert.assertEquals(true, startCollectingButton.isDisplayed());
    }

    @Then("User should be able to see the new comment")
    public void userShouldBeAbleToSeeTheNewComment() {
        WebElement newComment = (WebElement) driver.findElementByXPath("//android.view.View[contains(@content-desc, \"I'm good all\")]");
        Assert.assertEquals(true, newComment.isDisplayed());
    }

    @Then("The comment is successfully archived")
    public void theCommentIsSuccessfullyArchived() {
        WebElement comment = null;
        try {
            comment = driver.findElement(By.xpath("//android.view.View[contains(@content-desc, \"I'm good\")]"));
        } catch (NoSuchElementException e) {
        }
        assertNull(comment);
    }

    @And("User click cheers logo")
    public void userClickCheersLogo() {
        checkIns.clickCheersButton();
    }

    @And("User input {string} in Give'em cheers field")
    public void userInputInGiveEmCheersField(String arg0) {
        checkIns.clickCheersField();
        checkIns.inputCheersField("Cheers!");
    }

    @And("User click checklist button")
    public void userClickChecklistButton() throws InterruptedException {
        checkIns.clickChecklistCheersbutton();
        Thread.sleep(7000);
    }

    @Then("The cheers is successfully created")
    public void theCheersIsSuccessfullyCreated() throws InterruptedException {
        Thread.sleep(7000);

        WebElement cheers = (WebElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Cheers!\"]");
        Assert.assertEquals(true, cheers.isDisplayed());

    }
}