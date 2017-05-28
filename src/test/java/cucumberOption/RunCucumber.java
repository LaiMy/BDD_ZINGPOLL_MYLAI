package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", 
		glue = "stepDefinition", 
		tags = "@tag1",
		plugin = { "pretty","html:target/cucumber", "junit:target/cucumber/cucumber.xml"})

public class RunCucumber {

}
