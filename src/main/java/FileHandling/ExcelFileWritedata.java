package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWritedata {
	
	String filepath = "C:\\Users\\DELL\\eclipse-workspace\\BesantTambaramSep2024\\Input\\output.xlsx";

	String[] courses = {"python","java","C#","SQL"};
	
	public void writedata() throws IOException
	{
		File F = new File(filepath);
		FileOutputStream FI = new FileOutputStream(F);
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("courseDetails");
		
		Row row = sheet.createRow(0);
		for (int i=0;i<courses.length;i++)
		{
			
			Cell cell1 = row.createCell(i);
			cell1.setCellValue(courses[i]);
			System.out.println(courses[i]);
		}
		
		System.out.println("Write done");
		workbook.write(FI);
		workbook.close();
		FI.close();
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileWritedata W = new ExcelFileWritedata();
		W.writedata();
	}

}
