import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberReport.html", "json:target/report.json"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@test1",
        dryRun = false

)



public class CucumberRunner {
}
