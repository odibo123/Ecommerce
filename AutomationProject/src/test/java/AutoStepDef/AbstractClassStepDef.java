package AutoStepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AbstractClassStepDef {
	protected static WebDriver driver;
	static WebDriverWait wait = null;
	
	protected WebDriver getDriver(){
		if (driver == null){

			
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");	
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		return driver;
	}
}
