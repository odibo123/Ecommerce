package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class PaymentInfoPage extends TestBase{
	
	@FindBy(how=How.CSS, using ="#p_method_checkmo")
	WebElement MoneyOrderRadBtn;
	
	@FindBy(how=How.XPATH, using ="//*[@id='payment-buttons-container']/button/span/span")
	WebElement PaymentContinueBtn;
	
		public void click_MoneyOrderRadBtn(){
		MoneyOrderRadBtn.click();
}

		public void click_PaymentContinueBtn(){
			PaymentContinueBtn.click();
		}
		
}
