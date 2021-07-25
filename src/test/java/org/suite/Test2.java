package org.suite;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Test2 {

@Test
public void test0() {
	System.out.println("Method 0");

}

@Test
public void test1() {
	System.out.println("Method 1");
}


@Test
public void test5() {
	
	System.out.println("Method 5");
	Assert.assertTrue(false);
}


@Ignore
@Test
public void test3() {
	System.out.println("Method 3");
}
}