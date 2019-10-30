package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class CreateNewCustomerAccountPage extends TestBase{
	
	@FindBy(how=How.CSS, using ="#firstname")
	WebElement  FirstnameBtn;
	
	
	@FindBy(how=How.CSS, using ="#middlename")
	WebElement   MiddlenameBtn;
	
	
	@FindBy(how=How.CSS, using ="#lastname")
	WebElement  LastnameBtn;
	
	@FindBy(how=How.CSS, using ="#password")
	WebElement  PasswordBtn;
	
	@FindBy(how=How.CSS, using ="#confirmation")
	WebElement  ConfirmPasswordBtn;
	
	
	@FindBy(how=How.CSS, using ="#email_address")
	WebElement  EmailIdBtn;
	
	@FindBy(how=How.XPATH, using ="//*[@id='form-validate']/div[2]/button/span/span")
	WebElement RegisterBtn;
	
	
	public void type_first_name(String firstname){
		FirstnameBtn.sendKeys(firstname);
	}
	public void type_middle_name(String middlename){
		MiddlenameBtn.sendKeys(middlename);
		}
	public void type_last_name(String lastname){
		LastnameBtn.sendKeys(lastname);
		}
	public void type_password(String password){
		PasswordBtn.sendKeys(password);
		}
	public void type_confirmPassword(String confirmPassword){
		 ConfirmPasswordBtn.sendKeys(confirmPassword);
		}
	public void type_email(){
		EmailIdBtn.sendKeys("mike" + random + "@gmail.com");
	}
	public void click_Register_Button(){
		RegisterBtn.click();
	}

}
