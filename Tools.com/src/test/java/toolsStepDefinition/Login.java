package toolsStepDefinition;

import java.awt.Checkbox;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends AbstractClassStepDefs{
	WebDriver driver = getDriver();
	@Given("^he clicks the search icon$")
	public void he_clicks_the_search_icon() throws Throwable {
		 driver.findElement(By.xpath("//*[@id='noo-site']/header/div[2]/div/a")).click();  
		// driver.findElements(By.tagName("a")).size();
		 List <WebElement> links=driver.findElements(By.tagName("a"));
		 int count=links.size();
		 System.out.println("Total number of links"+ count);
	}

	@When("^I search for shoes in the search input box$")
	public void i_search_for_shoes_in_the_search_input_box() throws Throwable {
		  driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys("shoes");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys(Keys.RETURN);
		  Thread.sleep(5000);
	}

	@When("^I search for \"([^\"]*)\" in the search input box$")
	public void i_search_for_in_the_search_input_box(String clothing) throws Throwable {
		  driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys(clothing);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys(Keys.RETURN);
		  Thread.sleep(5000);
		//  .noo-product-item:nth-child(1) .owl-item:nth-child(1) .product-one-thumb
	}
/*	@Given("^types dress and press enter to search$")
	public void types_dress_and_press_enter_to_search() throws Throwable {
	 // driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys("dress");
	//  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys(Keys.RETURN);
	  Thread.sleep(5000);
	
	}*/
/*	@Given("^he searches for \"([^\"]*)\"$")
	public void he_searches_for(String arg1) throws Throwable {
	
	}*/
	@Then("^I see \"([^\"]*)\" and \"([^\"]*)\"  and \"([^\"]*)\"$")
	public void i_see_and_and(String searchdescription, String shirt, String price) throws Throwable {
	
		//driver.findElement(By.xpath("//*[@id='product-1301']/div[1]/div[1]/div[2]/div/div/div/div[2]/img")).isDisplayed();
		
      ///  Assert.assertEquals(searchdescription, driver.findElement(By.cssSelector("//*[@id='product-1301']/div[1]/div[1]/div[2]/div/div/div/div[2]/img")).getText());
      //*[@id='product-1301']/div[1]/div[2]/h1
        Assert.assertEquals(searchdescription, driver.findElement(By.cssSelector("//*[@id='product-1301']/div[1]/div[2]/h1")).getText());	
	}


	@Given("^chooses to buy the first item$")
	public void chooses_to_buy_the_first_item() throws Throwable {
		Select colour = new Select(driver.findElement(By.id("pa_color")));
		colour.selectByVisibleText("Nude");
		Select size = new Select(driver.findElement(By.id("pa_size")));
		size.selectByVisibleText("36");
		 driver.findElement(By.xpath("//i[@class='icon_plus']")).click(); 	
		//button[@class='single_add_to_cart_button button alt']
		// driver.findElement(By.xpath("//*[@id='product-1301']/div[1]/div[2]/form/div/div[2]/button")).click();
		
		 driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']")).click();
		//button[@class='single_add_to_cart_button button alt']
		 Thread.sleep(4000);
	}

		@When("^I click cart$")
		public void i_click_cart() throws Throwable {
			//span[@class='cart-name-and-total']
			 driver.findElement(By.xpath("	//span[@class='cart-name-and-total']")).click();
		   
		}
		@When("^user confirms he is in the cart page$")
		public void user_confirms_he_is_in_the_cart_page() throws Throwable {
		   
		}
	
@When("^user clicks proceed to checkout$")
public void user_clicks_proceed_to_checkout() throws Throwable {
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,500)", "");
	

	 driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
	 Thread.sleep(5000);
}
@When("^user confirms he is on checkout page$")
public void user_confirms_he_is_on_checkout_page() throws Throwable {
	String title = driver.getTitle();
	System.out.println("Checkout page title"+ title);	 
	Assert.assertTrue(driver.getTitle().contains("Checkout"));
}
	
	@When("^enters personal details on checkout Page$")
	public void enters_personal_details_on_checkout_Page() throws Throwable {
		driver.findElement(By.id("billing_first_name")).sendKeys("christopher");
		driver.findElement(By.id("billing_last_name")).sendKeys("ovie");
				driver.findElement(By.id("billing_city")).sendKeys("London");
				
				driver.findElement(By.id("billing_address_1")).sendKeys("3 portland road");
				driver.findElement(By.id("billing_postcode")).sendKeys("Se25 4ud");
				
				driver.findElement(By.id("billing_phone")).sendKeys("07491325309");
				

				driver.findElement(By.id("billing_email")).sendKeys("hristophodibo@gmail.com");
			//Thread.sleep(5000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,-250)");
			  //This will scroll the page till the element is found		
			Thread.sleep(5000);
				// driver.findElement(By.xpath("//input[@id='terms']")).click();
	//boolean	b3 =	driver.findElement(By.xpath("//input[@id='terms']")).isSelected();	
	//System.out.println(	b3 );
	 driver.findElement(By.xpath("//input[@id='terms']")).click();
				
	}				
	@Given("^select same delivery address$")
	public void select_same_delivery_address() throws Throwable {
	    
	}

	@Given("^select payment method as \"([^\"]*)\"$")
	public void select_payment_method_as(String arg1) throws Throwable {
	 
	}

	@Then("^place the order$")
	public void place_the_order() throws Throwable {
		 driver.findElement(By.id("place_order")).click();
	}
	@When("^user confirms order details$")
	public void user_confirms_order_details() throws Throwable {
	boolean b1= driver.findElement(By.xpath("//div[@class='noo-checkout-complete']")).isDisplayed(); 
	System.out.println(b1);
//	//h2[@class='woocommerce-order-details__title']  for order details
	//*[@id="post-7"]/div/div/div/section for price
	}//div[@class='noo-checkout-complete']
	
	
}
