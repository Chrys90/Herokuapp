package runner;


import enums.Browser;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@addRemoveElements",
        glue = {"steps", "hooks"},
        plugin = {"json:target/reports/CucumberReports.json", "pretty"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerTest {

    public static Browser browser = Browser.CHROME;

}
