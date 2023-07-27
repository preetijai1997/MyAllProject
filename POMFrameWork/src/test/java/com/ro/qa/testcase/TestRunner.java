package com.ro.qa.testcase;

import org.testng.TestNG;

public class TestRunner {
	
	static TestNG TestNg;

	public static void main(String[] args) {
		
		//ExtentReportListener ex=new ExtentReportListener();
		TestNg=new TestNG();
		TestNg.setTestClasses(new Class[] {LoginPageTest.class});
		TestNg.run();
		
		
	}

}
