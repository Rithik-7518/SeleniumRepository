package day_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	// without using PageFactory
	WebDriver driver;
	
	
	//constructor
	
	LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	
	//locator
	
	By text_username=By.xpath("//input[@placeholder='Username']");
	By text_password=By.xpath("//input[@placeholder='Password']");
	By text_login_btn=By.xpath("//button[normalize-space()='Login']");
	
	
	//action
	public void SetUserName(String user) {
		driver.findElement(text_username).sendKeys(user);	
	}
	
	public void SetPassword(String pwd) {
		driver.findElement(text_password).sendKeys(pwd);
	}
	
	public void ClickLogin() {
		driver.findElement(text_login_btn).click();
	}
	
	
	
	
	
	
}
