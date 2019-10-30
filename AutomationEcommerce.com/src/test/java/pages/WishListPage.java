

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class WishListPage extends TestBase {

	@FindBy(how=How.CSS,using= ".header-language-container > .welcome-msg")
	WebElement UserTxtField;
	//html[@id='top']/body/div/div/div/div/p  for username
	//xpath = "//p[@class='welcome-msg']
	@FindBy(how=How.CSS,using= ".item:nth-child(1) .link-wishlist")
	WebElement AddToWishListBtn;
	
	
	
	
	public Boolean verify_username(){
		return UserTxtField.isDisplayed();
	}
  public void click_AddToWishListBtn(){
	  AddToWishListBtn.click();
  }
	

}
