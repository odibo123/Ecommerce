package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckOutPage {

	@FindBy(how=How.ID, using="billing_first_name")
	  public static WebElement First_Name;
	
	@FindBy(how=How.ID, using="billing_last_name")
	  public static WebElement last_name;

	@FindBy(how=How.ID, using="billing_city")
	  public static WebElement city;

	@FindBy(how=How.ID, using="billing_address_1")
	  public static WebElement address_1;
	
	@FindBy(how=How.ID, using="billing_postcode")
	  public static WebElement postcode;

	@FindBy(how=How.ID, using="billing_phone")
	  public static WebElement phone;

	//Actions
	
	public void type_First_Name(){
		First_Name.sendKeys("christopher");
	}
	public void type_last_name(){
		last_name.sendKeys("ovie");
	}
	
	public void type_city(){
		city.sendKeys("London");
	}
	
	public void type_address_1(){
		address_1.sendKeys("3 portland Road");
	}
			
	public void type_postcode(){
		postcode.sendKeys("Se25 4ud");
	}
	
	public void type_phone(){
		phone.sendKeys("07491325309");
	}		
}
