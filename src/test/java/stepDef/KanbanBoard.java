package stepDef;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import runner.Hooks;

public class KanbanBoard {
    public static AndroidDriver<AndroidElement> driver;
    Footer homePage;
    CompanyPage companyPage;
    BigProjectTeam bigProjectTeam;
    Board board;
    public KanbanBoard() {
        super();
        this.driver = Hooks.driver;
    }

    @BeforeStep
    public void setup() {
        companyPage = new CompanyPage(driver);
        bigProjectTeam = new BigProjectTeam(driver);
        board = new Board(driver);
    }

    @When("User click Kanban Board in Team")
    public void userClickKanbanBoardInTeam() {
        bigProjectTeam.clickBoard();
    }

    @And("User click {string} button")
    public void userClickButton(String arg0) {
        board.clickAddBoardListButton();
    }

    @And("User input board name {string} in board list name field")
    public void userInputBoardNameInBoardListNameField(String arg0) {
        board.inputBoardListNameField("Backlog");
    }

    @And("User click submit button")
    public void userClickSubmitButton() {
        board.clickSubmitButton();
    }

    @Then("Board list is successfully created")
    public void boardListIsSuccessfullyCreated() {
        WebElement board = (WebElement) driver.findElementByAccessibilityId("Backlog");
        Assert.assertEquals(true, board.isDisplayed());
    }

    @And("User click add new card button in board that has been created")
    public void userClickAddNewCardButtonInBoardThatHasBeenCreated() {
        board.clickAddNewCardButton();
    }

    @And("User input card name {string} in card name field")
    public void userInputCardNameInCardNameField(String arg0) {
        board.inputCardNameField("This is card 1");
    }

    @And("User click {string} in card name field")
    public void userClickInCardNameField(String arg0) {
        board.clickSaveCardButton();
    }

    @Then("Card is successfully created")
    public void cardIsSuccessfullyCreated() {
        WebElement card = (WebElement) driver.findElementByAccessibilityId("This is card 1\n" +
                "Show menu");
        Assert.assertEquals(true, card.isDisplayed());
    }

    @And("User input blank data in board list name field")
    public void userInputBlankDataInBoardListNameField() {
    }

    @Then("The board list is not successfully created")
    public void theBoardListIsNotSuccessfullyCreated() {
        WebElement submitButton = (WebElement) driver.findElementByAccessibilityId("Submit");
        WebElement boardNameField = (WebElement) driver.findElementByXPath("//android.widget.EditText[@text=\"Add new list...\"]");

        Assert.assertEquals(true, submitButton.isDisplayed());
        Assert.assertEquals(true, boardNameField.isDisplayed());
    }

    @And("User input blank data in board card name field")
    public void userInputBlankDataInBoardCardNameField() {
    }

    @Then("Card is not successfully created")
    public void cardIsNotSuccessfullyCreated() {

    }

    @And("User click three dots of list that want to archive")
    public void userClickThreeDotsOfListThatWantToArchive() {
        board.clickthreeDotsofListButton();
    }

    @And("User click Archive this list button")
    public void userClickArchiveThisListButton() {
        board.clickArchiveThisListButton();
    }

    @Then("The board list is successfully archived and showed success message")
    public void theBoardListIsSuccessfullyArchivedAndShowedSuccessMessage() {
    }

    @And("User click Archive all cards in this list button")
    public void userClickArchiveAllCardsInThisListButton() {
        board.clickArchiveAllCardsButton();
    }

    @Then("All cards is successfully archived and showed success message")
    public void allCardsIsSuccessfullyArchivedAndShowedSuccessMessage() {
    }

    @And("User click card that has been created")
    public void userClickCardThatWantToPrivate() {
        board.clickCard1();
    }

    @And("User click three dots besides card name")
    public void userClickThreeDotsBesidesCardName() {
        board.clickThreeDotsofCardButton();
    }

    @And("User click set card to private button")
    public void userClickSetCardToPrivateButton() {
        board.clickSetCardToPrivateButton();
    }

    @Then("The card is successfully set to private and showed message {string}")
    public void theCardIsSuccessfullySetToPrivateAndShowedMessage(String arg0) {
    }

    @And("User input blank data in add new comment field")
    public void userInputBlankDataInAddNewCommentField() {
        board.clickAddNewCommentCardField();
    }

    @And("User click submit comment button")
    public void userClickSubmitCommentButton() {
        board.clickSubmitCommentCardButton();
    }

    @Then("User is not successfully add comment and showed errror message")
    public void userIsNotSuccessfullyAddCommentAndShowedErrrorMessage() {
    }


}
