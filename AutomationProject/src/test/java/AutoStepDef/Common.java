package AutoStepDef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Common extends AbstractClassStepDef{
	
	WebDriver driver = getDriver();
	
	@Given("^user goes to Home Page$")
	public void user_goes_to_Home_Page() throws Throwable {
	  	driver.navigate().to("http://automationpractice.com");
	//String title=driver.getTitle();
	//System.out.println(title);
	//Assert.assertTrue(driver.getTitle().equals("Home page"));
	  	Assert.assertTrue(driver.getTitle().equals("My Store"));
	  //	List <WebElement> links=driver.findElements(By.tagName("a"));
	  List <WebElement> abc=	driver.findElements(By.tagName("a"));
	            int l=  abc.size();
	            System.out.println(l);
	  //	int count=links.size();
	 	//System.out.println("Total number of links"+ count);
	  //	driver.findElements(By.className("item-img")).size();
	  	//driver.findElements(By.tagName("a")).size();
	}
	@And("^I see a logo banner$")
	public void i_see_a_logo_banner() throws Throwable {
	String text1= driver.findElement(By.xpath("//*[@id='header_logo']/a/img")).getText();
	System.out.println(text1);
	Assert.assertEquals(text1, driver.findElement(By.xpath("//*[@id='header_logo']/a/img")).getText());
	
		
	}
	@Given("^I click on Sign in button$")
	public void i_click_on_Sign_in_button() throws Throwable {
	    driver.findElement(By.linkText("Sign in")).click();
	}
	
	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
	  
	}
}
