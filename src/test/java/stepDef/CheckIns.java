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

public class CheckIns {
    public static AndroidDriver<AndroidElement> driver;
    BigProjectTeam bigProjectTeam;
    CheckInPage checkIns;
    public CheckIns() {
        super();
        this.driver = Hooks.driver;
    }

    @BeforeStep
    public void setup() {
        bigProjectTeam = new BigProjectTeam(driver);
        checkIns = new CheckInPage(driver);
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
        Thread.sleep(20000);
    }
}
