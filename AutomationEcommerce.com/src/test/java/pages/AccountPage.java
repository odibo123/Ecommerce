package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class AccountPage extends TestBase{

	
	@FindBy(how=How.CSS, using = ".links:nth-child(4) .first > a")
	WebElement AccountLink;
	
	
	@FindBy(how=How.CSS, using = "#email")
	WebElement CreateAccEmailBtn;
	
	@FindBy(how=How.CSS, using = "#pass")
	WebElement CreateAccPasswordBtn;
	
	@FindBy(how=How.CSS, using = "#send2")
	WebElement CreateAccLoginBtn;
	
@FindBy(how=How.XPATH,using ="//span[contains(text(),'Create an Account')]")
	WebElement Create_An_AccountBtn;
	/*public AccountPage(){
		PageFactory.initElements(driver, this);
	}
	*/


public void type_my_email(){
	CreateAccEmailBtn.sendKeys("christophodibo@yahoo.com");
	 
	 
}


public void type_my_password(){
	CreateAccPasswordBtn.sendKeys("Tkogl1979");
}

public void click_register_Account_Login(){
	CreateAccLoginBtn.click();
}
	public void Click_My_Account_Link(){
		AccountLink.click();
		
	}
	public void Click_Create_An_Account_Btn(){
		Create_An_AccountBtn.click();
		
	}
}
