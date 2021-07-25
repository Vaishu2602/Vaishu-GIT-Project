package org.base;


import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;



import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
public static WebDriver driver;
	public void getDriver(String browserName) {
		try {
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\geckodriver.exe");
				driver = new ChromeDriver();
			}
			else
			{
				System.out.println("invalid Browser");
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	public void launchUrl(String url) {
		try {

			driver.get(url);

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void passText(WebElement ref,String text) {
		try {
			ref.sendKeys(text);
		} catch (Exception e) {
			System.out.println(e);
		}

	}



	public void btnClick(WebElement ref) {
		try {
			ref.click();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public WebElement findId(String loc,String id) {
		WebElement findElement= null;
		try {
			if(loc.equalsIgnoreCase("id"))
			{
				 findElement = driver.findElement(By.id(id));
			}
			else if(loc.equalsIgnoreCase("classname"))
			{
				findElement = driver.findElement(By.name(id));
			}
			else if(loc.equalsIgnoreCase("xpath"))
			{
				findElement = driver.findElement(By.xpath(id));
			}


		} catch (Exception e) {
			System.out.println(e);
		}


		return findElement;

	}
	
	public String getDataFromExcel(String excelPathName,String sheetName,int rowNo,int cellNo) {
		String value = null;
		try {
			File file = new File(excelPathName);
			FileInputStream stream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rowNo);
			Cell cell = row.getCell(cellNo);
			int cellType = cell.getCellType();
			if(cellType==1)
			{
				value = cell.getStringCellValue();
			}
			else if(DateUtil.isCellDateFormatted(cell))
			{
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				value = format.format(dateCellValue);
			}
			
			
			else
			{
				double numericCellValue = cell.getNumericCellValue();
				long l = (long)numericCellValue;
				value = String.valueOf(l);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return value;
		
	}
	
public void selectByDropdown(WebElement ref,String name,String data) {
	try {
		Select select = new Select(ref);
		if(name.equalsIgnoreCase("index"))
		{
			select.selectByIndex(Integer.parseInt(data));
		}
		else if(name.equalsIgnoreCase("value"))
		{
			select.selectByValue(data);
		}
		else if(name.equalsIgnoreCase("visibletext"))
		{
			select.selectByVisibleText(data);
		}
		
	} catch (Exception e) {
		System.out.println(e);
	}

}	

	public void getScreenShot(String pathName) {
		// TODO Auto-generated method stub
try {
	TakesScreenshot tk= (TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File desc = new File(pathName);
	FileUtils.copyFile(src, desc);
	
} catch (Exception e) {
	System.out.println(e);
}
	}
	
}
	
	





