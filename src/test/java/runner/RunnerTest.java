package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@drag_drop",
        glue = {"steps", "hooks"},
        plugin = {"json:target/reports/CucumberReports.json", "pretty"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerTest {

}
