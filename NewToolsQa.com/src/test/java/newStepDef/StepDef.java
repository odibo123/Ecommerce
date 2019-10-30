package newStepDef;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StepDef extends  TestBase {

	@Before
	public void setUp() throws IOException{
		initialize();
	}

@Given("^user goes to Home Page$")
public void user_goes_to_Home_Page() throws Throwable {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
driver.get(CONFIG.getProperty("URL"));
String title = driver.getTitle();
System.out.println("title of the page "+ title);	 
Assert.assertTrue(driver.getTitle().contains("ToolsQA Demo Site"));

List <WebElement> links=driver.findElements(By.tagName("a"));
int count=links.size();
System.out.println("Total number of links"+ count);
List <WebElement> frame = driver.findElements(By.tagName("iframe"));
int total_frames = frame.size();
System.out.println("total number of frames "+ total_frames);

}
@Given("^he clicks the search icon$")
public void he_clicks_the_search_icon() throws Throwable {
	 driver.findElement(By.xpath("//*[@id='noo-site']/header/div[2]/div/a")).click(); 
}

@Given("^I enter \"([^\"]*)\" in the input text field$")
public void i_enter_in_the_input_text_field(String items) throws Throwable {
	driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys( items);  
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys(Keys.RETURN);
	  Thread.sleep(5000);
}
}
