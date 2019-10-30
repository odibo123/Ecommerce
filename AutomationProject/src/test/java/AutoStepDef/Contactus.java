package AutoStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contactus extends AbstractClassStepDef {
	WebDriver driver = getDriver();
	
	
	
	@When("^I click on Contact us link$")
	public void i_click_on_Contact_us_link() throws Throwable {
driver.findElement(By.linkText("Contact us")).click();
	}

	@When("^I select Customer service$")
	public void i_select_Customer_service() throws Throwable {
Select select = new Select(driver.findElement(By.xpath(""))); 
select.selectByValue("");
	}

	@When("^I input my \"([^\"]*)\"$")
	public void i_input_my(String arg1) throws Throwable {
	  
	}

	@When("^I type a \"([^\"]*)\" as my order reference$")
	public void i_type_a_as_my_order_reference(String arg1) throws Throwable {
	   
	}

	@When("^I write my  \"([^\"]*)\" on the message box$")
	public void i_write_my_on_the_message_box(String arg1) throws Throwable {
	   
	}

	@When("^I click on send button$")
	public void i_click_on_send_button() throws Throwable {

	}

	@Then("^I should see a green tick verifying I can be contacted by custumer service$")
	public void i_should_see_a_green_tick_verifying_I_can_be_contacted_by_custumer_service() throws Throwable {
	 
	}
}
