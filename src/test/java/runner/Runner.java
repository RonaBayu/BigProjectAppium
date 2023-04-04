package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@CI_010",
        features="src/test/resources/features",
        glue={"stepDef","runner"},
        plugin = {"pretty","html:target/report/cucumber-report.html","json:target/report/cucumber-report.json,"}
)
    public class Runner {

    }