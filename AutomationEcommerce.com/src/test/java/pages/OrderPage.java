package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class OrderPage extends TestBase {
	
	
	@FindBy(how=How.CSS,using= ".btn-checkout > span > span")
	WebElement PlaceOrderBtn;
	
	//@FindBy(how=How.XPATH,using= "(.//*[normalize-space(text()) and normalize-space(.)='Log Out'])[1]/following::h1[1]")
	@FindBy(how=How.CSS,using= "h1")
	WebElement OrderConfirmationMessage;
	
	@FindBy(how=How.XPATH,using= "(.//*[normalize-space(text()) and normalize-space(.)='Your order has been received.'])[1]/following::h2[1]")
	WebElement OrderAppreciationMessage;
	

	@FindBy(how=How.CSS,using= "div.col-main > p > a")
	WebElement  OrderNumber;

	@FindBy(how=How.LINK_TEXT,using= "here to print")
	WebElement hereToPrintLink;
	
	@FindBy(how=How.XPATH,using= "//*[@id='my-orders-table']/tbody/tr[1]/td[6]/span/a[1]")
	WebElement ViewOrderLink;
	
	@FindBy(how=How.XPATH,using= "//div[@class='main-container col2-left-layout']")
	WebElement 	OrderPendingMessage;
	
	@FindBy(how=How.XPATH,using= "//*[@id='top']/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]")
	WebElement PrintOrderLink;
	
	@FindBy(how=How.XPATH,using= "//tr[@class='first odd']//a[@class='link-reorder'][contains(text(),'Reorder')]")
	WebElement  ReOrderLink;
	
	public void click_PlaceOrderBtn(){
		//PlaceOrderBtn.click();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",PlaceOrderBtn);
		
	}

	public String confirm_OrderConfirmationMessage(){
	return	OrderConfirmationMessage.getText();
	}
	public String confirm_OrderAppreciationMessage(){
		return	OrderAppreciationMessage.getText();
		}
	public String confirm_OrderNumber(){
		return	OrderNumber.getText();
		}
	public void click_hereToPrintLink(){
		hereToPrintLink.click();
	
	}
	public void click_ViewOrderLink(){
		ViewOrderLink.click();
	}
	public String verify_OrderPendingMessage(){
	return OrderPendingMessage.getText();
	}
	public void click_PrintOrderLink(){
		
		PrintOrderLink.click();
	}
	
     public void click_ReOrderLink(){
	   ReOrderLink.click();	
	
	}
}
