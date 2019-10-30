package com.apple;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(        
		features = {"src/test/resource"},
        format = {"pretty" ,"json:target/cucumber.json"},
        strict = false,
        monochrome = true,
        glue = {"stepDefinition"}
		        )


public class OrderRunnerTest {

}
