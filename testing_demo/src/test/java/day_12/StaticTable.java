package day_12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		/* find total number rows in table 
		
		int rows =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // muliple table in web page 
		int row =driver.findElements(By.tagName("tr")).size();   /// single table in web page
		
		System.out.println("Number of rows in table :"+row);
		*/
		
		/* find total number columns in table  
		 
		 
		int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		int cols=driver.findElements(By.tagName("th")).size();
		System.out.println("number of columns :"+cols);
		*/
		
		
		/* read data from specific row and col
		String bn=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bn);
		*/
		
		/* read all data from rows and col
		
		int rows =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();  
		int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=col;c++) 
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
				
			}
			System.out.println();
		}
		*/
		
		
		/* print bookname  if author is mukesh
		 
		 
		 
		 
		int rows =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();  

		for(int r=2;r<rows;r++) {
			String an=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(an.equals("Mukesh")) {
				String bn=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bn+"\t"+an);
			}
		}
		*/
		
		
		
		
		// find total price of all books
		int rows =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();  
		int total=0;
		for(int r=2;r<rows;r++) {
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
		System.out.println("total price of books"+total);
		
		
		
	}

}
