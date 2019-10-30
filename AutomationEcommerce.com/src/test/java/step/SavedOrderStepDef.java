package step;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Given;
import pages.MyWishListPage;
import pages.OrderPage;

public class SavedOrderStepDef extends TestBase {
	
	OrderPage  orderPage  = new OrderPage ();
	MyWishListPage myWishListPage = new MyWishListPage();
	
	@Given("^I click on My Orders$")
	public void i_click_on_My_Orders() throws Throwable {
		MyWishListPage myWishListPage= PageFactory.initElements(driver, MyWishListPage.class); 
		myWishListPage.click_MyOrderLink();
	}

	@Given("^I click on view Order$")
	public void i_click_on_view_Order() throws Throwable {
		OrderPage  orderPage= PageFactory.initElements(driver, OrderPage.class);
		orderPage.click_ViewOrderLink();
		
		
	}

	@Given("^I verify that the previously created Order is displayed in ORDER TABLE and status was  PENDING$")
	public void i_verify_that_the_previously_created_Order_is_displayed_in_ORDER_TABLE_and_status_was_PENDING() throws Throwable {
		OrderPage  orderPage= PageFactory.initElements(driver, OrderPage.class);
		String o=orderPage.verify_OrderPendingMessage();
		System.out.println(o);
	Assert.assertTrue(orderPage.verify_OrderPendingMessage().contains("ORDER #100010421 - PENDING"));
	}

	@Given("^I click on print Order link$")
	public void i_click_on_print_Order_link() throws Throwable {
		OrderPage  orderPage= PageFactory.initElements(driver, OrderPage.class);
		 orderPage.click_PrintOrderLink();
	}


}
