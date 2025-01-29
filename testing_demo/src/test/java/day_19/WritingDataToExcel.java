package day_19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExcel {

	public static void main(String[] args) throws IOException {

		
		FileOutputStream file = new FileOutputStream("C:\\Users\\Parthi\\Desktop\\rithik\\STA workspace\\testing_demo\\src\\test\\java\\Test_data\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data123");
		
		XSSFRow row1=sheet.createRow(0);
			row1.createCell(0).setCellValue("welcome");
			row1.createCell(1).setCellValue("to");
			row1.createCell(2).setCellValue("Selenium");
		
		XSSFRow row2=sheet.createRow(1);
			row2.createCell(0).setCellValue("welcome");
			row2.createCell(1).setCellValue("to");
			row2.createCell(2).setCellValue("java");
			
		XSSFRow row3=sheet.createRow(2);
			row3.createCell(0).setCellValue("welcome");
			row3.createCell(1).setCellValue("to");
			row3.createCell(2).setCellValue("python");
		
			
		workbook.write(file);	
		workbook.close();
		file.close();
		
		System.out.println("file is created......");
			
		
		
	}

}
