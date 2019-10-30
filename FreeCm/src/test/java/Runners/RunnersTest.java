package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		
		features = {"src/test/resources"},
		//features = {"C:\\eclipse\\Illumination\\Free\\src\\test\\resource\\Deal.feature"},
        format = {"pretty" ,"json:target/cucumber.json"},
        strict = false,
        monochrome = true
      //  glue = {"stepDefinitions"}
		
		         )

 class RunnersTest {

}
