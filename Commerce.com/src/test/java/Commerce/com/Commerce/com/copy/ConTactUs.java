package Commerce.com.Commerce.com.copy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ConTactUs extends TestBase {
	
   //  public WebDriver driver;
	
	
	@Before
	public void setUp() throws IOException{
	initialize();	
	}
	
	
@Given("^I navigate to the Home Page$")
public void i_navigate_to_the_Home_Page() throws Throwable {
	 driver.get(CONFIG.getProperty("URL"));
	
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	//   driver = new ChromeDriver();
	//   driver.navigate().to("http://automationpractice.com/index.php?");
	   driver.manage().window().maximize();
	 //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
}

@When("^I click on Contact us link$")
public void i_click_on_Contact_us_link() throws Throwable {
	driver.findElement(By.linkText("Contact us")).click();
}

@When("^I select Customer service$")
public void i_select_Customer_service() throws Throwable {
	Select subject_heading = new Select(driver.findElement(By.id("id_contact")));
	subject_heading.selectByVisibleText("Customer service");
}

@When("^I input my \"([^\"]*)\"$")
public void i_input_my(String email) throws Throwable {
	driver.findElement(By.id("email")).sendKeys(email); 
}

@When("^I type a \"([^\"]*)\" as my order reference$")
public void i_type_a_as_my_order_reference(String value) throws Throwable {
	driver.findElement(By.name("id_order")).sendKeys(value);
}

@When("^I write my  \"([^\"]*)\" on the message box$")
public void i_write_my_on_the_message_box(String message) throws Throwable {
	driver.findElement(By.id("message")).sendKeys(message);
}

@When("^I click on send button$")
public void i_click_on_send_button() throws Throwable {
	driver.findElement(By.cssSelector("#submitMessage > span")).click();
}

@Then("^I should see a green tick verifying I can be contacted by custumer service$")
public void i_should_see_a_green_tick_verifying_I_can_be_contacted_by_custumer_service() throws Throwable {
	String expectedMessage = "Your message has been successfully sent to our team.";
			String actualMessage = driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
  // System.out.println(text);
   Assert.assertEquals("Your message has been successfully sent to our team.", driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText());
   
}
	
	


}
