package stepDefinatn;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderedStepDefinitn extends AbstractStepDefinitn{

	WebDriver driver = getDriver();
	

	/*@Given("^searches for \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void searches_for_and_and(String arg1, String arg2 , String arg3) throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,500)", "");
				  Thread.sleep(5000);
	//	String b1= driver.findElement(By.xpath("h1[@class='product_title entry-title']")).getText();
		//System.out.println(b1);
  String description= driver.findElement(By.xpath("h1[@class='product_title entry-title']")).getText();
  System.out.println(description);

	}*/
	@Given("^he types shoes in the enter text field$")
	public void he_types_shoes_in_the_enter_text_field() throws Throwable {
		driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys( "shoe");  
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys(Keys.RETURN);
		  Thread.sleep(5000);
	}
	

	@Given("^I enter \"([^\"]*)\" in the input text field$")
	public void i_enter_in_the_input_text_field(String items) throws Throwable {
		driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys(items);  
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys(Keys.RETURN);
		  Thread.sleep(5000);

	}

	@Given("^searches for description and item and price$")
	public void searches_for_description_and_item_and_price() throws Throwable {
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//  jse.executeScript("window.scrollBy(0,500)", "");
		//  Thread.sleep(5000);
		String b1= driver.findElement(By.xpath("//*[@id='product-1301']/div[1]/div[2]/h1")).getText();
			System.out.println(b1);
     String b2= driver.findElement(By.xpath("//*[@id='product-1301']/div[1]/div[2]/p/span")).getText();
			System.out.println(b2);
			boolean b3= driver.findElement(By.xpath("//*[@id='product-1301']/div[1]/div[1]/div[2]/div/div/div/div[2]/img")).isDisplayed();
			System.out.println(b3);
			
			
	}
	@Given("^chooses to buy the first item$")
	public void chooses_to_buy_the_first_item() throws Throwable {
		
		Select colour = new Select(driver.findElement(By.id("pa_color")));
		colour.selectByVisibleText("Nude");
		
		Select size = new Select(driver.findElement(By.id("pa_size")));
		size.selectByVisibleText("36");
		
		 driver.findElement(By.xpath("//i[@class='icon_plus']")).click(); 
		 
		 driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']")).click();
	
	}
	@Given("^clicks on cart link$")
	public void clicks_on_cart_link() throws Throwable {
		 driver.findElement(By.xpath("	//span[@class='cart-name-and-total']")).click();
	
	}
	@Given("^user clicks proceed to checkout$")
	public void user_clicks_proceed_to_checkout() throws Throwable {
	
		 driver.findElement(By.xpath("//*[@id='post-6']/div/div/div[2]/div[2]/div/a")).click();
	}
	

	@Given("^enters personal details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"   on checkout Page$")
	public void enters_personal_details_and_and_and_and_and_and_on_checkout_Page(String firstname, String lastname, String address, String town , String postcode, String phone, String email) throws Throwable {
	   driver.findElement(By.id("billing_first_name")).sendKeys(firstname);
	   driver.findElement(By.id("billing_last_name")).sendKeys(lastname);
	   driver.findElement(By.id("billing_address_1")).sendKeys( address);
	   driver.findElement(By.id("billing_city")).sendKeys(town);
		driver.findElement(By.id("billing_postcode")).sendKeys(postcode);
		driver.findElement(By.id("billing_phone")).sendKeys(phone);
		driver.findElement(By.id("billing_email")).sendKeys(email);
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-250)");
		  //This will scroll the page till the element is found		
		Thread.sleep(5000);
			// driver.findElement(By.xpath("//input[@id='terms']")).click();
//boolean	b3 =	driver.findElement(By.xpath("//input[@id='terms']")).isSelected();	
//System.out.println(	b3 );
 driver.findElement(By.xpath("//input[@id='terms']")).click();
	}


	@Then("^place the order$")
	public void place_the_order() throws Throwable {
		 driver.findElement(By.id("place_order")).click();
		 Thread.sleep(1000);
	}
	@Then("^user confirms seeing order details$")
	public void user_confirms_seeing_order_details() throws Throwable {
		//boolean b1= driver.findElement(By.xpath("//div[@class='noo-checkout-complete']")).isDisplayed(); 
		//System.out.println(b1);
		
		String confirmMessage = driver.findElement(By.xpath("//div[@class='noo-checkout-complete']")).getText(); 
		System.out.println(confirmMessage);
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
	}
}
