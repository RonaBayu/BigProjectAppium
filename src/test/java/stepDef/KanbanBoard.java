package stepDef;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.BigProjectTeam;
import objectPage.Board;
import objectPage.CompanyPage;
import objectPage.Footer;
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
    @When("User click Kanban Board in Team")
    public void userClickKanbanBoardInTeam() {
        bigProjectTeam = new BigProjectTeam(driver);
        bigProjectTeam.clickBoard();
    }

    @And("User click {string} button")
    public void userClickButton(String arg0) {
        board = new Board(driver);
        board.clickAddBoardListButton();
    }

    @And("User input board name {string} in board list name field")
    public void userInputBoardNameInBoardListNameField(String arg0) {
        board = new Board(driver);
        board.inputBoardListNameField("Backlog");
    }

    @And("User click submit button")
    public void userClickSubmitButton() {
        board = new Board(driver);
        board.clickBoardSubmitButton();
    }

    @Then("Board list is successfully created")
    public void boardListIsSuccessfullyCreated() {
        WebElement board = (WebElement) driver.findElementByAccessibilityId("Backlog");
        Assert.assertEquals(true, board.isDisplayed());

    }

    @And("User click add new card button in board that has been created")
    public void userClickAddNewCardButtonInBoardThatHasBeenCreated() {
        board = new Board(driver);
        board.clickAddNewCardButton();
    }

    @And("User input card name {string} in card name field")
    public void userInputCardNameInCardNameField(String arg0) {
        board = new Board(driver);
        board.inputCardNameField("This is card 1");
    }

    @And("User click {string} in card name field")
    public void userClickInCardNameField(String arg0) {
        board = new Board(driver);
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
}
