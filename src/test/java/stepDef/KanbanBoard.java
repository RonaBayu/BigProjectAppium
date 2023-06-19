package stepDef;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
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

    @And("User click the submit button")
    public void userClickTheSubmitButton() {
        board.clickSubmitButton1();
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
        WebElement addNewCardButton = (WebElement) driver.findElementByAccessibilityId("Add new card");

        Assert.assertEquals(true, addNewCardButton.isDisplayed());
    }

    @And("User click three dots of list")
    public void userClickThreeDotsOfListThatWantToArchive() {
        board.clickthreeDotsofListButton();
    }

    @And("User click Archive this list button")
    public void userClickArchiveThisListButton() {
        board.clickArchiveThisListButton();
    }

    @Then("The board list is successfully archived and showed success message")
    public void theBoardListIsSuccessfullyArchivedAndShowedSuccessMessage() {
        WebElement list = null;
        try {
            list = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Backlog\"]"));
        } catch (NoSuchElementException e) {
        }
        assertNull(list);
    }

    @And("User click Archive all cards in this list button")
    public void userClickArchiveAllCardsInThisListButton() {
        board.clickArchiveAllCardsButton();
    }

    @Then("All cards is successfully archived and showed success message")
    public void allCardsIsSuccessfullyArchivedAndShowedSuccessMessage() {
        WebElement card = null;
        try {
            card = driver.findElement(By.xpath("//android.widget.Button[contains(@content-desc, \"This is card 1\")]"));
        } catch (NoSuchElementException e) {
        }
        assertNull(card);
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
        board.clickAddNewCommentField();
    }

    @And("User click submit comment button")
    public void userClickSubmitCommentButton() {
        board.clickSubmitButton();
    }

    @Then("User is not successfully add comment and showed error message")
    public void userIsNotSuccessfullyAddCommentAndShowedErrorMessage() {
        WebElement submitButton = (WebElement) driver.findElementByAccessibilityId("submit");
        Assert.assertEquals(true, submitButton.isDisplayed());
    }

    @And("User click set as a complete list button")
    public void userClickSetAsACompleteListButton() {
        board.clickSetAsACompleteListButton();
    }

    @Then("The list is set as a complete")
    public void theListIsSetAsAComplete() {
        board.completeListLogoIsDisplayed();
    }

    @And("User click unset complete list button")
    public void userClickUnsetCompleteListButton() {
        board.clickUnsetCompleteListButton();
    }

    @Then("The list is unset as a complete")
    public void theListIsUnsetAsAComplete() {
        WebElement checklistLogo = null;
        try {
            checklistLogo = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Show menu\"]");
        } catch (NoSuchElementException e) {
        }
        assertNull(checklistLogo);
    }

    @And("User input blank data in label name field")
    public void userInputBlankDataInLabelNameField() {
    }

    @And("User click +label button")
    public void userClickLabelButton() {
        WebElement labelButton = (WebElement) driver.findElementByXPath("//android.view.View[@content-desc=\"This is card 1\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]");
        labelButton.click();
    }

    @Then("The label is not successfully added")
    public void theLabelIsNotSuccessfullyAdded() {
        WebElement submitButton = (WebElement) driver.findElementByAccessibilityId("submit");
        Assert.assertEquals(true, submitButton.isDisplayed());
    }

}
