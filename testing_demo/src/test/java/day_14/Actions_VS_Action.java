package day_14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions_VS_Action {

	public static void main(String[] args) {

		
		
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act=new Actions(driver);
		
		Action myaction=act.contextClick(button).build();   // creating an action and storing it in variable
		
		myaction.perform(); // retrive the variable and perform action
		
		
		// actions ----> class, will be used to perfrom mouse action
		// action  ----> interface, will be used to store created actions
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
