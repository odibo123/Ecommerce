import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class CreateMyAccountTest {
	
	public WebDriver driver;
	
	@Before
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drive\\chromedriver.exe");//initialise the webbrowser
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php?");//get the url
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List <WebElement> frame = driver.findElements(By.tagName("iframe"));
	    int total_frames = frame.size();
	    System.out.println("total number of frames is "+ total_frames);
	}
	
	@Test
	public void createAccountTest() throws InterruptedException{
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("christopherooodibo@yahoo.com");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,750)", "");

		driver.findElement(By.xpath("//button[@id='SubmitCreate']//span")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("customer_firstname")).sendKeys("Peter");//input firstname
		
		driver.findElement(By.id("customer_lastname")).sendKeys("Jammes");//input last name
        driver.findElement(By.name("passwd")).sendKeys("test17723"); //input password
		Thread.sleep(2000);
		Select days = new Select(driver.findElement(By.id("days")));//select date of birth from dropdown
		days.selectByIndex(4);
		
		Select months = new Select(driver.findElement(By.name("months")));//select method for month of birth from dropdown
		months.selectByValue("3");
		//select year by value
		Select years = new Select(driver.findElement(By.id("years")));//select year of birth from dropdown
		years.selectByValue("2016");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("ABC ltd");//company name
		driver.findElement(By.name("address1")).sendKeys("int 3");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Frank Suite");
		driver.findElement(By.cssSelector("#city")).sendKeys("New York");
		
		Select states = new Select(driver.findElement(By.id("id_state")));//select state from dropdown
		states.selectByVisibleText("Alabama");
		
		driver.findElement(By.name("postcode")).sendKeys("int 90001");//kindly check please
		Select country = new Select(driver.findElement(By.id("id_country")));//select country from dropdown using select method
		country.selectByVisibleText("United States");
		driver.findElement(By.id("phone")).sendKeys("int 07326654321");
		driver.findElement(By.id("phone_mobile")).sendKeys("int 074913256203");//please check this line
		
	
		driver.findElement(By.cssSelector("#alias")).sendKeys("12 Camelot Street");driver.findElement(By.xpath("//button[@id='submitAccount']//span")).click();
	
	}
}
