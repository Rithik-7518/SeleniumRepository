package day_19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInSpecificRowAndCell {

	public static void main(String[] args) throws IOException {

		
		FileOutputStream file = new FileOutputStream("C:\\Users\\Parthi\\Desktop\\rithik\\STA workspace\\testing_demo\\src\\test\\java\\Test_data\\myfileRandom.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("DyanmicData");
		
		XSSFRow row =sheet.createRow(2);
		XSSFCell cell = row.createCell(2);
		
		cell.setCellValue(777);
		
		
		
			
		workbook.write(file);	
		workbook.close();
		file.close();
		
		System.out.println("file is created......");
			
		
		
	}

}
