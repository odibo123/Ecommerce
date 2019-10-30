package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {
	
	@FindBy(how=How.ID, using="Contact us")
	  public static WebElement Contact_us;
	
	

	@FindBy(how = How.LINK_TEXT, using="Sign in")
	  public static WebElement Sign_in;




public void click_Contact_us(){
	Contact_us.click();;
}


public void click_Sign_in(){
	Sign_in.click();
}

}