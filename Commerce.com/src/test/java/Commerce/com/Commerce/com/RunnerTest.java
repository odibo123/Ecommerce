package Commerce.com.Commerce.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features = {"src/test/resources"},
		        format = {"pretty" ,"json:target/cucumber.json"},
		        strict = false,
		        monochrome = true,
		        tags = {"~@ignore"}
		        )

public class RunnerTest {

}
