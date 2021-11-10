package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\sonal\\eclipse-workspace\\Lesson5_BDD_CucumberExtentReports\\src\\test\\java\\features"},
		glue = {"steps"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"html:cucumberhtml",
				"json:jsonReports/cucumber.json",
				"junit:CucumberReports/cucmber.xml"
				
		},
		dryRun=false,
		tags="@rediff"
		)

public class TestRunner {

}
