package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class CreditCardDetailsPage extends TestBase{
	
	
	@FindBy(how=How.CSS, using ="#ccsave_cc_owner")
	WebElement CardNameBtn;
	
	@FindBy(how=How.ID, using ="ccsave_cc_type")
	WebElement  CardTypeDropDown;
	
	@FindBy(how=How.CSS, using ="#ccsave_cc_number")
	WebElement  CardNumberBtn;
	
	@FindBy(how=How.ID, using ="ccsave_expiration")
	WebElement MonthDropDown;
	
	@FindBy(how=How.ID, using ="ccsave_expiration_yr")
	WebElement YearDropDown;
	
	@FindBy(how=How.ID, using ="ccsave_cc_cid")
	WebElement VerificationNumBtn;
	
	@FindBy(how=How.XPATH, using ="//*[@id='payment-buttons-container']/button/span/span")
	WebElement CheckContinueBtn;
	
//	@FindBy(how=How.ID, using ="p_method_checkmo")
	//WebElement MoneyOrderRadBtn;
	
	public void type_CardNameBtn(){
		CardNameBtn.sendKeys("Chris");
	}
	
	
	public void select_CardTypeBtn(){
		Select select = new Select(CardTypeDropDown);
		select.selectByIndex(2);
		
	}
	public void type_CardNumberBtn(){
		CardNumberBtn.sendKeys("4462 5123 6542 7819");
}
	public void select_MonthDropDown(){
		Select select= new Select(MonthDropDown);
		select.selectByIndex(6);
}
	
	public void select_YearDropDown(){
		Select select= new Select(YearDropDown);
		select.selectByIndex(6);
}
	public void type_VerificationNumBtn(){
		VerificationNumBtn.sendKeys("104");
	}
//	public void click_MoneyOrderRadBtn(){
//		MoneyOrderRadBtn.click();
//}
	public void click_CheckContinueBtn(){
		CheckContinueBtn.click();
	}
}