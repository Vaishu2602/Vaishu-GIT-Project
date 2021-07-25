package org.mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FwDaySample {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\TestData\\TestData1.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook book = new  XSSFWorkbook(fileInputStream);
		Sheet sheet = book.getSheet("Sheet1");

		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{

				Cell cell = row.getCell(j);
				String ss = cell.getStringCellValue();
				System.out.println(ss);
			}
		}
	}
}
