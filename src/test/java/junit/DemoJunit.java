package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoJunit {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("welcome");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("Junit");

	}
	@Before
	public void before() {
	System.out.println("to");	
	}
	@After
	public void after() {
		System.out.println("work");
		}
	@Test
	public void tt() {
		System.out.println("in selenium");
	}
	}


