package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\eclipse\\Illumination\\ToolsQA.com\\src\\test\\resource\\features\\Order2Details.feature"},//path of my feature files
        format = {"pretty" ,"json:target/cucumber.json"},// To generate report 
       // strict = false,//check if the steps are in my step definition file
        monochrome = true,  //display the console in a proper readable format
       tags = {"@CheckOuts"},
        glue = {"stepDefinition"}//path of my step definition files
		//Assert.assert(driver.find element.isdisplayed
		         )


public class TestRunner {

}
