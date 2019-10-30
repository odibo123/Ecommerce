package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class AdminPanelPage extends TestBase {
	
@FindBy(how=How.ID,using="username")	
WebElement UsernameBtn;

@FindBy(how=How.NAME,using="login[password]")
WebElement PasswordBtn;

@FindBy(how=How.CSS,using="#loginForm > div > div.form-buttons > input")
WebElement LoginBtn;


public void type_into_UsernameBtn(){
	UsernameBtn.sendKeys("user01");
}

public void type_into_PasswordBtn(){
	PasswordBtn.sendKeys("guru99com");
}

public void click_LoginBtn(){
	LoginBtn.click();
}
}
