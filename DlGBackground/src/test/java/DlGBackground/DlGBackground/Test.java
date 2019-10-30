package DlGBackground.DlGBackground;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import myPage.Homepage;

public class Test {

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
	  Assert.assertEquals("Dealer Portal", title);
}

@When("^I enter my valid registration number$")
public void i_enter_my_valid_registration_number() throws Throwable {
   Homepage Homepage = PageFactory.initElements(driver, Homepage .class);
   Homepage.type_into_EnterRegBtn();
   
}
@Given("^I click on the Find vehicle input box$")
public void i_click_on_the_Find_vehicle_input_box() throws Throwable {
	Homepage homepage = PageFactory.initElements(driver, Homepage .class);
	homepage .click_Find_Vehicle();	 
}
@Then("^I should see  a result of my registration details$")
public void i_should_see_a_result_of_my_registration_details() throws Throwable {
	Homepage homepage = PageFactory.initElements(driver, Homepage .class);
	homepage.verify_cover_start_end_date();
	homepage.verify_cover_end_date();
}

@Given("^I enter Invalid data in the enter reg input text box$")
public void i_enter_Invalid_data_in_the_enter_reg_input_text_box() throws Throwable {
   
}

@Then("^I should see an Error message displayed$")
public void i_should_see_an_Error_message_displayed() throws Throwable {

}
@Given("^I close the browser$")
public void i_close_the_browser() throws Throwable {
	
}
}
