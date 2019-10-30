package step;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.MobilePage;
import pages.ShoppingCartPage;

public class AddProductStepDef  extends TestBase{
	MobilePage mobilePage= new MobilePage ();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage ();
	
	@Then("^user click on Add To Cart button for Sony Xperia$")
	public void user_click_on_Add_To_Cart_button_for_Sony_Xperia() throws Throwable {
		
			MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
			mobilePage._Should_click_On_Add_To_Cart_SonyXperiaBtn();
		
	}

	@Then("^user click on the quantity text box$")
	public void user_click_on_the_quantity_text_box() throws Throwable {
		ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
		shoppingCartPage.I_Cclick_On_Quantity_Box();
	}

	@Then("^user enters (\\d+) as quantity$")
	public void user_enters_as_quantity(int arg1) throws Throwable {
		ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
		shoppingCartPage.I_type_1000_in_Qty_Btn();
	}

	@Then("^user clicks on update button$")
	public void user_clicks_on_update_button() throws Throwable {
		ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
		shoppingCartPage.I_Click_On_Update_Btn();  
	}

	@Then("^user should verify seeing an error message$")
	public void user_should_verify_seeing_an_error_message() throws Throwable {
		ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
		String text1=shoppingCartPage.verify_Error_Message();
		System.out.println("I should see "+text1);
		//Assert.assertTrue(shoppingCartPage.ErrorMessageTxt.getText().contains("* The maximum quantity allowed for purchase is 500."));
			
	}

	@Then("^user should click on Empty Cart link in the footer of list of all mobile$")
	public void user_should_click_on_Empty_Cart_link_in_the_footer_of_list_of_all_mobile() throws Throwable {
		ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
		shoppingCartPage.I_click_Empty_CartLink();
	}

	@Then("^user verify that the cart is empty$")
	public void user_verify_that_the_cart_is_empty() throws Throwable {
		ShoppingCartPage shoppingCartPage=PageFactory.initElements(driver, ShoppingCartPage.class);
		String text2=shoppingCartPage.verify_SHOPPING_CART_IS_EMPTY_Message();
			System.out.println("Messsage displayed is "+text2);
			Assert.assertEquals("SHOPPING CART IS EMPTY", text2);
	}

}
