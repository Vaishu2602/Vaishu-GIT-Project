package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public void Browser( String launchbrowser) {
		try {
			if (launchbrowser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			}
			else if (launchbrowser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else {
				System.out.println("Invaalid Browser");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void launchurl(String url) {
		try {

			driver.get(url);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void Typetext(WebElement element,String input) {
		try {
			element.sendKeys(input);

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public void btn(WebElement element) {
		try {
			element.click();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public WebElement locators(String data,String id) {
		WebElement findElement = null;
		try {
			if (data.equalsIgnoreCase("id")) {
				findElement = driver.findElement(By.id(id));
			}
			else if (data.equalsIgnoreCase("xpath")) {
				findElement = driver.findElement(By.xpath(id));

			}
			else if (data.equalsIgnoreCase("name")) {
				findElement = driver.findElement(By.name(id));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return findElement;
	}
	public void Drop(WebElement element, String name ,String data ) {
try {
	Select obj = new Select(element);
	if (name.equalsIgnoreCase("index")) {
		obj.selectByIndex(Integer.parseInt(data));
		
	}
	else if(name.equalsIgnoreCase("visible text"));
	obj.selectByVisibleText(data);
	
} catch (Exception e) {
	System.out.println(e);
}

	}

}
