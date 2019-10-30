package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {

	
	@FindBy(how = How.LINK_TEXT, using = "Log in / Register")
	 public static WebElement LoginRegister;
	
	
	
	@FindBy(how = How.XPATH, using = "a[@class='localnav-title']")
	 public static WebElement Accessories ;
	
	
	
//declare the methods to perform the operation on the object created
	
	public void click_LoginRegister(){
		LoginRegister.click();
	}
	
	//public void verify_USB_CtoUSBAdapter(){
	//	USB_CtoUSBAdapter.getText();
//	}
}
