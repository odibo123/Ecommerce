package step;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.MobilePage;
import pages.ShoppingCartPage;

public class CompareTwoProductStepDef extends  TestBase {

	MobilePage mobilePage = new MobilePage ();
	
	@When("^user clicks on Add To Compare on IPhone link$")
	public void user_clicks_on_Add_To_Compare_on_IPhone_link() throws Throwable {
		MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
		mobilePage._Should_click_On_AddToCompareIphoneBtn();
	}
	@When("^user also clicks on Add To Compare on Samson Galaxy$")
	public void user_also_clicks_on_Add_To_Compare_on_Samson_Galaxy() throws Throwable {
		MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
		mobilePage._Should_click_On_AddToCompareSamsongGalaxyBtn();
	}

	@Then("^user clicks on Compare button$")
	public void user_clicks_on_Compare_button() throws Throwable {
		MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
		mobilePage._Should_click_On_CompareBtn();
	}
	@Then("^user verify selected products on for pop up window$")
	public void user_verify_selected_products_on_for_pop_up_window() throws Throwable {
		ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
	String text3=shoppingCartPage.verifyPopUPDetails();
	System.out.println(text3);
	Assert.assertEquals("COMPARE PRODUCTS",text3);
	}

	@Then("^user closes the Pop up window$")
	public void user_closes_the_Pop_up_window() throws Throwable { 
		driver.close();
	}
}
