package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class AdminPanelCustomerPage extends TestBase {
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Sales')]")
	WebElement SalesLink;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Orders')]")
	WebElement CustomerOrdersLink;
	
	
	public void click_Customer_Orders(){
		Actions action= new Actions(driver);
		action.moveToElement(SalesLink).build().perform();
		CustomerOrdersLink.click();
	}

}
