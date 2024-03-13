package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "D:\\Eclips\\Phase4CucumberProject\\src\\test\\java\\feature\\register.feature", // Corrected path to feature files
	    glue = "steps", // Package where step definitions are located
	    plugin = { 
	    			    "pretty", // Prints the Gherkin steps to the console in a readable format
	    			    "html:target/cucumber-html-report", // Generates HTML report in a separate directory
	    			    "json:target/cucumber-json-report/cucumber.json" // Generates JSON report in a separate directory
	    			}
	    // Run only scenarios with the "@smoke" tag
	)

public class RegisterRunner {

}