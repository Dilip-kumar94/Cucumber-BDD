package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"C:/Users/dilipkumar.m/Documents/Create_BDD/sampledemo/src/test/java/resources/features"},
    glue = {"steps"},
    plugin ={"pretty","json:target/cucumber/report.json"},
    //tags="@P1",
    dryRun=false,
    //strict = true -depreceated
    monochrome = true,
    //name = {"logo"} executes the scenarios where logos are involved.
)
public class TestRunner {

}
