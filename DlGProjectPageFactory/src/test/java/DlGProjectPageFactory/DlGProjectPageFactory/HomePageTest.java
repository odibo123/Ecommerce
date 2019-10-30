package DlGProjectPageFactory.DlGProjectPageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myPage.LandingPage;

public class HomePageTest {
	public WebDriver driver;
	@Given("^I am on the HomePage$")
	public void i_am_on_the_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://covercheck.vwfsinsuranceportal.co.uk");
		
	}

	@Given("^I validate my HomePage title$")
	public void i_validate_my_HomePage_title() throws Throwable {
		String title =  driver.getTitle();
		  System.out.println("The title of HomePage is "+ title);
	}

	@When("^I enter my valid registration number$")
	public void i_enter_my_valid_registration_number() throws Throwable {
	    LandingPage landingPage = PageFactory.initElements(driver,  LandingPage.class);
	    landingPage.type_into_EnterRegBtn();
	}

	@When("^I click on the Find vehicle input box$")
	public void i_click_on_the_Find_vehicle_input_box() throws Throwable {
		 LandingPage landingPage = PageFactory.initElements(driver,  LandingPage.class);
		 landingPage .click_Find_Vehicle();
	}

	@Then("^I should see  a result of my registration details$")
	public void i_should_see_a_result_of_my_registration_details() throws Throwable {
		 LandingPage landingPage = PageFactory.initElements(driver,  LandingPage.class);
		 landingPage.verify_cover_start_end_date();
		 landingPage.verify_cover_end_date();
	}
	@When("^user enters his \"([^\"]*)\" in the enter reg input text box$")
	public void user_enters_his_in_the_enter_reg_input_text_box(String InvalidDetails) throws Throwable {
		LandingPage landingPage = PageFactory.initElements(driver,  LandingPage.class);
		
		

	}

	@Then("^user clicks on find vehicle textbox$")
	public void user_clicks_on_find_vehicle_textbox() throws Throwable {
	 
	}

	@Then("^user should see an \"([^\"]*)\" displayed$")
	public void user_should_see_an_displayed(String arg1) throws Throwable {

	}
}
