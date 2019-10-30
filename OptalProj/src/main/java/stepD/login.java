package stepD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;



public class login {
	public WebDriver driver;
	@Given("^I am on Optal homepage$")
	public void i_am_on_Optal_homepage() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://optal.com/");
	}

	@Given("^I click on Sign in link$")
	public void i_click_on_Sign_in_link() throws Throwable {
	driver.findElement(By.xpath("//div[@class='invapay-signin']//a//img")).click();   
	}

/*@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_enter_and(String  username , String password ) throws Throwable {
   driver.findElement(By.name("username")).sendKeys(username );
   driver.findElement(By.id("password")).sendKeys(password );
   
}*/


@When("^I enter \"([^\"]*)\" in username input field$")
public void i_enter_in_username_input_field(String username) throws Throwable {
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
	
    
}

@When("^I enter \"([^\"]*)\" in password text field$")
public void i_enter_in_password_text_field(String arg1) throws Throwable {
    
}
@When("^I click the sign In link$")
public void i_click_the_sign_In_link() throws Throwable {
  
}

}
