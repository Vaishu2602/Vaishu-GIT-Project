package org.suite;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Test1 {

@Test
public void test0() {
	Assert.assertTrue(false);
	System.out.println("Method 0");
	

}
@Ignore
@Test
public void test1() {
	
	System.out.println("Method 1");
}


@Test
public void test2() {
	System.out.println("Method 2");
}



@Test
public void test3() {
	System.out.println("Method 3");
}
}