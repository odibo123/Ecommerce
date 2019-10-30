package stepDefinition;

import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import pages.CheckOutPage;
import pages.CommonPage;
import pages.MacPage;
import pages.TechSpecPage;

public class StepDefs extends TestBase{
	

@Given("^I click on Mac link$")
public void i_click_on_Mac_link() throws Throwable {
  CommonPage commonPage = PageFactory.initElements(driver,  CommonPage.class);
  commonPage.click_Mac();
}

@Given("^I also click on MacBook Pro Icon$")
public void i_also_click_on_MacBook_Pro_Icon() throws Throwable {
   MacPage macPage = PageFactory.initElements(driver, MacPage.class);
   macPage.click_MacBookPro();
}


@Given("^I go to the url$")
public void i_go_to_the_url() throws Throwable {
    driver.navigate().to("https://www.apple.com/uk/");
}

@Then("^I can place an order for it$")
public void i_can_place_an_order_for_it() throws Throwable {
    
}

//@When("^I choose a MacBook Pro with the following features and accessories$")
//public void i_choose_a_MacBook_Pro_with_the_following_features_and_accessories(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	//driver.findElement(By.xpath("a[@class='ac-gn-link ac-gn-link-mac']")).click();
//}


@When("^I choose a MacBook Pro with the following features and accessories$")
public void i_choose_a_MacBook_Pro_with_the_following_features_and_accessories(DataTable value) throws Throwable {
   
	for(Map<String, String> data : value.asMaps(String.class, String.class)){
		TechSpecPage techSpecPage = PageFactory.initElements(driver, TechSpecPage.class);
		techSpecPage.click_int15inchLapTopTextField();
		techSpecPage.verify_int16GBMemoryInputField();
		techSpecPage.click_LogicProX();
		techSpecPage.click_USBCtoUSBAdapter();
	}
}/*
@Then("^I can place an order for it\\.$")
public void i_can_place_an_order_for_it() throws Throwable {
	
}*/

@Given("^when I choose the following items:$")
public void when_I_choose_the_following_items(DataTable credential) throws Throwable {
	
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    
}

//@When("^I proceed to checkout$")
//public void i_proceed_to_checkout() throws Throwable {
//	CheckOutPage checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);
//	checkOutPage.click_CheckOut();
//}




@Then("^£(\\d+)\\.(\\d+) will be listed for VAT\\.VAT$")
public void £_will_be_listed_for_VAT_VAT(int arg1, int arg2) throws Throwable {
   
}

}
