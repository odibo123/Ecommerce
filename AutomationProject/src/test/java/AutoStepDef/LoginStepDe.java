package AutoStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDe extends AbstractClassStepDef{
	WebDriver driver = getDriver();
	
	@Given("^I enter my \"([^\"]*)\" in the email text field$")
	public void i_enter_my_in_the_email_text_field(String email) throws Throwable {
	  driver.findElement(By.id("email")).sendKeys(email);
	  Thread.sleep(2000);
	}

	@Given("^I enter my \"([^\"]*)\" in my password input box$")
	public void i_enter_my_in_my_password_input_box(String password) throws Throwable {
		driver.findElement(By.id("passwd")).sendKeys(password);
		Thread.sleep(3000);
	}
	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
			
	}
	@Then("^I verify that  I am logged in successfully$")
	public void i_verify_that_I_am_logged_in_successfully() throws Throwable {
	String myText=  driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
	System.out.println(myText);
	}
}
