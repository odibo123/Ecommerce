package stepDefinatn;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class CommonStepDefinitn extends AbstractStepDefinitn{
	WebDriver driver = getDriver();
	
	@Given("^user goes to Home Page$")
	public void user_goes_to_Home_Page() throws Throwable {
	  driver.navigate().to("http://www.shop.demoqa.com");
//String title = driver.getTitle();
//System.out.println("title of the page"+ title);	 
Assert.assertTrue(driver.getTitle().contains("ToolsQA Demo Site"));

List <WebElement> links=driver.findElements(By.tagName("a"));

int count=links.size();

System.out.println("Total number of links"+ count);



}
	
	@Given("^he clicks the search icon$")
	public void he_clicks_the_search_icon() throws Throwable {
		 driver.findElement(By.xpath("//*[@id='noo-site']/header/div[2]/div/a")).click();   
	}
}
