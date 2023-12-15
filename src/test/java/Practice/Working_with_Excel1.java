package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_with_Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis=new FileInputStream("\"C:\\Users\\itzhe\\Desktop\\seleniumfolder\\Book1.xlsx\"");
		
		Workbook book=WorkbookFactory.create(fis);
		
		Sheet sh=book.getSheet("Sheet1");
		
		int lastRowNum=sh.getPhysicalNumberOfRows();
		System.out.println(lastRowNum);
		
		int lastCellNum=sh.getPhysicalNumberOfRows();
		System.out.println(lastCellNum);
		
		
		
		
	}

}
