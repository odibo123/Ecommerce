package stepDefinatn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;

public class AbstractStepDefinitn {
	public int random;
	
	protected static WebDriver driver;
	static WebDriverWait wait = null;
	
	protected WebDriver getDriver(){
		if (driver == null){

			
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");	
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
		}
		return driver;
	}
	
	
/*	@After
	public void testShutDown(){
		driver.quit();
	}*/
}
