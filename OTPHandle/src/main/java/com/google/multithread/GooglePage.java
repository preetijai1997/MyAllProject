package com.google.multithread;

import org.openqa.selenium.By;

public class GooglePage extends BasePage{
	
	public void googleTest()
	{
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Automation Test");
		driver.findElement(By.name("q")).submit();
		driver.findElements(By.xpath("//h3")).stream().forEach(ele->System.out.println(ele.getText()));
	
	
	}
	
	public void TearDown()
	{
		driver.quit();
	}

}
