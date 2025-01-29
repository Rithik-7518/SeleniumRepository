package day_16;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		/*
		 *  single file upload
		 *  
		 
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Parthi\\Desktop\\rithik\\test1.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("test1.txt")){
			System.out.println("file is uploaded successfully");
		}
		else {
			System.out.println("file is not uploaded successfully");
		}
		*/
		
		
		
		// uploaading mulitple files
		String file1="C:\\Users\\Parthi\\Desktop\\rithik\\test1.txt";
		String file2="C:\\Users\\Parthi\\Desktop\\rithik\\test2.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2 );
		
		// number of files validate
		int noofFile=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(noofFile== 2) {
			System.out.println("file are uploaded successfully");
		}
		else {
			System.out.println("file are not uploaded successfully");
		}
		
		
		// validate file names
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("test1.txt")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("test2.txt"))
		{
			System.out.println("file names are matched");
		}
		
		else 
		{
			System.out.println("file names are not matched");
		}
		
		
		
		
		
	}

}
