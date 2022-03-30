package package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class ReadWriteExcel {
	@Test
	public void M1() throws IOException{
		String  s="c:\\Users\\Public\\Documents\\Book1.xlsx";
		FileInputStream file=new FileInputStream(s);
		XSSFWorkbook work= new XSSFWorkbook(file);
		XSSFSheet sheet= work.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell=(Cell) row.getCell(0);
		System.out.println(cell);
		System.out.println(sheet.getRow(0).getCell(0));
		
	}

}
