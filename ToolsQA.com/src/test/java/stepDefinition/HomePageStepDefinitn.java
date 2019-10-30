package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import pages.CommonPage;
import pages.HomePage;
//import pages.LoginPage;
import toolsBase.DemoTestBase;





public class HomePageStepDefinitn extends DemoTestBase {
	@Given("^he clicks the search icon$")
	public void he_clicks_the_search_icon() throws Throwable {
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	homepage.click_Search_Btn();
	}
	
}
