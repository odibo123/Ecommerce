import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;

public class ContactUsTest {

	public WebDriver driver;
	@Test
	public void contactUsUser() throws InterruptedException, IOException{
	System.setProperty("webdriver.chrome.driver" ,"C:\\Drive\\chromedriver.exe");	
	driver = new ChromeDriver();	
	driver.navigate().to("http://automationpractice.com/index.php?");
	driver.findElement(By.linkText("Contact us")).click();
	
	Select subject_heading = new Select(driver.findElement(By.id("id_contact")));
	subject_heading.selectByVisibleText("Customer service");
	
	driver.findElement(By.id("email")).sendKeys("christopherodibo@yahoo.com");
	driver.findElement(By.name("id_order")).sendKeys("45872");

	
	driver.findElement(By.id("message")).sendKeys("Ready");
	
	//upload file
	//driver.findElement(By.name("fileUpload")).sendKeys("C:\\Selenium\\clerkswell.doc");
	//Thread.sleep(4000);
	
	
	driver.findElement(By.cssSelector("#submitMessage > span")).click();
	
	Thread.sleep(4000);
	 
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	Files.copy(scrFile, new File("C:\\Users\\User\\Pictures.png"));


	
    String text = driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
	System.out.println(text);
	Assert.assertEquals("Your message has been successfully sent to our team.", driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText());
	
      
/*	String text1 = "Your message has been successfully sent to our team.";
	String text2 = driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
	if(text1.equals(text2)){
		
	System.out.println("passed");
	}
	else{
		System.out.println("failed");
	}   */
	}
	//@After
	//public void tearDown(){
//		driver.close();
//	}
	
	
	
}
