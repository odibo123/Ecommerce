package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonSteps extends  AbstractClassSteps{
	WebDriver driver = getDriver();
	
	@Given("^user goes to Home Page$")
	public void user_goes_to_Home_Page() throws Throwable {
	  driver.get("https://www.aldi.co.uk/");
String title = driver.getTitle();
//Assert.assertNotNull(title, "ALDI UK | Homepage");
Assert.assertEquals(title, "ALDI UK | Homepage");
//List <WebElement> links=driver.findElements(By.tagName("a"));
//int count=links.size();
//System.out.println("Total number of links"+ count);
int total_frames = driver.findElements(By.tagName("iframe")).size();
System.out.println();
//System.out.println("title of the page"+ title);
//Assert.assertTrue(driver.getTitle().equals("ALDI UK | Homepage"));
//Assert.assertEquals("", actual);
	  
	/*  if(driver.getCurrentUrl().equalsIgnoreCase("https://www.aldi.co.uk/")){
	         System.out.println("Test Pass"); 
	      } else { 
	         System.out.println("Test Failed"); 
	      } 
	      driver.close(); 
	   } */
	 // Assert.assertTrue(driver.getTitle().equalsIgnoreCase("ALDI UK | Homepage"));
	}

	@And("^I see a logo banner$")
	public void i_see_a_logo_banner() throws Throwable {
boolean b1= driver.findElement(By.id("logo-png")).isDisplayed(); 
	System.out.println(b1);
	}

	@When("^I click on Sign in button$")
	public void i_click_on_Sign_in_button() throws Throwable {
	 driver.findElement(By.cssSelector("body > header > div.header__utility > div > ul > li:nth-child(4) > a")).click();
	}
	

}
