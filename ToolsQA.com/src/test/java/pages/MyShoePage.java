package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class MyShoePage {
	@FindBy(how=How.XPATH, using="//*[@id='product-1301']/div[1]/div[2]/h1")
	  public static WebElement ShoeDiscription;
	
	@FindBy(how=How.ID, using="pa_color")
	  public static WebElement ShoeColour;
	
	@FindBy(how=How.ID, using="pa_size")
	  public static WebElement ShoeSize;
	
	@FindBy(how=How.XPATH, using="//i[@class='icon_plus']")
	  public static WebElement ShoeQuantity;
	
	@FindBy(how=How.ID, using="//i[@class='icon_bag_alt']")
	  public static WebElement AddToCart;
	
	
	public void verify_ShoeDiscription(String Discription){
		Assert.assertEquals("Discription",ShoeDiscription.getText() );
	}
	
	
	
	
	
		public void click_AddToCart(){
			AddToCart.click();
		
	}
}
