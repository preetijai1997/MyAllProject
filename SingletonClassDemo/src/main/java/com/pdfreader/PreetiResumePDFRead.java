package com.pdfreader;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PreetiResumePDFRead {
	WebDriver driver;
	@Test
	public void pdfContentDemo() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 driver.get("file:///C:/Users/bs0452/Downloads/Preeti_Resume.pdf");
		String currentURL= driver.getCurrentUrl();
		System.out.println(currentURL);
		 
		URL url=new URL(currentURL);
		InputStream is=url.openStream();
		
		BufferedInputStream bis=new BufferedInputStream(is);
		
		PDDocument doc=null;
	doc=PDDocument.load(bis);
	String pdfContent=new PDFTextStripper().getText(doc);
	System.out.println(pdfContent);
	
		
	}

}
