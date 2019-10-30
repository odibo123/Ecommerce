import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsTest {

	
	public WebDriver driver;
	
	@Test
public void contactUs(){
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("http://automationpractice.com/index.php?");
}
}