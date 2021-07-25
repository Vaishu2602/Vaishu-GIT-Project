package org.mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExcel {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Sel\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone");
		WebElement btLogin = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btLogin.click();
		List<WebElement> product = driver.findElements(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']"));
		int size = product.size();
		System.out.println("Size of Products is " + size);
		File file1 = new File("C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\TestData\\Framework Task.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file1);
		Workbook book = new XSSFWorkbook(fileInputStream);
		Sheet sheet = book.createSheet("Product Name");

		for(int i=0;i<size;i++)
		{
			WebElement data = product.get(i);
			String text = data.getText();
			Row createRow = sheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
		}
		FileOutputStream k = new FileOutputStream(file1);
		book.write(k);
		System.out.println("done!!!!");
	}
}











//for(int i=0;i< size;i++) {
//String stringCellValue = android.createRow(i).createCell(i).setCellValue(x);
//}