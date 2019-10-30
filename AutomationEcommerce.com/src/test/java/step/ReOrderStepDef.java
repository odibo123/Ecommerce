package step;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Given;
import pages.OrderPage;
import pages.ShoppingCartPage;

public class ReOrderStepDef extends TestBase{
	OrderPage  orderPage = new OrderPage ();
	ShoppingCartPage shoppingCartPage= new ShoppingCartPage();
@Given("^I click on Reorder link button$")
public void i_click_on_Reorder_link_button() throws Throwable {
	OrderPage  orderPage =PageFactory.initElements(driver, OrderPage.class);
	orderPage.click_ReOrderLink();
}

@Given("^I change the quantity and click on update$")
public void i_change_the_quantity_and_click_on_update() throws Throwable {
	ShoppingCartPage shoppingCartPage = PageFactory.initElements(driver, ShoppingCartPage.class);
	shoppingCartPage.I_clear_values_On_Quantity_Box();
	Thread.sleep(5000);
	shoppingCartPage.change_quantity();
	Thread.sleep(4000);
	shoppingCartPage.I_Click_On_Update_Btn();
	Thread.sleep(4000);
String e=	shoppingCartPage.verify_Grand_Total();
System.out.println(e);
	
	
	
}

@Given("^I verify GRAND TOTAL IS changed$")
public void i_verify_GRAND_TOTAL_IS_changed() throws Throwable {
  
}

@Given("^I Click Proceed to Checkout$")
public void i_Click_Proceed_to_Checkout() throws Throwable {
  
}

@Given("^I Enter Billing Information, and click Continue$")
public void i_Enter_Billing_Information_and_click_Continue() throws Throwable {
   
}

@Given("^in shipping page I click continue$")
public void in_shipping_page_I_click_continue() throws Throwable {
    
}

@Given("^I click on check or Money order radio button$")
public void i_click_on_check_or_Money_order_radio_button() throws Throwable {
    
}

@Given("^under payment information I continue button$")
public void under_payment_information_I_continue_button() throws Throwable {
 
}

@Given("^I click on PLACE ORDER$")
public void i_click_on_PLACE_ORDER() throws Throwable {

}

@Given("^I verify order was generated and I seea message YOUR ORDER HAS BEEN RECEIVED\\.$")
public void i_verify_order_was_generated_and_I_seea_message_YOUR_ORDER_HAS_BEEN_RECEIVED() throws Throwable {
   
}

@Given("^I verify my order number$")
public void i_verify_my_order_number() throws Throwable {

}

@Given("^I close the browser$")
public void i_close_the_browser() throws Throwable {
    
}

}
