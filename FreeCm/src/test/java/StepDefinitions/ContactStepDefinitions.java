package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class ContactStepDefinitions extends AbstractClassStepDefinition {

	public WebDriver driver = getDriver();
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws Throwable {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	
	}

	@Then("^user enter new \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_new_and_and(String firstname , String lastname, String  Position) throws Throwable {
	   driver.findElement(By.id("first_name")).sendKeys(firstname);
	   driver.findElement(By.name("surname")).sendKeys(lastname);
	   driver.findElement(By.id("company_position")).sendKeys(Position);
	}
	
	@Then("^user verifies he is in new contact page$")
	public void user_verifies_he_is_in_new_contact_page() throws Throwable {
	String text = driver.findElement(By.xpath("//td[@class='tabs_header'][contains(text(),'christopher ovie')]")).getText();
	Assert.assertEquals("christopher ovie",driver.findElement(By.xpath("//td[@class='tabs_header'][contains(text(),'christopher ovie')]")).getText() );
	}
}
