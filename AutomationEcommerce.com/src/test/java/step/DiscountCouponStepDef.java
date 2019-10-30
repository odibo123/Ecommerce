package step;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MobilePage;
import pages.ShippingDetailsPage;

public class DiscountCouponStepDef extends TestBase{
	
	MobilePage  mobilePage = new MobilePage ();
	ShippingDetailsPage shippingDetailsPage = new ShippingDetailsPage();
	
	@When("^I click  IPhone on Add To Cart$")
	public void i_click_IPhone_on_Add_To_Cart() throws Throwable {
		MobilePage  mobilePage= PageFactory.initElements(driver, MobilePage.class);	
		mobilePage._Should_click_On_Add_To_Cart_Iphone();
	    

}
	
	@When("^user type coupon code$")
	public void user_type_coupon_code() throws Throwable {
		ShippingDetailsPage shippingDetailsPage= PageFactory.initElements(driver, ShippingDetailsPage .class);
		shippingDetailsPage.type_DiscountCodeBtn();
		shippingDetailsPage.click_ApplyBtn();
	}

	@Then("^user verify coupon code is generated$")
	public void user_verify_coupon_code_is_generated() throws Throwable {
		ShippingDetailsPage shippingDetailsPage= PageFactory.initElements(driver, ShippingDetailsPage .class); 
	String k=	shippingDetailsPage.verify_CouponMessageText();
	System.out.println(k);
	}

}