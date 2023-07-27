package com.seleniumwebdriverarchitech;

public class AmazonTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement("name");
		driver.quit();
		driver.close();
		

	}

}
