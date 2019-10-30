package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	@FindBy(how=How.XPATH, using="//*[@id='noo-site']/header/div[2]/div/a")
	  public static WebElement Search_Btn;
	
	public void click_Search_Btn(){
		Search_Btn.click();
	}
}
