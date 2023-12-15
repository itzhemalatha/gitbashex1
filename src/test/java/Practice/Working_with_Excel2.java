package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_with_Excel2 {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("C:\\Users\\itzhe\\Desktop\\seleniumfolder\\Book1.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	
	Sheet sh=book.getSheet("Sheet1");
	sh.createRow(0).createCell(0).setCellValue("Test case passed");
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\itzhe\\Desktop\\seleniumfolder\\Book1.xlsx");
	book.write(fos);
     fos.flush();

	}
	}