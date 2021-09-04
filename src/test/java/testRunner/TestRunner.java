package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
				"html:target/cucumber-reports/cucumber.html",
				"json:target/cucumber-reports/cucumber.json"
		},
		features = "src/test/resources/Features",
		glue = {"stepDef"},
		//tags = "@search",
		dryRun = false,
		monochrome = true,
		publish = true
)
public class TestRunner {
}
