package stepDef;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.When;
import objectPage.BigProjectTeam;
import objectPage.CompanyPage;
import objectPage.Footer;
import runner.Hooks;

public class KanbanBoard {
    public static AndroidDriver<AndroidElement> driver;
    Footer homePage;
    CompanyPage companyPage;
    BigProjectTeam bigProjectTeam;
    public KanbanBoard() {
        super();
        this.driver = Hooks.driver;
    }
    @When("User click Kanban Board in Team")
    public void userClickKanbanBoardInTeam() {
        bigProjectTeam = new BigProjectTeam(driver);
        bigProjectTeam.clickBoard();
    }
}
