package SeleniumTutorialPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassandSuite {
	
	@BeforeSuite
	public void  beforesuites()
	{
		System.out.println("Before Suites");
	}
	
	@AfterSuite
	public void aftersuites()
	{
		System.out.println("After suite");
	}
	
	@BeforeClass
	public void beforeclasses()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterclasses()
	{
		System.out.println("After class");
	}
	
	@Test(groups="regression")
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@BeforeGroups(value="regression")
	public void beforegroup()
	{
		System.out.println("Before Group");
	}
	
	@AfterGroups(value="regression")
	public void aftergroup()
	{
		System.out.println("After Group");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method");
	}

}
