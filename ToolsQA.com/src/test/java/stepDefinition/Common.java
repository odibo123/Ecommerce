package stepDefinition;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.CommonPage;
import pages.EnterPage;
import toolsBase.DemoTestBase;
public class Common extends DemoTestBase {
	
		@Before
		public void setUp() throws IOException{
		initialize();
		}
		
		
		@Given("^user goes to Home Page$")
		public void user_goes_to_Home_Page() throws Throwable {
	    driver.get(CONFIG.getProperty("URL"));
	    driver.manage().window().maximize();
//Assert.assertTrue(driver.getTitle().contains("Demo E-Commerce Site"));
String title=  driver.getTitle();
System.out.println(title);
Assert.assertTrue(driver.getTitle().contains("Demo E-Commerce Site"));
List <WebElement> links=driver.findElements(By.tagName("a"));
int count=links.size();
System.out.println("Total number of links"+ count);
		}
		

	

}