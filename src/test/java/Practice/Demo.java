package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 
		FileInputStream fis=new FileInputStream("C:\\Users\\itzhe\\Desktop\\seleniumfolder\\Book1.xlsx");
		
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
//		//to access row
//		Row row=sh.getRow(1);
//		//to access cell
//		Cell cell=row.getCell(0);
//		//to fetch the data in the String format
//		System.out.println(cell.getStringCellValue());
//		//if want to fetch the data in number format
//		System.out.println(cell.getNumericCellValue());
//	
	    System.out.println(sh.getRow(0).getCell(0).toString());
		System.out.println(sh.getRow(1).getCell(0).toString());
		
		System.out.println(sh.getRow(2).getCell(1).toString());
		
	}
	
	
	
	
}
