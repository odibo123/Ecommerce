package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class RedWineSteps extends  AbstractClassSteps{
	WebDriver driver = getDriver();
	
	@Given("^user mouser over and clicks on Red Wine$")
	public void user_mouser_over_and_clicks_on_Red_Wine() throws Throwable {
	   
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/header/div[4]/nav/ul[1]/ul/li[2]/div[1]/a"))).build().perform();

		
		  WebElement RedWineXelement = driver.findElement(By.xpath("//div[@class='header__list--secondmenu-wrapper']//a[contains(text(),'Red Wine')]"));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("arguments[0].click();", RedWineXelement );
	      Thread.sleep(5000);
	      
	}
	@Given("^I confirm I am on page that displays Red Wine$")
	public void i_confirm_I_am_on_page_that_displays_Red_Wine() throws Throwable {

		String expectedTitle = "Buy Red Wine Online | Wines | ALDI";
		    String actualTitle = driver.getTitle();
      if(actualTitle.equalsIgnoreCase(expectedTitle))
      System.out.println("Title Matched");
       else
      System.out.println("Title didn't match");
	   }
	@Given("^I click on star rating$")
	public void i_click_on_star_rating() throws Throwable {
		
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		  javascript.executeScript("window.scrollBy(0,250)", "");

	  driver.findElement(By.cssSelector("#desktopFacetContainer > ul > li:nth-child(6) > div")).click();

	  List <WebElement> li= driver.findElements(By.xpath("//*[@id='desktopFacetContainer']/ul/li[5]/ul/li[1]/span/span"));
	         System.out.println(li.size());
	                 for(int i=0;i<=li.size()-1;i++)
	                 {
	                     li.get(i).click();
	                 }
	                 Thread.sleep(3000);
	}
	
	//*[@id="desktopFacetContainer"]/ul/li[9]/ul/li[1]/span/span
	@Given("^I click on colour and grape and region$")
	public void i_click_on_colour_and_grape_and_region() throws Throwable {
	
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		  javascript.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.cssSelector("div.category-wrapper div.container.container--no-padding.category-top-container:nth-child(5) div.row.js-product-list-wrapper:nth-child(3) div.col-md-3.col-lg-3.hidden-xs.hidden-sm.category-facets__leftHandNav--root div.js-facet-container ul.category-facets__list.category-facets__list--primary.js-facet-container-list.js-scroll-ios li.category-facets__item.category-facets__facet:nth-child(8) > div.category-facets__name.js-facet-name:nth-child(1)")).click();
driver.findElement(By.xpath("//*[@id='desktopFacetContainer']/ul/li[7]/ul/li[1]/span/span")).click();
//country

JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,250)", "");
  Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='desktopFacetContainer']/ul/li[8]/div")).click();	           
driver.findElement(By.xpath("//div[@class='row js-product-list-wrapper']//li[8]//ul[1]//li[1]//span[1]//span[1]")).click();

//*[@id="desktopFacetContainer"]/ul/li[9]/div
//grape
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='desktopFacetContainer']/ul/li[9]/div")).click();              
driver.findElement(By.xpath("//*[@id='desktopFacetContainer']/ul/li[9]/ul/li[1]/span/span")).click();
	Thread.sleep(5000);	
}
	@Given("^I click on a choice wine$")
	public void i_click_on_a_choice_wine() throws Throwable {
	   driver.findElement(By.xpath("//a[@class='category-item__wrapper-link js-product-link']")).click();
	}
	//div[@class='js-picture-container js-product-large slick-slide slick-current slick-active']//img
	@Given("^I should be able to see my wine$")
	public void i_should_be_able_to_see_my_wine() throws Throwable {
	boolean b3=	 driver.findElement(By.xpath("//div[@class='js-picture-container js-product-large slick-slide slick-current slick-active']//img")).isDisplayed(); 
	System.out.println( b3);
	String expectedTitle = "Ch&acirc;teauneuf-du-Pape Cuv&eacute;e 13 - ALDI UK";
    String actualTitle = driver.getTitle();
    if(actualTitle.equalsIgnoreCase(expectedTitle))
        System.out.println("Title Match");
         else
        System.out.println("Title didn't match");
  	   }
	@Given("^I increase the quantity$")
	public void i_increase_the_quantity() throws Throwable {
		//html/body/main/div[5]/div/section[1]/section[2]/form/div[2]/div[1]/div/button[2]
				driver.findElement(By.xpath("//button[@class='btn btn-default qty-stepper__button js-product-qty-increase']")).click();
	}

	@Given("^I click add (\\d+) bottles$")
	public void i_click_add_bottles(int arg1) throws Throwable {
		//span[contains(text(),'ADD 6 BOTTLES')]
		driver.findElement(By.xpath("//span[contains(text(),'ADD 6 BOTTLES')]")).click();	
	}

	@Given("^I click add to basket$")
	public void i_click_add_to_basket() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'ADD TO BASKET')]")).click();
		Thread.sleep(5000);
	}
	@Given("^I click  checkout$")
	public void i_click_checkout() throws Throwable {
		//*[@id="minicart-trigger"]/div[3]
		driver.findElement(By.xpath("//li[@id='miniCartSlot-desktop']//div[@class='minicart__section minicart__section--right']")).click();
	}

