package Commerce.com.Commerce.com;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ReGisTer extends TestBase {
	
//	public WebDriver driver;
 //  public int random;

	
	
	@Before
	public void setUp() throws IOException{
	initialize();	
	}
	
	
		 @Given("^I am on Home Page$")
		 public void i_am_on_Home_Page() throws Throwable {
			 driver.get(CONFIG.getProperty("URL"));
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//   driver = new ChromeDriver();
		//   driver.navigate().to("http://automationpractice.com/index.php?");
		
		  driver.manage().window().maximize();
		//   driver.manage().deleteAllCookies();
	}
	 @When("^I click on Sign in button$")
	 public void i_click_on_Sign_in_button() throws Throwable{
	   driver.findElement(By.linkText("Sign in")).click();   
	}	   
	 @When("^I enter my new email address$")
	 public void i_enter_my_new_email_address() throws Throwable {
	
		 random = 100 + (int)(Math.random() * ((1000 - 1) + 1));
		 driver.findElement(By.id("email_create")).sendKeys("mike" + random + "@gmail.com");
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
			
			jse.executeScript("window.scrollBy(0,250)", "");
		 
		 Thread.sleep(5000);
		 
		/* Random randomGenerator = new Random();  
		 int randomInt = randomGenerator.nextInt(1000);  
		 driver.findElement(By.id("email_create")).sendKeys("mike" + random + "gmail.com"); 
		 */
	 } 
	  
@And("^I click on create account button$")
public void i_click_on_create_account_button() throws Throwable {
	driver.findElement(By.xpath("//button[@id='SubmitCreate']//span")).click();
	
//	JavascriptExecutor executor = (JavascriptExecutor)driver;
//	executor.executeScript("arguments[0].click();", CreateanaccountButton);
	Thread.sleep(4000);

}
/*
@When("^I click  male radio button$")
public void i_click_male_radio_button() throws Throwable {
 driver.findElement(By.cssSelector("#id_gender1")).click();
 Thread.sleep(2000);
}
*/
@When("^I click on male radio button$")
public void i_click_on_male_radio_button() throws Throwable {
    driver.findElement(By.id("id_gender1")).click();
    Thread.sleep(2000);
}


@And("^I type  firstname \"([^\"]*)\"$")
 public void i_type_firstname(String firstname) throws Throwable {
 
	driver.findElement(By.id("customer_firstname")).sendKeys(firstname);
	Thread.sleep(2000);
}

@And("^I enter lastname \"([^\"]*)\"$")
public void i_enter_lastname(String lastname) throws Throwable {
	driver.findElement(By.id("customer_lastname")).sendKeys(lastname);
}

@When("^I enter a \"([^\"]*)\"$")
public void i_enter_a(String password) throws Throwable {
   driver.findElement(By.name("passwd")).sendKeys(password);
   Thread.sleep(1000);
}

@And("^I select my date of Birth$")
public void i_select_my_date_of_Birth() throws Throwable {
	
	Select days = new Select(driver.findElement(By.id("days")));//select date of birth from dropdown
	days.selectByIndex(4);
	
	Select months = new Select(driver.findElement(By.name("months")));//select method for month of birth from dropdown
	months.selectByValue("3");
	//select year by value
	Select years = new Select(driver.findElement(By.id("years")));//select year of birth from dropdown
	years.selectByValue("2016");	
	  
}
@When("^I enter name of \"([^\"]*)\"$")
public void i_enter_name_of(String address) throws Throwable {
	driver.findElement(By.name("company")).sendKeys(address);
	Thread.sleep(3000);
}

@When("^I type a \"([^\"]*)\" as my company address$")
public void i_type_a_as_my_company_address(String value) throws Throwable {
   driver.findElement(By.id("address1")).sendKeys(value);
}

@And("^I enters company second \"([^\"]*)\"$")
public void i_enters_company_second(String addressLine) throws Throwable {
driver.findElement(By.id("address2")).sendKeys(addressLine);
}

@And("^I type company \"([^\"]*)\"$")
public void i_type_company(String City) throws Throwable {
	driver.findElement(By.id("city")).sendKeys(City);
}

@And("^I select Company State$")
public void i_select_Company_State() throws Throwable {
	Select state = new Select(driver.findElement(By.id("id_state")));
	state.selectByVisibleText("California");
	
	Select State = new Select(driver.findElement(By.id("id_state")));
	State.selectByVisibleText("Florida");
}

@And("^I type my state zip code with \"([^\"]*)\"$")
public void i_type_my_state_zip_code_with(String value) throws Throwable {
  driver.findElement(By.id("postcode")).sendKeys(value);
  Thread.sleep(2000);
  
}
@Then("^I type my message into \"([^\"]*)\" box$")
public void i_type_my_message_into_box(String AdditionalInformation) throws Throwable {
  driver.findElement(By.id("other")).sendKeys(AdditionalInformation);
}


@Then("^I type  \"([^\"]*)\" number$")
public void i_type_number(String  HomePhone) throws Throwable {
 driver.findElement(By.id("phone")).sendKeys( HomePhone );
}

@And("^I insert \"([^\"]*)\"$")
public void i_insert(String MobilePhone) throws Throwable {
driver.findElement(By.id("phone_mobile")).sendKeys(MobilePhone);
}


@And("^I add my \"([^\"]*)\"$")
public void i_add_my(String address) throws Throwable {
   driver.findElement(By.id("alias")).sendKeys(address);
}
@Then("^I also click on Register button$")
public void i_also_click_on_Register_button() throws Throwable {
 driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
 
}/*
@Then("^I should see my name as proof I am registered successfully$")
public void i_should_see_my_name_as_proof_I_am_registered_successfully() throws Throwable {
	String expectedname = "mikel great";
 String actualname = driver.findElement(By.xpath("//a[@title='View my customer account']")).getText();
System.out.println(expectedname);
Assert.assertEquals("mikel great",driver.findElement(By.xpath("//a[@title='View my customer account']")).getText() );

}

*/
@Then("^I verify that \"([^\"]*)\" is registered successfully$")
public void i_verify_that_is_registered_successfully(String user) throws Throwable {
	Assert.assertEquals(user,driver.findElement(By.xpath("//a[@title='View my customer account']")).getText() );
	System.out.println(user);
	Thread.sleep(2000);
}


@When("^I close the browser$")
public void i_close_the_browser() throws Throwable {
driver.close();
}


}

