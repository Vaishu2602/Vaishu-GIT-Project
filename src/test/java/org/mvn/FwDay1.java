package org.mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FwDay1 {
public static void main(String[] args) throws IOException {
	
//file creation
	File file1 =new File("C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\TestData\\Framework Task.xlsx");
	FileInputStream fileInputStream = new FileInputStream(file1);
Workbook book = new XSSFWorkbook(fileInputStream);
//Sheet sheet = book.getSheet("Sheet1");
//Row row = sheet.getRow(3);
//Cell cell = row.getCell(4);
//String s = cell.getStringCellValue();
//System.out.println(s);
Sheet createSheet = book.createSheet("Maven");
Row createRow = createSheet.createRow(10);
Cell createCell = createRow.createCell(4);
createCell.setCellValue("April Fool");
FileOutputStream k = new FileOutputStream(file1);
book.write(k);
System.out.println("done!!!!");


}
}
