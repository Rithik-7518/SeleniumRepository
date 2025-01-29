package day_19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataToExcel {

	public static void main(String[] args) throws IOException {

		
		FileOutputStream file = new FileOutputStream("C:\\Users\\Parthi\\Desktop\\rithik\\STA workspace\\testing_demo\\src\\test\\java\\Test_data\\myfile1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("DyanmicData");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("how many rows?");
		int rows=sc.nextInt();
		
		System.out.println("how many cells?");
		int cells= sc.nextInt();
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow currentRow=sheet.createRow(r);
			
			for(int c=0;c<cells;c++)
			{
			
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(sc.next());
				
			}
		}
		
		
		
		
		
		
		
			
		workbook.write(file);	
		workbook.close();
		file.close();
		
		System.out.println("file is created......");
			
		
		
	}

}
