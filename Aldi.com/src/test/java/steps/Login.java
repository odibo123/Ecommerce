package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.When;

public class Login extends  AbstractClassSteps {

	
	@When("^I confirm I am in login page$")
	public void i_confirm_I_am_in_login_page() throws Throwable {
	//String loginTitle=	driver.getTitle();
	//System.out.println(" title of the page" + loginTitle);
	//Assert.assertTrue(driver.getTitle().equals("Login - ALDI UK"));
		//or
		//div[@id='login-tab']//div[@class='accountLogin__emailSection col-md-6']
		//*[@id='login-tab']/div
		
boolean isEnabld=driver.findElement(By.xpath("//p[contains(text(),'Log in with your email address')]")).isEnabled();
if ( isEnabld){
System.out.println("Txt is Enabld");
	}else{
		System.out.println("Txt is not Enabld");
	}
	}
	@When("^I click create an account$")
	public void i_click_create_an_account() throws Throwable {
	   driver.findElement(By.xpath("//a[@class='tab__link tab__link--tall js-tab-link']//span[@class='tab__title tab__title--indent typography-heading3 js-tab-title'][contains(text(),'Create an account')]")).click();
	}

	@When("^I fill my personal details$")
	public void i_fill_my_personal_details() throws Throwable {
    //driver.findElement(By.id("register.title"))
		Select title = new Select(driver.findElement(By.id("register.title"))); 
		title.selectByValue("mr");
	}
}
