package toolsStepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;

public class Login1Steps extends AbstractClassStepDefs{


	WebDriver driver = getDriver();
	@When("^I enter different kinds of \"([^\"]*)\" in the search input box$")
	public void i_enter_different_kinds_of_in_the_search_input_box(String  clothing) throws Throwable {
		driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys( clothing);  
		 Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")).sendKeys(Keys.RETURN);

JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,500)", "");
		  Thread.sleep(5000);
	}

	@When("^I search for its \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_search_for_its_and_and(String description  , String item , String price) throws Throwable {
       Assert.assertEquals(description  , driver.findElement(By.xpath("//*[@id='product-1301']/div[1]/div[2]/h1")).getText());
       Thread.sleep(5000);
      // Assert.assertEquals(item  , driver.findElement(By.xpath("//*[@id='product-1301']/div[1]/div[1]/div[2]/div/div/div/div[2]/img")).isDisplayed());
//      Assert.assertEquals(item , driver.findElement(By.cssSelector(".noo-woo-thumbnails__slide--active > .noo-woo-thumbnails__image")).getText());
     //  Thread.sleep(4000);
       
    //  Assert.assertEquals(item  , driver.findElement(By.xpath("//div[@class='noo-woo-images__slide noo-woo-images__slide--active']//img[@class='noo-woo-images__image']")).getText());
        
      //  Assert.assertEquals(price, driver.findElement(By.linkText("white milkmaid hook and eye bodycon midi dress")).isDisplayed());
      //  .noo-woo-images__slide:nth-child(2) > .noo-woo-images__image
 //      Assert.assertEquals(price  , driver.findElement(By.cssSelector(".price:nth-child(2) > .woocommerce-Price-amount")).getText());
     //  Thread.sleep(3000);
       //pa_color
	}
	
}
