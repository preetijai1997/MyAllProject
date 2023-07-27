package com.retryanalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {

	@Test
	public void Test1()
	{
		System.out.println("Test 1");
		Assert.assertEquals(false,true);
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2");
		Assert.assertEquals(false,true);
	}
}
