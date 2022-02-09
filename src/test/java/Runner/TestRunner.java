package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {"C:\\Users\\AnkitKumar\\IdeaProjects\\InfoStride\\CucumberFramework\\src\\test\\java\\Featurefiles"},
                glue = {"StepDefinitions"},
                //dryRun = true,
               //monochrome = true,
                //strict = true,
                plugin = {"pretty","json:Report/Cucumber.json",
                "junit:Report/XMLReport.xml",
                "html:Report/cucumberReport"}

        )
public class TestRunner {
}
