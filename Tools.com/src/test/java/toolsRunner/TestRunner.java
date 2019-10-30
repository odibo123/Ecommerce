package toolsRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C://eclipse//Illumination//Tools.com//src//test//resource"},//path of my feature files
        format = {"pretty" ,"json:target/cucumber.json"},// To generate report 
        strict = false,//check if the steps are in my step definition file
        monochrome = true,  //display the console in a proper readable format
        glue = {"toolsStepDefinition"},//path of my step definition files},	
		dryRun = false
		//tags = {"@Login1"}
		
		         )
public class TestRunner {

}
