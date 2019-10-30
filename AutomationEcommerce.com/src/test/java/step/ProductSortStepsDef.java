package step;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.MobilePage;

public class ProductSortStepsDef extends  TestBase{
	HomePage homePage= new HomePage();
@When("^I click on  MOBILE link$")
public void i_click_on_MOBILE_link() throws Throwable {
	HomePage homepage=PageFactory.initElements(driver,HomePage.class);
	homepage.IshouldclickMobilelink();
	
}

@Then("^user verify seeing  mobile title$")
public void user_verify_seeing_mobile_title() throws Throwable {
	HomePage homepage=PageFactory.initElements(driver,HomePage.class);
	String mobilePageTitle = homepage.validateMobileTitle();
	System.out.println("The title of this page is "+mobilePageTitle);
	Assert.assertTrue(homepage.validateMobileTitle().equals("Mobile"));
	
}

@Then("^user select name in SORTBY dropdown menu$")
public void user_select_name_in_SORTBY_dropdown_menu() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage.selectName();
	
}

@Then("^user verify all three products are sorted by name$")
public void user_verify_all_three_products_are_sorted_by_name() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage._Should_see_IPhone();
	
	mobilePage._Should_see_Samsung_Galaxy();

	mobilePage._Should_see_Sony_Xperia();
}
@Then("^user reads the cost of Sony Xperia$")
public void user_reads_the_cost_of_Sony_Xperia() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage._Should_see_Sony_Xperia_Price_Tag();
}

@Then("^user clicks on Sony Xperia mobile$")
public void user_clicks_on_Sony_Xperia_mobile() throws Throwable {
	MobilePage mobilePage = PageFactory.initElements(driver, MobilePage.class);
	mobilePage._Should_click_On_Sony_Xperia_Text();
}
}
