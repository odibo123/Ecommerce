package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{

	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	   @FindBy(how=How.XPATH,using = "//div[@id='header-account']//a[contains(text(),'My Account')]") 
	   WebElement  MyAccountLink;
	   

	   @FindBy(how=How.XPATH,using = "//*[@id='header']/div/div[2]/div/a") 	   	  
      WebElement Account;
	   
	@FindBy(how=How.XPATH,using = "//a[contains(text(),'Mobile')]")
	 WebElement mobileLink;
	
	
	@FindBy(how=How.XPATH,using = "//a[contains(text(),'TV')]") 
	 WebElement TvLink;
//constructor to initialise the objects
	
	

	//page actions or methods
	public String validatePageTitle(){
	return driver.getTitle();	
	}

public void IshouldclickMobilelink(){
	mobileLink.click();
}
public void IshouldclickTvlink(){
	   TvLink.click();
	   }
public String validateMobileTitle(){
	return driver.getTitle();	
	}

public void I_click_Account(){
	   Account.click();
	   
}
public void I_Should_click_My_Account_link(){
	 /* Actions action = new Actions(driver);
	    action.moveToElement(MyAccountLink).build().perform();*/
	   MyAccountLink.click();
	  
}
	
}
