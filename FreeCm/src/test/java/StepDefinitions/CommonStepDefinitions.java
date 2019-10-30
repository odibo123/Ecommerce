package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class CommonStepDefinitions extends AbstractClassStepDefinition {

	
	

	public WebDriver driver = getDriver();

@Given("^User is already on login page$")
public void user_is_already_on_login_page() throws Throwable {

	
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.navigate().to("https://www.freecrm.com");
driver.manage().window().maximize();
List <WebElement> frame = driver.findElements(By.tagName("iframe"));
int total_frames = frame.size();
System.out.println("total number of frames "+ total_frames);
}

@Given("^user click on login button$")
public void user_click_on_login_button() throws Throwable {
	driver.findElement(By.cssSelector(".btn-xs-2")).click(); 
}

@Given("^user clicks on classic crm button$")
public void user_clicks_on_classic_crm_button() throws Throwable {
	 driver.findElement(By.linkText("Classic CRM")).click(); 
}

@And("^user verify that title of login page is CRM PRO$")
public void user_verify_that_title_of_login_page_is_CRM_PRO() throws Throwable {
  
	
	  String title = driver.getTitle();
	 
	
	    System.out.println("page title is : " +title);
	    Assert.assertTrue(title.contains("CRMPRO"));
}

@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String username, String password) throws Throwable {
	driver.findElement(By.name("username")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
}

@Then("^user hit the login button$")
public void user_hit_the_login_button() throws Throwable {
	driver.findElement(By.cssSelector(".btn")).click(); 
  
}

@Then("^user land on the home page$")
public void user_land_on_the_home_page() throws Throwable {
    String title = driver.getTitle();
	  System.out.println("page title :" + title );
	  Assert.assertEquals("CRMPRO", title);
}

/*@Then("^user enter new \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_new_and_and(String arg1, String arg2, String arg3) throws Throwable {
   
}
*/
@Then("^I click on the save button$")
public void i_click_on_the_save_button() throws Throwable {
	 driver.findElement(By.cssSelector("td:nth-child(1) > .button:nth-child(2)")).click();
}



@Then("^user close the browser$")
public void user_close_the_browser() throws Throwable {
	driver.quit();  
}
	
}
