package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EnterPage {
	@FindBy(how=How.XPATH, using="//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")
	  public static WebElement EnterBtn;
	
//	@FindBy(how=How.XPATH, using="//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")
//	  public static WebElement EnterBtnA;
	
	public void enter_EnterBtn(String clothing){
		EnterBtn.sendKeys(clothing);
		
/*	}
	public void click_EnterBtnA(String clothing){
		EnterBtnA.click();
		//.sendKeys(Keys.RETURN);
	}*/
}
}