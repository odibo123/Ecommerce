package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C://eclipse//Illumination//Automation.Ecomm//src//test//resource"},//path of my feature files
        format = {"pretty" ,"json:target/cucumber.json"},// To generate report 
        strict = false,//check if the steps are in my step definition file
        monochrome = true,  //display the console in a proper readable format
        tags = {"@AutoLogin"},
        glue = {"autoStepDefs"}//path of my step definition files	        
		
		
		        )



public class AutoRunnerTest {

	
	
}
