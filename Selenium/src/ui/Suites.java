package ui;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Suites {

	@BeforeSuite
	public void beforeSetup()
	{
		System.out.println("This has been set before");
	}
	
	@AfterSuite
	public void afterSetup()
	{
		System.out.println("Logout after SetUp");
	}

}
