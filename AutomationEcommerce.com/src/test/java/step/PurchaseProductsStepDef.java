package step;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AccountPage;
import pages.CheckOutBillingPage;
import pages.CheckOutShippingPage;
import pages.CreditCardDetailsPage;
import pages.HomePage;
import pages.MyWishListPage;
import pages.OrderPage;
import pages.PaymentInfoPage;
import pages.PaymentModePage;
import pages.ShippingDetailsPage;

public class PurchaseProductsStepDef extends TestBase {
	
	
	HomePage homePage= new HomePage();
	AccountPage accountPage= new AccountPage();
	MyWishListPage myWishListPage= new MyWishListPage();
	ShippingDetailsPage shippingDetailsPage= new ShippingDetailsPage();
	CheckOutBillingPage checkOutBillingPage= new CheckOutBillingPage();
	 CheckOutShippingPage  checkOutShippingPage= new  CheckOutShippingPage();
	 PaymentModePage  paymentModePage = new  PaymentModePage();
	 CreditCardDetailsPage  creditCardDetailsPage = new  CreditCardDetailsPage();
	 PaymentInfoPage  paymentInfoPage = new  PaymentInfoPage();
	 OrderPage orderPage= new OrderPage();
//	@Given("^user click on My Account$")
//	public void user_click_on_My_Account() throws Throwable {
	//	HomePage homePage= PageFactory.initElements(driver, HomePage.class);
	//	homePage.I_Should_click_My_Account_link();
	//}
	@Then("^user click on Account$")
	public void user_click_on_Account() throws Throwable {
		HomePage homePage= PageFactory.initElements(driver, HomePage.class);
		homePage.I_click_Account();
	}
	@Given("^user log in with previous created credentials$")
	public void user_log_in_with_previous_created_credentials() throws Throwable {
		AccountPage accountPage =PageFactory.initElements(driver,AccountPage.class);
		accountPage.type_my_email();
		accountPage.type_my_password();
		accountPage.click_register_Account_Login();
	}
	@Then("^user click on my Wishlist link$")
	public void user_click_on_my_Wishlist_link() throws Throwable {
     MyWishListPage myWishListPage = PageFactory.initElements(driver,MyWishListPage .class);
		myWishListPage.I_click_My_WishListLnk();
	}

	@Then("^user selects of the product Sony Xperia$")
	public void user_selects_of_the_product_Sony_Xperia() throws Throwable {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		  javascript.executeScript("window.scrollBy(0,250)", "");
		MyWishListPage myWishListPage = PageFactory.initElements(driver,MyWishListPage .class);
		 myWishListPage .I_click_Sony_XperiaCheckBox();
	}
	@Then("^user click on Add To Cart link$")
	public void user_click_on_Add_To_Cart_link() throws Throwable {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		  javascript.executeScript("window.scrollBy(0,250)", "");
		MyWishListPage myWishListPage = PageFactory.initElements(driver,MyWishListPage .class);
		 myWishListPage .I_click_My_AddToCartBtn();
	}

	@Then("^user enter shipping informations$")
	public void user_enter_shipping_informations() throws Throwable {
	ShippingDetailsPage shippingDetailsPage= PageFactory.initElements(driver, ShippingDetailsPage.class);
	shippingDetailsPage.select_Country_From_Dropdown();
	Thread.sleep(5000);
	//shippingDetailsPage.click_From_StateOrProvinceDropdownlist();
	}
	   /*@Then("^user clicks on province$")
	public void user_clicks_on_province() throws Throwable {
ShippingDetailsPage shippingDetailsPage= PageFactory.initElements(driver, ShippingDetailsPage.class);
		Thread.sleep(4000);
		shippingDetailsPage.select_Province_From_StateOrProvinceDropdownlist();
		//shippingDetailsPage.select_From_StateOrProvinceDropdownlist();
	
	}*/
	
	@Then("^user types zip code$")
	public void user_types_zip_code() throws Throwable {
	ShippingDetailsPage shippingDetailsPage= PageFactory.initElements(driver, ShippingDetailsPage.class);
	shippingDetailsPage.type_ZipCode();
	}

	@Then("^user click on Estimate button$")
	public void user_click_on_Estimate_button() throws Throwable {
		ShippingDetailsPage shippingDetailsPage= PageFactory.initElements(driver, ShippingDetailsPage.class);
		shippingDetailsPage.click_Estimate();
	}

