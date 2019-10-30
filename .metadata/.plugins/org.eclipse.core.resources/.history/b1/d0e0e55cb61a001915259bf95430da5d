package AutomationRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		

		 format = {"pretty","json:target/cucumber.json"},
				          features = {"src/test/resource"},
				          
				        	  glue = {"step_Definition"},//path of step Definition
				  			  monochrome = true,// to display output in a proper readable format
				  			  dryRun = false
		         )

public class ContactUsRunnerTest {

}
