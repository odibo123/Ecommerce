
public class MainTest{
	
	
	
	
	package stepDefinition;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import junit.framework.Assert;

	public class ContactStepDefinition {
		
		public WebDriver driver;
//		@Given("^user is already on Login page$")
//		public void user_is_already_on_Login_page() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
////			driver = new ChromeDriver();
//			driver.manage().deleteAllCookies();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.navigate().to("https://www.freecrm.com");
			//driver.manage().window().maximize();
//		}
		@Given("^user navigate to Login page$")
		public void user_navigate_to_Login_page() throws Throwable {
		 
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.freecrm.com");
		driver.manage().window().maximize();
			
		}
	/*	@When("^title of login page is CRM PRO$")
		public void title_of_login_page_is_CRM_PRO() throws Throwable {
			
			String title =  driver.getTitle(); 
			System.out.println(title);
			Assert.assertEquals("CRMPRO Log In Screen", title);
		// String title = driver.getTitle();
		// System.out.println(title);
		// Assert.assertEquals("CRMPRO Log In Screen", title);*/
		
		@Given("^User hits the login$")
	public void user_hits_the_login() throws Throwable {
			driver.findElement(By.cssSelector(".btn-xs-2")).click();
		}
		@Given("^User hits the Classic CRM button$")
		public void user_hits_the_Classic_CRM_button() throws Throwable {
		 driver.findElement(By.linkText("Classic CRM")).click(); 
		}
		
		@Given("^user verify that title of login page is CRM PRO$")
		 public void user_verify_that_title_of_login_page_is_CRM_PRO() throws Throwable {
		    String title = driver.getTitle();
		    System.out.println(title);
		  // Assert.assertEquals("CRMPRO", title);
		
		    System.out.println("page title is : " +title);
		    Assert.assertTrue(title.contains("CRMPRO"));
		}
		
		@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enters_and(String username, String password) throws Throwable {
			 driver.findElement(By.name("username")).sendKeys(username);
			 driver.findElement(By.name("password")).sendKeys(password);
		}

		@Then("^user clicks on login button$")
		public void user_clicks_on_login_button() throws Throwable {
			driver.findElement(By.cssSelector(".btn")).click(); 
		}

		
		@Then("^user is on home page$")
		public void user_is_on_home_page() throws Throwable {
			 String title = driver.getTitle();
			  System.out.println("page title :" + title );
			  Assert.assertEquals("CRMPRO", title); 
		}
		@Then("^user moves to new contact page$")
		public void user_moves_to_new_contact_page() throws Throwable {
			driver.switchTo().frame("mainpanel");
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
			//action.moveToElement(driver.findElement(By.linkText("Contacts"))).build().perform();
		 // driver.findElement(By.linkText("New Contact")).click();
		}

		@Then("^user enter new \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enter_new_and_and(String firstname , String lastname, String  Position) throws Throwable {
		   driver.findElement(By.id("first_name")).sendKeys(firstname);
		   driver.findElement(By.name("surname")).sendKeys(lastname);
		   driver.findElement(By.id("company_position")).sendKeys(Position);
		}

		
		@Then("^user click on save button$")
		public void user_click_on_save_button() throws Throwable {
		   driver.findElement(By.cssSelector("td:nth-child(1) > .button:nth-child(2)")).click();
		}
		
		@Then("^user verifies he is in new contact page$")
		public void user_verifies_he_is_in_new_contact_page() throws Throwable {
		String text = driver.findElement(By.xpath("//td[@class='tabs_header'][contains(text(),'christopher ovie')]")).getText();
		Assert.assertEquals("christopher ovie",driver.findElement(By.xpath("//td[@class='tabs_header'][contains(text(),'christopher ovie')]")).getText() );
		}
		@Then("^user close the browser$")
		public void user_close_the_browser() throws Throwable {
		 driver.quit();   
		}
		
		
		
		
		
		package stepDefinition;

		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		import com.gargoylesoftware.htmlunit.javascript.host.Map;

		import cucumber.api.DataTable;
		import cucumber.api.java.en.Given;
		import cucumber.api.java.en.Then;

		public class DealWitMapStepDefinition {

				
		public WebDriver driver;
		@Given("^I am on Login page$")
		public void i_am_on_Login_page() throws Throwable {

			
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.navigate().to("https://www.freecrm.com");
			
		}

		@Given("^I enter login button$")
		public void i_enter_login_button() throws Throwable {
		   driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
		}

