package com.seleniumwebdriverarchitech;

public interface WebDriver {
	
	public void get(String url);
	
	public void findElement(String locators);
	
	public void quit();
	public void close();

}
