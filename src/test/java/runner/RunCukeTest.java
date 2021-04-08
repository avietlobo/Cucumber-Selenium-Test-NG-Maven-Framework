package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/jsonReports/cucumber-reports.json", 
		"pretty","html:target/htmlReports/cucumber-reports.html",
        "junit:target/xml-reports/cucumber.xml"},
		features = "classpath:features", 
		glue = "classpath:stepDefinitions", 
		tags="@web",
monochrome = true)
public class RunCukeTest{

}
