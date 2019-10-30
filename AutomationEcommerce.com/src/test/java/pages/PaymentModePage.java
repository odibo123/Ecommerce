package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class PaymentModePage extends TestBase {
	
	@FindBy(how=How.CSS,using="#p_method_ccsave")
	WebElement CreditCardRadBtn;
	
	@FindBy(how=How.ID,using="p_method_checkm")
	WebElement CheckRadBtn;
	
	
	public void click_CreditCardRadBtn(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", CreditCardRadBtn);
		//CreditCardRadBtn.click();
	}
	public void click_CheckRadBtn(){
		CheckRadBtn.click();;
	}
}
