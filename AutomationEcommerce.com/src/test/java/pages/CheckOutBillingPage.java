package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class CheckOutBillingPage extends TestBase{
	
	@FindBy(how=How.CSS,using= "#billing-buttons-container > button")
	WebElement  BillingContinueBtn;
	
	
	
	
	
	public void click_BillingContinue_Btn(){
		
		BillingContinueBtn.click();
	}

}
