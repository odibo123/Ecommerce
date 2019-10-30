package step;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.MobilePage;

public class CompareProductStepDef extends  TestBase{
	
	

	@Then("^user confirm he is on Sony Xperia mobile Page$")
	public void user_confirm_he_is_on_Sony_Xperia_mobile_Page() throws Throwable {
		MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	String sonyXperiaMobilePageTitle=	mobilePage.validatePageSony_Xperia_MobileTitle();
	System.out.println("The title displayed showing sony xperia mobile is "+sonyXperiaMobilePageTitle);
	Assert.assertEquals("Sony Xperia - Mobile",sonyXperiaMobilePageTitle );	
	}
	@Then("^user confirm the price of Sony Xperia in Sony Xperia mobile Page is \\$(\\d+)$")
	public void user_confirm_the_price_of_Sony_Xperia_in_Sony_Xperia_mobile_Page_is_$(int arg1) throws Throwable {
		MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
		mobilePage._Should_see_In_Stock_Sony_Xperia_Price_Tag();
		
	}
}
