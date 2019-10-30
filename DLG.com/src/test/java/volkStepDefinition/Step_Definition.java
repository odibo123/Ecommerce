package volkStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition {

	

	
	public WebDriver driver;
	
	@Given("^I am on  the HomePage$")
	public void i_am_on_the_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://covercheck.vwfsinsuranceportal.co.uk/");
		driver.manage().window().maximize();
	}
	@When("^I enter my valid registration number$")
	public void i_enter_my_valid_registration_number() throws Throwable {
	  driver.findElement(By.cssSelector("#vehicleReg")).sendKeys("OV12UYY");
	}
	
	@When("^I click on the Find vehicle input box$")
	public void i_click_on_the_Find_vehicle_input_box() throws Throwable {
	    
	}

	@Then("^I should see  a result of my registration details$")
	public void i_should_see_a_result_of_my_registration_details() throws Throwable {
	   
	}
	@When("^I enter a special character along with valid registration number$")
	public void i_enter_a_special_character_along_with_valid_registration_number() throws Throwable {
	   
	}

	@Then("^i should see an error message saying Please enter a valid car registration$")
	public void i_should_see_an_error_message_saying_Please_enter_a_valid_car_registration() throws Throwable {
	 
	}

	@When("^I enter an invalid registration number$")
	public void i_enter_an_invalid_registration_number() throws Throwable {
	
	}

	@Then("^I should see a message saying Sorry record not found$")
	public void i_should_see_a_message_saying_Sorry_record_not_found() throws Throwable {

	}

	@When("^I do not enter my registration details$")
	public void i_do_not_enter_my_registration_details() throws Throwable {
	   
	}
	
	
}
