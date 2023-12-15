package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataUtility {

	
		public String getDataFromProperties(String key) throws IOException
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\itzhe\\Desktop\\seleniumfolder\\Testdata.properties");
		    Properties pobj=new Properties();
		    pobj.load(fis);
		    String value=pobj.getProperty(key);
			return value; 
		
		}
	
      public String getDataFromExcel(String Sheetname,int rowNum,int cellNum) throws IOException
       {
           FileInputStream fis=new FileInputStream("C:\\Users\\itzhe\\Desktop\\seleniumfolder\\Book1.xlsx");
           Properties pobj=new Properties();
           pobj.load(fis);
           String value=pobj.getProperty(Sheetname);
           return value;



}
}	
	
	

