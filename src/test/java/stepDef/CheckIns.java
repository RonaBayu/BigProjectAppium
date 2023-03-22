package stepDef;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.When;
import objectPage.BigProjectTeam;
import objectPage.CompanyPage;
import objectPage.Footer;
import objectPage.GroupChat;
import runner.Hooks;

public class CheckIns {
    public static AndroidDriver<AndroidElement> driver;
    BigProjectTeam bigProjectTeam;
    public CheckIns() {
        super();
        this.driver = Hooks.driver;
    }

    @BeforeStep
    public void setup() {
        bigProjectTeam = new BigProjectTeam(driver);
    }

    @When("User click Check Ins in Team")
    public void userClickCheckInsInTeam() {
        bigProjectTeam.clickCheckIns();
    }
}
