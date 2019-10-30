package Commerce.com.Commerce.com.copy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn extends TestBase {
	
	@Before
	public void setUp() throws IOException{
	initialize();	
	}
	
	
//   public WebDriver driver;
   @Given("^I go to Home Page$")
public void i_go_to_Home_Page() throws Throwable {
	   driver.get(CONFIG.getProperty("URL"));
//	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	
	//   driver = new ChromeDriver();
	//   driver.navigate().to("http://automationpractice.com/index.php?");
	   driver.manage().window().maximize();
	 //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@When("^I click on Sign in link$")
public void i_click_on_Sign_in_link() throws Throwable {
	 driver.findElement(By.linkText("Sign in")).click();
}    

@And("^I enter my email\"([^\"]*)\" address$")
public void i_enter_my_email_address(String email) throws Throwable {
    driver.findElement(By.id("email")).sendKeys(email);

}

@And("^I enter my password \"([^\"]*)\"$")
public void i_enter_my_password(String password) throws Throwable {
driver.findElement(By.id("passwd")).sendKeys(password);

}

@When("^I click on Login button$")
public void i_click_on_Login_button() throws Throwable {
	driver.findElement(By.xpath("//button[@id='SubmitLogin']//span[1]")).click();
}

@Then("^I verify that I am logged in successfully$")
public void i_verify_that_I_am_logged_in_successfully() throws Throwable {
	String ExpectedUser = "Davin Riches";
	String actualUser =	driver.findElement(By.xpath("//span[contains(text(),'Davin Riches')]")).getText();
	Assert.assertEquals(ExpectedUser,actualUser );
}


@And("^I sign out$")
public void i_sign_out() throws Throwable {
	  driver.findElement(By.linkText("Sign out")).click(); 
}

/*
@Given("^I enter  email\"([^\"]*)\" address$")
public void i_enter_email_address(String email) throws Throwable {
	 driver.findElement(By.id("email_create")).sendKeys(email);
}

@Given("^I click on create account button$")
public void i_click_on_create_account_button() throws Throwable {
	driver.findElement(By.cssSelector("#SubmitCreate > span")).click();  
}

@And("^I click on male radio button$")
public void i_click_on_male_radio_button() throws Throwable {
	 driver.findElement(By.cssSelector("#id_gender1")).click();  
	
}

@And("^I enter a firstname \"([^\"]*)\"$")
public void i_enter_a_firstname(String firstname) throws Throwable {
	 driver.findElement(By.id("customer_firstname")).sendKeys(firstname);
}

@And("^I enter a lastname \"([^\"]*)\"$")
public void i_enter_a_lastname(String lastname) throws Throwable {
	 driver.findElement(By.name("customer_lastname")).sendKeys(lastname);
}

*/

}
