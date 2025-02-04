package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcleFileRead {
	
	String filepath = "C:\\Users\\DELL\\eclipse-workspace\\BesantTambaramSep2024\\Input\\Testdata.xlsx";
	public void readData() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FI = new FileInputStream(F);
		
		XSSFWorkbook workbook = new XSSFWorkbook(FI);
		
		//HSSFWorkbook workbook = new HSSFWorkbook(FI);
		Sheet sheet = workbook.getSheet("invalidinput");
		int usedRow = sheet.getPhysicalNumberOfRows();
		System.out.println("user Rows : "+usedRow);
		
		Row eachRow = sheet.getRow(0);
		int usedColumn = eachRow.getLastCellNum();
		System.out.println("user columns : "+usedColumn);
		Cell eachcell = eachRow.getCell(0);
		System.out.println(eachcell.getStringCellValue());
 	}
	
	public void readDataalldata() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FI = new FileInputStream(F);
		
		XSSFWorkbook workbook = new XSSFWorkbook(FI);

		//HSSFWorkbook workbook = new HSSFWorkbook(FI);
		Sheet sheet = workbook.getSheet("invalidinput");
		int usedRow = sheet.getPhysicalNumberOfRows();
		System.out.println("user Rpws : "+usedRow);
		for(int i=0;i<usedRow;i++)
		{
		Row eachRow = sheet.getRow(i);
		int usedColumn = eachRow.getLastCellNum();
		System.out.println("user columns : "+usedColumn);
		
			for(int j=0;j<usedColumn;j++)
			{
			Cell eachcell = eachRow.getCell(j);
			//System.out.println(eachcell.getStringCellValue());
			System.out.print(GetCellValue(eachcell));
			}
		}
		
 	}
	
	public static Object GetCellValue(Cell cellVal)
	{
		if(cellVal.getCellType().toString()=="STRING")
		{
			return cellVal.getStringCellValue();
		}
		else
		{
			DataFormatter data =  new DataFormatter();
			return data.formatCellValue(cellVal);
			//return cellVal.getNumericCellValue();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcleFileRead E = new ExcleFileRead();
		E.readDataalldata();
	}

}
