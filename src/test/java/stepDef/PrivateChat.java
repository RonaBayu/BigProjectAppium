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
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import runner.Hooks;

import static org.junit.Assert.assertNull;

public class PrivateChat {
    public static AndroidDriver<AndroidElement> driver;
    Footer footer;
    CompanyPage companyPage;
    BigProjectTeam bigProjectTeam;

    public PrivateChat() {
        super();
        this.driver = Hooks.driver;
    }

    @BeforeStep
    public void setup() {
        companyPage = new CompanyPage(driver);
        bigProjectTeam = new BigProjectTeam(driver);
        footer = new Footer(driver);
    }

    @When("User click Menu button in footer")
    public void userClickMenuButtonInFooter() {
        footer.clickMenuIcon();
    }

    @And("User click inbox button")
    public void userClickInboxButton() throws InterruptedException {
        footer.clickInbox();
        Thread.sleep(5000);
    }

    @And("User click name that want to chat")
    public void userInputNameThatWantToChat() {
        footer.clickNameReceiver();
    }

    @And("User input message {string} in message field")
    public void userInputMessageInMessageField(String arg0) {
        footer.clickMessageField();
        footer.inputMessageField("Hello!");
    }

    @And("User click the send button")
    public void userClickTheSendButton() {
        footer.clickSendButton();
    }

    @Then("The message is successfully sent to the receiver")
    public void theMessageIsSuccessfullySentToTheReceiver() {
        WebElement message = (WebElement) driver.findElementByXPath("//android.view.View[contains(@content-desc, 'Hello!')]");
        Assert.assertEquals(true, message.isDisplayed());
    }

    @And("User click message that they want to delete")
    public void userClickMessageThatTheyWantToDelete() {
        driver.findElementByXPath("//android.view.View[contains(@content-desc, 'Hello!')]").click();
    }

    @And("User search a non company member name")
    public void userSearchANonCompanyMemberName() {
        footer.clickSearchNameField();
        footer.inputSearchNameField("John Doe");
    }

    @Then("The member name is not found")
    public void theMemberNameIsNotFound() {
        WebElement nonMember = null;
        try {
            nonMember = driver.findElementByAccessibilityId("John Doe");
        } catch (NoSuchElementException e) {
        }
        assertNull(nonMember);
    }

    @Given("User already opened Staging Cicle app")
    public void userAlreadyOpenedStagingCicleApp() {
    }

    @And("User click add chat button")
    public void userClickAddChatButton() {
        footer.clickAddChat();
    }
}