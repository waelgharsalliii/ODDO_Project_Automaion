package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "src/test/resources/AIO_Features",
   glue = "com.exemple.oddoproject.bdd",  // Corrected path
   plugin = {"json:target/cucumber.json"}
)
public class TestRunner {
}
