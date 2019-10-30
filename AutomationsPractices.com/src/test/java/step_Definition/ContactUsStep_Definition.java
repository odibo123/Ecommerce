package step_Definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsStep_Definition {

	
	
	
	public WebDriver driver;
	
	@Given("^I am on the Home Page$")
	public void i_am_on_the_Home_Page() throws Throwable {
     
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^I click on Contact us button$")
	public void i_click_on_Contact_us_button() throws Throwable {

	}

	@And("^I choose customer service$")
	public void i_choose_customer_service() throws Throwable {
	   
	}

	@And("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {

	}

	@And("^I input a number in  the Order reference box$")
	public void i_input_a_number_in_the_Order_reference_box() throws Throwable {
	    
	}

	@When("^I type a message in the message field$")
	public void i_type_a_message_in_the_message_field() throws Throwable {

	}

	@And("^I click on send text box$")
	public void i_click_on_send_text_box() throws Throwable {
	  
	}

	@Then("^I should be logged in successfully$")
	public void i_should_be_logged_in_successfully() throws Throwable {
	}
}
