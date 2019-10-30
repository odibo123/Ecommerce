package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class ShippingDetailsPage extends TestBase{
		
	@FindBy(how=How.NAME,using="country_id")
	WebElement CountryDropdownlist;
	
	//@FindBy(how=How.XPATH,using="//input[@id='region']")
	//List<WebElement> StateOrProvinceDropdownlist;
	
	@FindBy(how=How.ID,using="region_id")
	WebElement StateOrProvinceDrpdwn;
	
	@FindBy(how=How.CSS,using="#coupon_code")
	WebElement DiscountCodeBtn;
	
	@FindBy(how=How.CSS,using=".button-wrapper > .button2:nth-child(1) > span > span")
	WebElement ApplyBtn;
	
	@FindBy(how=How.CSS,using=".success-msg li")
	WebElement CouponMessageText; 
	
	public void select_Country_From_Dropdown(){
		Select select = new Select(CountryDropdownlist);
		select.selectByIndex(4);
	}
	@FindBy(how=How.NAME,using="estimate_postcode")
	WebElement ZipCodeBtn;
	
	@FindBy(how=How.CSS,using=".buttons-set > .button2 > span > span")
	WebElement EstimateLink;
	
	/*public void select_Province_From_StateOrProvinceDropdownlist() throws InterruptedException{
		
		List<WebElement> options = StateOrProvinceDropdownlist;
		for(WebElement option : options) {
		    if (option.getText().equals("Algiers")) {
		        option.click();
		        break;
		    }	
	}

	}*/
	@FindBy(how=How.CSS,using=".buttons-set > .button > span > span")
	WebElement UpdateTotalBtn;
	
	@FindBy(how=How.CSS,using="body > div > div > div.main-container.col1-layout > div > div > div > div.page-title.title-buttons > ul > li > button > span > span")
	WebElement ProceedToCheckoutBtn;
	
	      public void type_ZipCode(){
	    	  ZipCodeBtn.sendKeys("SE25 4UD"); 
	      }
	      public void click_Estimate(){
	    	  EstimateLink.click();  
	      }
	      public void select_State_or_Prov_From_Dropdown(){
	    	  Select select = new Select(StateOrProvinceDrpdwn);
	    	  select.selectByIndex(2);
	      }
	      public void click_update_Total_Btn(){
	    	  UpdateTotalBtn.click();  
          }
	      public void click_ProceedToCheckoutBtn(){
	    	  ProceedToCheckoutBtn.click();
	      }
	      public void type_DiscountCodeBtn(){
	    	  DiscountCodeBtn.sendKeys("GURU50");
	      }
	      public void click_ApplyBtn(){
	    	  ApplyBtn.click();
	      }
	      public String verify_CouponMessageText(){
	    	return  CouponMessageText.getText();
	      }
}