package loginPage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyLoginPageTest {
	public WebDriver driver;
	@Given("^user goes to Home Page$")
	public void user_goes_to_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php?");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^I see a logo banner$")
	public void i_see_a_logo_banner() throws Throwable {
	Boolean b= driver.findElement(By.xpath("//*[@id='header_logo']/a/img")).isDisplayed();
	System.out.println(b);
	Assert.assertTrue(b);	
	}
	
	@Given("^I click on Sign in button$")
	public void i_click_on_Sign_in_button() throws Throwable {
		driver.findElement(By.linkText("Sign in")).click();
		
	}

		@Given("^I enter Login details$")
		public void i_enter_Login_details(DataTable loginData) throws Throwable {
			//Map <String, String> data=(Map<String, String>) loginDetails.asMaps(String.class, String.class);
			//write for loop to parameratise test case
			for (Map <String, String> data:loginData.asMaps(String.class, String.class)){
	//	driver.findElement(By.name("email")).sendKeys(data.get("myemail"));
			//Map <String,String>data= new HashMap<String,String>();
		//	data.put("davin.riches@gmail.com","Today01");
		//	data.put("escosolo7@gmail.com","Ikeama78");
		//	data.put("switch146@gmail.com", "Escosolo7");
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				 jse.executeScript("window.scrollBy(0,250)", "");
			
			 driver.findElement(By.id("email")).sendKeys(data.put("davin.riches@gmail.com", "Today01"));
			 driver.findElement(By.id("email")).sendKeys(data.put("escosolo7@gmail.com", "Ikeama78"));
			 Thread.sleep(5000);
			//	driver.findElement(By.cssSelector("#passwd")).sendKeys(data.get("mypassword"));
			}
		}
		
			@When("^I click  Login$")
			public void i_click_Login() throws Throwable {
				driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click(); 	  
			}
	
	
	
	@Then("^I verify that  I am logged in successfully$")
	public void i_verify_that_I_am_logged_in_successfully() throws Throwable {
		String myText=  driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
		System.out.println(myText);
		
	}
}
