package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage {
	@FindBy(how=How.XPATH, using="//a[@class='checkout-button button alt wc-forward']")
	  public static WebElement Proceed_To_Checkout;
	
	@FindBy(how=How.XPATH, using="//p[@class='submit']//span[1]")
	  public static WebElement continue_shopping;
	
	public void click_Proceed_To_Checkout(){
		Proceed_To_Checkout.click();
	}
	
	public void click_continue_shopping(){
		continue_shopping.click();
	}
}
