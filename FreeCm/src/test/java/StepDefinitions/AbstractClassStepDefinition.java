package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractClassStepDefinition {

	
	protected WebDriver driver;
	

	protected WebDriver getDriver(){
		
		if (driver == null){

			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		return driver;
	}
}
