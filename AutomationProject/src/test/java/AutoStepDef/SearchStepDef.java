package AutoStepDef;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class SearchStepDef extends AbstractClassStepDef{
	WebDriver driver = getDriver();

@Given("^i click on Search input field$")
public void i_click_on_Search_input_field() throws Throwable {
driver.findElement(By.cssSelector("#search_query_top")).click();
}
@Given("^I type dresses$")
public void i_type_dresses() throws Throwable {
   // driver.findElement(By.cssSelector("#search_query_top")).sendKeys("dresses");
	driver.findElement(By.cssSelector("#search_query_top")).sendKeys(Keys.SHIFT,"dress");
}

@Given("^user mouses over blouse$")
public void user_mouses_over_blouse() throws Throwable {
	 Actions actions = new Actions(driver);//create object of actions class and pass webdriver reference
		actions.moveToElement(driver.findElement(By.id("search_query_top"))).build().perform();
		driver.findElement(By.xpath("//*[@id='index']/div[2]/ul/li[6]")).click();
}
@Given("^user confirms seeing the dress in the product listing page$")
public void user_confirms_seeing_the_dress_in_the_product_listing_page() throws Throwable {
boolean b1=	driver.findElement(By.id("bigpic")).isDisplayed();
System.out.println(b1);
//Assert.assertTrue(driver.getTitle().equals("Blouse - My Store"));
 
}



@Given("^user chooses  the quantity$")
public void user_chooses_the_quantity() throws Throwable {
 driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
 Thread.sleep(3000);
}

@Given("^user selects size$")
public void user_selects_size() throws Throwable {
 // Select size = new  Select(driver.findElement(By.xpath("//select[@id='group_1']")));
 // size.selectByIndex(1);
	Select size = new  Select(driver.findElement(By.xpath("//select[@id='group_1']")));
	size.deselectAll();
	size.selectByVisibleText("M");
}

@Given("^user choose the colour$")
public void user_choose_the_colour() throws Throwable {
	JavascriptExecutor javascript = (JavascriptExecutor) driver;
	  javascript.executeScript("window.scrollBy(0,250)", "");
WebElement element = driver.findElement(By.xpath("//*[@id='color_8']"));
if(element.isSelected()){
System.out.println("Check is selected");	
}else{
	System.out.println("Checkbox is not selected");
	
}
	//driver.findElement(By.name("White")).click();
	  
}

@Given("^user confirms the price$")
public void user_confirms_the_price() throws Throwable {
 boolean b2= driver.findElement(By.id("our_price_display")).isDisplayed();
 System.out.println(b2);
}

@Given("^user clicks on Add to cart text field$")
public void user_clicks_on_Add_to_cart_text_field() throws Throwable {
  driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click(); 
  Thread.sleep(5000);
}
@Given("^user click on proceed to checkout$")
public void user_click_on_proceed_to_checkout() throws Throwable {
 
//<String> handler = driver.getWindowHandles();
	//Iterator<String> it = handler.iterator();
	
//	String parentWindowId =  it.next();
//	System.out.println("parent window id:" +parentWindowId);
	
	//String childWindowId =  it.next();
	//System.out.println("child window id:" +childWindowId);
	
	//driver.switchTo().window(childWindowId);
	Thread.sleep(5000);
	 driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();

}
@Given("^i confirm seeing product has been successfully added to your shopping cart$")
public void i_confirm_seeing_product_has_been_successfully_added_to_your_shopping_cart() throws Throwable {
  boolean b3=driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]")).isDisplayed();
  System.out.println(b3);
}


}