@Given("^I click view basket$")
public void i_click_view_basket() throws Throwable {
  // driver.findElement(By.xpath("//div[@class='cartNotification__container js-cartnotification']")).click();
   driver.findElement(By.cssSelector("body:nth-child(2) header.header.header--wines.hidden-print.affix-top:nth-child(9) div.cartNotification.container.hidden > div.cartNotification__container.js-cartnotification")).click();
}

@Then("^I should see your shopping basket$")
public void i_should_see_your_shopping_basket() throws Throwable {
	
String text=driver.findElement(By.xpath("//h1[@class='cart-header__title']")).getText();
System.out.println(text);
}

@Then("^I confirm the total price$")
public void i_confirm_the_total_price() throws Throwable{ 
String price=driver.findElement(By.xpath("//li[@class='col-xs-6 col-sm-4 col-md-5 col-lg-6 cart-totals__value cart-totals__value--finalValue']")).getText();
System.out.println(price);
	//li[@class='col-xs-6 col-sm-4 col-md-5 col-lg-6 cart-totals__value cart-totals__value--finalValue']
Assert.assertTrue(driver.getTitle().contains("Basket Page - ALDI UK"));
}

@Then("^I click checkout securedly$")
public void i_click_checkout_securedly() throws Throwable {
	//div[@class='cart-tail__cta']//span[contains(text(),'Checkout Securely')]
	driver.findElement(By.xpath("//div[@class='cart-tail__cta']//span[contains(text(),'Checkout Securely')]")).click();
}

@Then("^I should be in my checkout page$")
public void i_should_be_in_my_checkout_page() throws Throwable {
 /* String actualtitle =  driver.getTitle();
  String expectedtitle =  Basket Page - ALDI UK"
		  if(actualtitle.equals()expectedtitle )){
			  System.out.println("Test pass");
		  }
		         el.
		        System.out.println("Test failed");
		  	   
		  }*/
	//Assert.assertTrue(driver.getTitle().contains("Checkout Login - ALDI UK"));
	//Assert.assertTrue(driver.getTitle().contains("Title of Page"));
	String expectedAldiPageTitle = "Checkout Login - ALDI UK";
	String actualAldiPageTitle=driver.getTitle();
	System.out.println("Aldi page title" + actualAldiPageTitle);
	//Assert.assertTrue(actualAldiPageTitle.equalsIgnoreCase(expectedAldiPageTitle ;
	Assert.assertTrue(actualAldiPageTitle.equalsIgnoreCase(expectedAldiPageTitle));
}

@Then("^I enter my email address$")
public void i_enter_my_email_address() throws Throwable {
    
   random = 100 + (int)(Math.random()*((1000-1) +1));
   //System.out.println(random);
   driver.findElement(By.id("checkout-email-fake")).sendKeys("mike" + random + "@gmail.com");

}

@Then("^I also choose password option$")
public void i_also_choose_password_option() throws Throwable {
	
	 driver.findElement(By.id("guest-checkout")).click();
}

@Then("^I click continue button$")
public void i_click_continue_button() throws Throwable {
	//button[@class='button button--links button--round js-checkout-button']
	driver.findElement(By.xpath("//button[@class='button button--links button--round js-checkout-button']")).click();
}

}