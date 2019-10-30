package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class MyWishListPage extends TestBase{
	@FindBy(how=How.XPATH,using= "//form[@id='wishlist-view-form']/div/div/button/span/span")
	WebElement ShareWishListLink;
	
	
	@FindBy(how=How.XPATH,using= "//*[@id='top']/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a")
	WebElement MyWishList_Lnk;
	
	@FindBy(how=How.XPATH,using= "//*[@id='reorder-validate-detail']/div/div[2]/button/span/span")
	WebElement MyAddToCartBtn;
	
	@FindBy(how=How.XPATH,using= "//li[@class='current']//a")
	WebElement ConfirmedItemWishList;
	
	@FindBy(how=How.NAME,using= "order_items[]")
	WebElement Sony_XperiaCheckBox ;
	
	@FindBy(how=How.XPATH,using= "//*[@id='top']/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a")
	WebElement  MyOrderLink;
	
	public void I_click_ShareWishListLink(){
		ShareWishListLink.click();	
	}
	
	public void I_click_My_WishListLnk(){
		 MyWishList_Lnk.click();
	}

	public void I_click_My_AddToCartBtn(){
		MyAddToCartBtn.click();
	}
	
	public void I_click_ConfirmedItemWishList(){
		 ConfirmedItemWishList.click();	
	}
	public void I_click_Sony_XperiaCheckBox(){
		Sony_XperiaCheckBox.click();
	//	JavascriptExecutor executor = (JavascriptExecutor)driver;
	//.executeScript("arguments[0].click();", CreditCardRadBtn);
		
		for (int i=0; i<2; i++) {											
           // Sony_XperiaCheckBox.click (); 			
            System.out.println("Sony_XperiaCheckBox Checkbox Status is -  "+Sony_XperiaCheckBox.isSelected());							
        }
	}
	public void click_MyOrderLink(){
		MyOrderLink.click();
	}

}
