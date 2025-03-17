import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "src/test/resources/AIO_Features",
   glue = "com.exemple.oddoproject.bdd",
   plugin = {"pretty", "json:target/report.json", "html:target/cucumber-Report.html"}
)
public class TestRunner {}
