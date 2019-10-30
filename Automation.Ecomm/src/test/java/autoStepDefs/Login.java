package autoStepDefs;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import baseAuto.MyTestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;


public class Login extends MyTestBase{

	@Before
	public void setUp() throws IOException{
		initialize();
	}
	
	@Given("^I enter my \"([^\"]*)\" in the email  address field$")
	public void i_enter_my_in_the_email_address_field(String email) throws Throwable {
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		page.type_email(email);
	}

	@Given("^I enter my password \"([^\"]*)\"$")
	public void i_enter_my_password(String password) throws Throwable {

		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		page.type_password(password);
				
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		page.click_SignIn();
	}
}