	@Then("^user verify shipping cost that was generated$")
	public void user_verify_shipping_cost_that_was_generated() throws Throwable {
	   
	}
	@Then("^user clicks on update total$")
	public void user_clicks_on_update_total() throws Throwable {
		ShippingDetailsPage shippingDetailsPage= PageFactory.initElements(driver, ShippingDetailsPage.class); 
		shippingDetailsPage.click_update_Total_Btn();
	}
	@Then("^user confirm shipping cost was added to total$")
	public void user_confirm_shipping_cost_was_added_to_total() throws Throwable {
	  
	}
	@Then("^user user clicks on proceed To Checkout$")
	public void user_user_clicks_on_proceed_To_Checkout() throws Throwable {
		ShippingDetailsPage shippingDetailsPage= PageFactory.initElements(driver, ShippingDetailsPage.class);
		shippingDetailsPage.click_ProceedToCheckoutBtn();
		
	}
	@Then("^user clicks on continue in billing page$")
	public void user_clicks_on_continue_in_billing_page() throws Throwable {
		CheckOutBillingPage checkOutBillingPage= PageFactory.initElements(driver,CheckOutBillingPage.class);
		checkOutBillingPage.click_BillingContinue_Btn();
	}

/*	@Then("^user should see billing and shipping address$")
	public void user_should_see_billing_and_shipping_address() throws Throwable {
	   
	}

	@Then("^user selects mode of payment$")
	public void user_selects_mode_of_payment() throws Throwable {

	}
*/
	@Then("^user click continue button on shipping page$")
	public void user_click_continue_button_on_shipping_page() throws Throwable {
		Thread.sleep(6000);
		 CheckOutShippingPage  checkOutShippingPage= PageFactory.initElements(driver,  CheckOutShippingPage.class);  
		 checkOutShippingPage.click_ShippingContinueBtn();
	}
@Then("^user selects mode of payment$")
public void user_selects_mode_of_payment() throws Throwable {
	JavascriptExecutor javascript = (JavascriptExecutor) driver;
	  javascript.executeScript("window.scrollBy(0,250)", "");
	PaymentInfoPage paymentInfoPage= PageFactory.initElements(driver, PaymentInfoPage.class);
	paymentInfoPage.click_MoneyOrderRadBtn();
	
	//PaymentModePage  paymentModePage = PageFactory.initElements(driver,PaymentModePage.class);
	//paymentModePage.click_CreditCardRadBtn();
}
@Then("^user enters card payment details$")
public void user_enters_card_payment_details() throws Throwable {
	 CreditCardDetailsPage  creditCardDetailsPage = PageFactory.initElements(driver,  CreditCardDetailsPage.class);
	 creditCardDetailsPage.type_CardNameBtn();
	 creditCardDetailsPage.select_CardTypeBtn();
	 creditCardDetailsPage.type_CardNumberBtn();
	 creditCardDetailsPage.select_MonthDropDown();
	 creditCardDetailsPage.select_YearDropDown();
	 Thread.sleep(5000);
	 creditCardDetailsPage.type_VerificationNumBtn();
	 Thread.sleep(5000);
	
	 Thread.sleep(5000);
	// creditCardDetailsPage.click_CheckContinueBtn();
	 PaymentInfoPage  paymentInfoPage= PageFactory.initElements(driver,  PaymentInfoPage.class);
	 paymentInfoPage.click_MoneyOrderRadBtn();
}


@Then("^user log into order page$")
public void user_log_into_order_page() throws Throwable {
	 PaymentInfoPage  paymentInfoPage= PageFactory.initElements(driver,  PaymentInfoPage.class);
	 paymentInfoPage.click_PaymentContinueBtn();
}
@Then("^user confims the grand total$")
	public void user_confims_the_grand_total() throws Throwable {
	   
	}

	@Then("^user click on Place Order$")
	public void user_click_on_Place_Order() throws Throwable {
		Thread.sleep(5000);
		OrderPage orderPage = PageFactory.initElements(driver, OrderPage.class);
		orderPage.click_PlaceOrderBtn();
	}

	@Then("^user confirm that order is placed$")
	public void user_confirm_that_order_is_placed() throws Throwable {
	OrderPage orderPage = PageFactory.initElements(driver, OrderPage.class);
	String a=	orderPage.confirm_OrderConfirmationMessage();
	System.out.println(a);
	Thread.sleep(5000);
String b=orderPage.confirm_OrderAppreciationMessage();
	System.out.println(b);
	Thread.sleep(5000);
	String c =orderPage.confirm_OrderNumber();
	System.out.println(c);
	 orderPage.click_hereToPrintLink();
	
	}

}
