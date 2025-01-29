package day_25;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	// using PageFactory
	WebDriver driver;
	
	
	//constructor
	
	LoginPage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//locator
	
	 
	/*
	 * @FindBy(xpath="//input[@placeholder='Username']")
	 * or
	 * @FindBy(how=How.XPATH, using="//input[@placeholder='Username']")
	 */
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement text_username;
	
	@FindBy(xpath="//input[@placeholder='Password']") 
	WebElement text_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']") 
	WebElement btn_login;
	
	/*
	 *  find all link in webpage
	 *  
	 *  @FindBy(taagName="a")
	 *  List<WebElement> links;
	 */
	
	
	//action
	

	public void SetUserName(String user) {
		text_username.sendKeys(user);
	}
	
	public void SetPassword(String pwd) {
		text_password.sendKeys(pwd);
	}
	
	public void ClickLogin() {
		btn_login.click();
	}
	
	
	
	
	
	
}
