package com.seleniumwebdriverarchitech;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver()
	{
		System.out.println("launch chrome driver");
	}

	@Override
	public void get(String url) {
		
		System.out.println("Launch url "+ url);
		
	}

	@Override
	public void findElement(String locators) {
	System.out.println("find the element "+ locators);
		
	}

	@Override
	public void quit() {
		System.out.println("Quit the browser");
		
	}

	@Override
	public void close() {
		
		System.out.println("Close the browser");
	}

}
