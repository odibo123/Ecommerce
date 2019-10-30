package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class CheckOutShippingPage extends TestBase{

	@FindBy(how=How.CSS,using= "#shipping-method-buttons-container > button")
	WebElement  ShippingContinueBtn;
	
	
	
	
	public void click_ShippingContinueBtn(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ShippingContinueBtn);
		//ShippingContinueBtn.click();
	}
	
}
