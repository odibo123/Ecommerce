package step;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.AccountPage;
import pages.CreateNewCustomerAccountPage;
import pages.HomePage;
import pages.MyWishListPage;
import pages.ShareWishListPage;
import pages.WishListPage;

public class ShareWishListStepDef extends TestBase{
	
	HomePage homePage= new HomePage();
	AccountPage accountPage= new AccountPage();
	CreateNewCustomerAccountPage createNewCustomerAccountPage= new CreateNewCustomerAccountPage();
	MyWishListPage myWishListPage= new MyWishListPage();
	ShareWishListPage shareWishListPage  = new ShareWishListPage ();
	@Given("^user click on My Account link$")
	public void user_click_on_My_Account_link() throws Throwable {
		AccountPage accountPage= PageFactory.initElements(driver, AccountPage.class);
		accountPage.Click_My_Account_Link();
	}
	@Then("^user clicks on create an account link$")
	public void user_clicks_on_create_an_account_link() throws Throwable {
		AccountPage accountPage= PageFactory.initElements(driver, AccountPage.class);
		accountPage.Click_Create_An_Account_Btn();
	}
	
@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and email and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and_and_email_and_and_and(String firstname, String middlename, String lastname, String password, String confirmPassword) throws Throwable {
	CreateNewCustomerAccountPage createNewCustomerAccountPage= PageFactory.initElements(driver, CreateNewCustomerAccountPage .class);
	createNewCustomerAccountPage.type_first_name(firstname);
	createNewCustomerAccountPage.type_middle_name(middlename);
	createNewCustomerAccountPage.type_last_name(lastname);
	createNewCustomerAccountPage.type_email();
	createNewCustomerAccountPage.type_password(confirmPassword);
	createNewCustomerAccountPage.type_confirmPassword(confirmPassword);
}

@Given("^user click on Register button$")
public void user_click_on_Register_button() throws Throwable {	
CreateNewCustomerAccountPage createNewCustomerAccountPage= PageFactory.initElements(driver, CreateNewCustomerAccountPage .class); 
createNewCustomerAccountPage.click_Register_Button();

}


@Then("^\"([^\"]*)\"  verifies that reistration is done$")
public void verifies_that_reistration_is_done(String IntendedUser) throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver, WishListPage.class);
	
Boolean text=	wishListPage.verify_username();
System.out.println(text);
}

@Then("^user clicks on TV Menu$")
public void user_clicks_on_TV_Menu() throws Throwable {
	HomePage homePage= PageFactory.initElements(driver, HomePage.class);
	homePage.IshouldclickTvlink();
	Thread.sleep(5000);
}

@Then("^user click on add product to  your wishlist$")
public void user_click_on_add_product_to_your_wishlist() throws Throwable {
	JavascriptExecutor javascript = (JavascriptExecutor) driver;
	  javascript.executeScript("window.scrollBy(0,250)", "");
	WishListPage wishListPage=PageFactory.initElements(driver,WishListPage.class);
	wishListPage.click_AddToWishListBtn();
	AccountPage accountPage =PageFactory.initElements(driver,AccountPage.class);
	accountPage.type_my_email();
	accountPage.type_my_password();
	accountPage.click_register_Account_Login();
	Thread.sleep(4000);
}

@Then("^user click on Share Wishlist$")
public void user_click_on_Share_Wishlist() throws Throwable {
	MyWishListPage myWishListPage =PageFactory.initElements(driver,MyWishListPage.class);
	myWishListPage.I_click_ShareWishListLink();
}


@Then("^user enters his \"([^\"]*)\"$")
public void user_enters_his(String emailId) throws Throwable {
	ShareWishListPage shareWishListPage= PageFactory.initElements(driver, ShareWishListPage.class);
	shareWishListPage.type_EmailField(emailId);
}

@Then("^user types in a \"([^\"]*)\"$")
public void user_types_in_a(String message) throws Throwable {
	JavascriptExecutor javascript = (JavascriptExecutor) driver;
	  javascript.executeScript("window.scrollBy(0,250)", "");
	ShareWishListPage shareWishListPage= PageFactory.initElements(driver, ShareWishListPage.class);
	shareWishListPage.type_MessageField(message);
  
}

@Then("^user user clicks Share Wishlist$")
public void user_user_clicks_Share_Wishlist() throws Throwable {
	ShareWishListPage shareWishListPage= PageFactory.initElements(driver, ShareWishListPage.class);
	shareWishListPage.click_ShareWishList_Btn();
}
@Then("^user confirms his Wishlist is shared$")
public void user_confirms_his_Wishlist_is_shared() throws Throwable {
	ShareWishListPage shareWishListPage= PageFactory.initElements(driver, ShareWishListPage.class);
String confirmedMessage=	shareWishListPage.verify_ConfirmedShareWishListMessage();
System.out.println(confirmedMessage);
Assert.assertTrue(shareWishListPage.verify_ConfirmedShareWishListMessage().contains("Your Wishlist has been shared."));
}
}
