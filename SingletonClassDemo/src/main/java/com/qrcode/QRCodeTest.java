package com.qrcode;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.ImageReader;
import com.google.zxing.common.HybridBinarizer;

public class QRCodeTest {
	WebDriver driver;
	@Test
	public void Qrcode() throws IOException, NotFoundException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 driver.get("https://barcode.tec-it.com/en/?data=bankit%20service%20private%20%20limited");
		 
		String barcode_url= driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(barcode_url);
		
		
		URL url=new URL(barcode_url);
		
 BufferedImage bufferedImage=ImageIO.read(url);
 
 LuminanceSource luminanceSource= new BufferedImageLuminanceSource(bufferedImage);
 BinaryBitmap binarybitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));
 
          Result res=new MultiFormatReader().decode(binarybitmap);
          System.out.println(res);
		
		 
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
