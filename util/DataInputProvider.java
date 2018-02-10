package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider {

	public Object[][] readExcel(String fileName) throws IOException {

		//Open WorkBook
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//Go to Sheet	
		XSSFSheet sheet = wBook.getSheet("Login");
		// Find Rows Count(Sheet Level)
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		//Go to Header Row(Row = 0)
		XSSFRow headerRow = sheet.getRow(0);		
		//Find Column Count(Row Level)
		int columnCount = headerRow.getLastCellNum();
		System.out.println(columnCount);
		
		Object[][] data = new Object[rowCount][columnCount];
		
		
		//Go to each Row 
		for (int i = 1; i <= rowCount; i++) {			
			XSSFRow row = sheet.getRow(i);			
			//Go to Each Cell			
			for (int j = 0; j < columnCount; j++) {				
				XSSFCell cell = row.getCell(j);				
				//Print Content of cell
				//System.out.println(cell.getStringCellValue());
				data[i-1][j] = cell.getStringCellValue();
			}			
		}		
		wBook.close();
		return data;
	}
}










