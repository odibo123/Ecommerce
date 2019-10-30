package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class ShareWishListPage extends TestBase{
	@FindBy(how=How.CSS,using = "#email_address")	
	WebElement EmailField;

	@FindBy(how=How.CSS,using = "#message")	
	WebElement MessageField;

	@FindBy(how=How.XPATH,using = "//*[@id='form-validate']/div[2]/button/span/span")	
	WebElement ShareMyWishListBtn;



	@FindBy(how=How.XPATH,using = "//div[@class='my-wishlist']")	
	WebElement ConfirmedShareWishListMessage;




	public void  type_EmailField(String emailId){
		EmailField.sendKeys(emailId);
	}

	public void type_MessageField(String  message){
		MessageField.sendKeys(message);	
	}

	public void click_ShareWishList_Btn(){
		ShareMyWishListBtn.click();	
	}

	public String verify_ConfirmedShareWishListMessage(){
		return ConfirmedShareWishListMessage.getText();
	}
}
