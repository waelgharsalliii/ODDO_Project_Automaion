package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "src/test/resources/AIO_Features",   // Path to the feature files
   glue = "/src/main/java/com/exemple/oddoproject/bdd",           // Path to the step definitions
   plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner {
	
}
