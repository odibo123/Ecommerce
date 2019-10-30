package toolsStepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;

public class Common extends AbstractClassStepDefs{

	
	WebDriver driver = getDriver();
	
	@Given("^user goes to Home Page$")
	public void user_goes_to_Home_Page() throws Throwable {
	  driver.get("http://www.shop.demoqa.com/");
String title = driver.getTitle();
System.out.println("Homepage title"+ title);	 
Assert.assertTrue(driver.getTitle().contains("ToolsQA Demo Site"));
//List <WebElement> links=driver.findElements(By.tagName("a"));
//int count=links.size();
//System.out.println("Total number of links"+ count);

//driver.findElements(By.tagName("a")).size();




}


}


		