		@Given("^I click the Classic CRM button$")
		public void i_click_the_Classic_CRM_button() throws Throwable {
		   driver.findElement(By.xpath("//a[contains(text(),'Classic CRM')]")).click();
		}

		@Then("^I enter enters username and password$")
		public void i_enter_enters_username_and_password(DataTable credentials) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		    // E,K,V must be a scalar (String, Integer, Date, enum etc)
			//for(Map<String, String> data : credentials.asMaps(String.class, String.class){
		 //  driver.findElement(By.name("username")).sendKeys(username);
		 //  driver.findElement(By.name("password")).sendKeys(password);
		}
		@Then("^I  clicks login button$")
		public void i_clicks_login_button() throws Throwable {
		  driver.findElement(By.xpath("//input[@class='btn btn-small']")).click(); 
		}

		@Then("^I am on home page$")
		public void i_am_on_home_page() throws Throwable {
		   
		}

		@Then("^I move on to new deal page$")
		public void i_move_on_to_new_deal_page() throws Throwable {
		   driver.switchTo().frame("mainpanel");
		       Actions action = new Actions(driver);
		       action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		}

		@Then("^I enter deal details$")
		public void i_enter_deal_details(DataTable credentials) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // Map data = credentials.asMap(String.class, String.class);
			
		    // E,K,V must be a scalar (String, Integer, Date, enum etc)
			
			//for(Map<String,String>data : credentials.asMaps(String.class, String.class));
			 
			 
			 
		}
			
		@Then("^I click on the save button$")
		public void i_click_on_the_save_button() throws Throwable {
		   driver.findElement(By.xpath("//input[@value='Save']")).click();



		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		}
		@Then("^I verify that I am on new contact page$")
		public void i_verify_that_I_am_on_new_contact_page() throws Throwable {
		  
		}

		@Then("^I close the browser$")
		public void i_close_the_browser() throws Throwable {
		   
		}
		
		
		
		
		}

		
		package stepDefinition;

		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		import com.gargoylesoftware.htmlunit.javascript.host.Map;

		import cucumber.api.DataTable;
		import cucumber.api.java.en.Given;
		import cucumber.api.java.en.Then;

		public class DealWitMapStepDefinition {

				
		public WebDriver driver;
		@Given("^I am on Login page$")
		public void i_am_on_Login_page() throws Throwable {

			
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.navigate().to("https://www.freecrm.com");
			
		}

		@Given("^I enter login button$")
		public void i_enter_login_button() throws Throwable {
		   driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
		}

		@Given("^I click the Classic CRM button$")
		public void i_click_the_Classic_CRM_button() throws Throwable {
		   driver.findElement(By.xpath("//a[contains(text(),'Classic CRM')]")).click();
		}

		@Then("^I enter enters username and password$")
		public void i_enter_enters_username_and_password(DataTable credentials) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		    // E,K,V must be a scalar (String, Integer, Date, enum etc)
			//for(Map<String, String> data : credentials.asMaps(String.class, String.class){
		 //  driver.findElement(By.name("username")).sendKeys(username);
		 //  driver.findElement(By.name("password")).sendKeys(password);
		}
		@Then("^I  clicks login button$")
		public void i_clicks_login_button() throws Throwable {
		  driver.findElement(By.xpath("//input[@class='btn btn-small']")).click(); 
		}

		@Then("^I am on home page$")
		public void i_am_on_home_page() throws Throwable {
		   
		}

		@Then("^I move on to new deal page$")
		public void i_move_on_to_new_deal_page() throws Throwable {
		   driver.switchTo().frame("mainpanel");
		       Actions action = new Actions(driver);
		       action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		}

		@Then("^I enter deal details$")
		public void i_enter_deal_details(DataTable credentials) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // Map data = credentials.asMap(String.class, String.class);
			
		    // E,K,V must be a scalar (String, Integer, Date, enum etc)
			
			//for(Map<String,String>data : credentials.asMaps(String.class, String.class));
			 
			 
			 
		}
			
		@Then("^I click on the save button$")
		public void i_click_on_the_save_button() throws Throwable {
		   driver.findElement(By.xpath("//input[@value='Save']")).click();



		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		}
		@Then("^I verify that I am on new contact page$")
		public void i_verify_that_I_am_on_new_contact_page() throws Throwable {
		  
		}

		@Then("^I close the browser$")
		public void i_close_the_browser() throws Throwable {
		   
		}
			
		}

		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
