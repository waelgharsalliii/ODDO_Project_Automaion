package bdd;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "src/test/resources",   // Path to feature files
   glue = "bdd",                      // Path to step definitions
   plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/report.json"}
)
public class TestRunner {
}
