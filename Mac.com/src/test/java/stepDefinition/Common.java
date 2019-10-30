package stepDefinition;

import java.io.IOException;

import base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


public class Common extends TestBase {
	
	
	@Before
	public void setUp() throws IOException{
		initialize();
	}
	
	@Given("^the url 'https://www\\.apple\\.com/uk/'$")
	public void the_url_https_www_apple_com_uk(String url) throws Throwable {
		driver.navigate().to(url);
	  //driver.get(CONFIG.getProperty("URL"));
	}
}
