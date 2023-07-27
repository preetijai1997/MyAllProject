package signuppagerunner;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import LoginPageObjects.loginPageObject;
import labspageobject.LabsPageObject;
import signUpPageObjects.SignUpPage;

public class SignUpPageRunner {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://stag.1mg.com/labs");

//		SignUpPage lgnpg= new SignUpPage(driver);
//		lgnpg.SignUpDetails("8957181611","preetijaiswal181400@akgec.ac.in");
		
		LabsPageObject labs = new LabsPageObject(driver);
		Thread.sleep(4000);
		labs.changeCityPopup();
	//	boolean isCrossImg=;
		if(labs.isElementPresent(driver,"//span[@class='style__closeOld___3PoPd']")) {
			Thread.sleep(5000);
			labs.clickOnCrossImg(driver);
			
		}
	
		if(labs.isElementPresent(driver,"//span[text()='Login']")) {
			loginPageObject login = new loginPageObject(driver);
		    login.loginDetails("6249123456");
		    Thread.sleep(9000);
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,900)");
		}

	
		if(labs.isElementPresent(driver, "//div[@class='style__card-wrapper___CiDL5 style__first-card___3Ndog']/div/div[2]/div[1]/span/span/button"))
		{
		labs.addTOCART();
		}
		Thread.sleep(4000);
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("window.scrollBy(0,900)");
		if(labs.isElementPresent(driver, "//div[@class='style__card-wrapper___CiDL5 style__first-card___3Ndog']/div/div[2]/div[1]/span/span/a/button")) {
		labs.addedtocart();
		}
		Thread.sleep(4000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,300)");
		
		labs.schedule();
		
		Thread.sleep(3000);
		labs.selectPatientPopup();
		Thread.sleep(6000);
		labs.selectAddress();
		Thread.sleep(10000);
		labs.clickonnextIcon();
		Thread.sleep(4000);
		labs.clickOnSlotTime();
		Thread.sleep(15000);
		labs.clickOnSlotTimeBtnn();
		Thread.sleep(20000);
		 JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy(0,950)");
			Thread.sleep(4000);
         labs.clickOnCheckOutBtn();
         Thread.sleep(9000);
         labs.payOnDilivery();
         Thread.sleep(4000);
         labs.clickOnCashDilivery();
         Thread.sleep(4000);
         labs.placeOrder();

		/*LabsPageObject labs = new LabsPageObject(driver);
		Thread.sleep(4000);
		labs.clickOnLab();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		System.out.println(parentWindow);
		String childWindow = it.next();
		System.out.println(childWindow);

		if (!parentWindow.equalsIgnoreCase(childWindow)) {
			System.out.println(".....................");
//			Screen s = new Screen();
//			Pattern closeImg = new Pattern("close.png");
//			s.wait(closeImg, 40000);
//			s.click();
			driver.switchTo().window(childWindow);
			System.out.println("==============================");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,650)");
			
			labs.clickOnFullBodyCheckup();
		}
		*/
	}
	}
