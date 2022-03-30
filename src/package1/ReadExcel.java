package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
 


	public class ReadExcel  {
 @Test
 public void M1() throws IOException{
        String s="C:\\Users\\Home\\Desktop\\Book1.xlsx";
		FileInputStream file = new FileInputStream(s);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
                        
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
 
 
 }
}