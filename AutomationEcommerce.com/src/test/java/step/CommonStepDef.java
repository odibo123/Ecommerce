package step;

import base.TestBase;
import cucumber.api.java.en.Given;
import pages.HomePage;

public class CommonStepDef extends TestBase{
HomePage homePage = new HomePage();  
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		TestBase.initialization(); 
		TestBase.driver.get("url");
	}

	@Given("^user sees a Logo banner$")
	public void user_sees_a_Logo_banner() throws Throwable {

	}

	@Given("^user verify Home Page title$")
	public void user_verify_Home_Page_title() throws Throwable {
	String homePageTitle=	 homePage.validatePageTitle();
	System.out.println(homePageTitle);
	}
}
