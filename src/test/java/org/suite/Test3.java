package org.suite;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Test3 {

@Test
public void test0() {
	System.out.println("Method 0");
	

}

@Test
public void test1() {
	Assert.assertTrue(false);
	System.out.println("Method 1");
}

@Ignore
@Test
public void test2() {
	System.out.println("Method 2");
}



@Test
public void test3() {
	System.out.println("Method 3");
}
}