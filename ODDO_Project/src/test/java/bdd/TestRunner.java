package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "src/test/resources/AIO_Features",   // Path to the feature files
   glue = "bdd",                                   // Path to the step definitions
   plugin = {
       "pretty",
       "html:workspace/ODDO_Project/target/cucumber-reports/cucumber.html",
       "json:workspace/ODDO_Project/target/cucumber-reports/cucumber.json"
   }
)
public class TestRunner {
}
