package autoStepDefs;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import baseAuto.MyTestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import pages.CommonPage;
import pages.LoginPage;

public class CommonStepDef extends MyTestBase {

	
	
	
	
	@Before
	public void setUp() throws IOException{
		initialize();
	}
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
    driver.get(CONFIG.getProperty("URL"));
    driver.manage().window().maximize();
  //  Assert.assertTrue(driver.getTitle().contains("homepage"));
   // Assert.assertTrue(driver.getTitle().equals("homepage"));
    Assert.assertEquals("My Store" , driver.getTitle());
	}
	
	@Given("^I click on Sign in link$")
	public void i_click_on_Sign_in_link() throws Throwable {
		CommonPage commonPage = PageFactory.initElements(driver, CommonPage.class);
		commonPage.click_Sign_in();
		
		
	}
}
