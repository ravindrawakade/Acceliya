package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.excelant.util.ExcelAntWorkbookUtilFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Util1 
{
    public static String  readExcel(int row,int  column) throws EncryptedDocumentException, IOException
    {
    	FileInputStream file = new FileInputStream("C:\\Users\\Admin\\newWorkspace\\FrameworkZerodha\\Excel\\Zerodha TestData.xlsx");
    	Sheet testData = WorkbookFactory.create(file).getSheet("Sheet1");
	    return testData.getRow(row).getCell(column).getStringCellValue();
		
    	 
    }
    
    public static void screenshot(WebDriver driver) throws IOException 
    
    {
    	
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\newWorkspace\\FrameworkZerodha\\Screenshots\\newss.jpeg");
		FileHandler.copy(source, dest);
		
    }
}
