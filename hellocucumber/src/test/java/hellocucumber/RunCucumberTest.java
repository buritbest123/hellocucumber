package hellocucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", // For readable console output
                "html:target/cucumber-reports.html", // HTML report
                "json:target/cucumber-reports.json", // JSON report
                "junit:target/cucumber-reports.xml"  // JUnit XML report
        },
        features = "src/test/resources/hellocucumber",
        glue = "hellocucumber"
)
public class RunCucumberTest {
}
