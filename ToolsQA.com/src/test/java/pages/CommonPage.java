package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {
	@FindBy(how=How.ID, using="//i[contains(@class,'icon_bag_alt')]")
	  public static WebElement cart;
	


	
	//@FindBy(how=How.XPATH, using="//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")
	//  public static WebElement EnterBtnA;
	
	public void click_cart(){
		cart.click();
	}
	
	
	
	
}
