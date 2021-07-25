package org.main;
import org.base.LibGlobal;
import org.openqa.selenium.WebElement;

public class MainClass extends LibGlobal{
public static void main(String[] args) throws InterruptedException {
	LibGlobal base = new LibGlobal();
	base.getDriver("chrome");
	base.launchUrl("http://adactinhotelapp.com/");
	WebElement user = base.findId("id", "username");
	base.passText(user, base.getDataFromExcel("C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\TestData\\AdactinHotel.xlsx", "Sheet1", 1, 0));
	WebElement pass = base.findId("id", "password");
	base.passText(pass,base.getDataFromExcel("C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\TestData\\AdactinHotel.xlsx","Sheet1", 1, 1));
	WebElement btn = base.findId("id","login");
	base.btnClick(btn);
	WebElement Location = base.findId("id", "location");
	base.selectByDropdown(Location, "visibletext", "London");
	WebElement hotel = base.findId("id", "hotels");
	base.selectByDropdown(hotel,"visibletext","Hotel Sunshine");
	WebElement room = base.findId("id", "room_type");
	base.selectByDropdown(room, "visibletext", "Double");
	WebElement roomNo = base.findId("id", "room_nos");
	base.selectByDropdown(roomNo, "visibletext", "7 - Seven");
	WebElement adults = base.findId("id", "adult_room");
	base.selectByDropdown(adults, "visibletext","1 - One");
	WebElement child = base.findId("id", "child_room");
	base.selectByDropdown(child, "visibletext", "0 - None");
	WebElement search = base.findId("id", "Submit");
	base.btnClick(search);
	WebElement radioButton = base.findId("id", "radiobutton_0");
	base.btnClick(radioButton);
	WebElement con = base.findId("id", "continue");
	base.btnClick(con);
	WebElement fname = base.findId("id", "first_name");
	base.passText(fname, "Vaishnavi");
	WebElement lname = base.findId("id", "last_name");
	base.passText(lname, "Krishnan");
	WebElement address = base.findId("id", "address");
	base.passText(address, "D.no45,Philomina Nagar\n,4th street\n,Nk Road\n,Thanjavur");
	WebElement creditNo = base.findId("id", "cc_num");
	base.passText(creditNo, "1234567812345678");
	WebElement creditType = base.findId("id", "cc_type");
	base.selectByDropdown(creditType, "visibletext", "VISA");
	WebElement cexpMon = base.findId("id", "cc_exp_month");
	base.selectByDropdown(cexpMon, "visibletext", "July");
	WebElement cexpYear = base.findId("id", "cc_exp_year");
	base.selectByDropdown(cexpYear, "visibletext", "2022");
	WebElement cvv = base.findId("id", "cc_cvv");
	base.passText(cvv, "456");
	WebElement booksearch = base.findId("id", "book_now");
	base.btnClick(booksearch);
	Thread.sleep(7000);
	WebElement orderno = base.findId("id", "order_no");
	String attribute = orderno.getAttribute("value");
	System.out.println(attribute);
base.getScreenShot("C:\\Users\\ELCOT\\Desktop\\eclipse\\Mavenday\\ScreenShot\\AdactinHotel.png");
System.out.println("done");
}
}
