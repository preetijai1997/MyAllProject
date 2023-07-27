package SeleniumTutorialPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marketindex.com.au/asx/nab");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		

		List<WebElement> rows = driver
				.findElements(By.xpath("//*[@id='quoteapi--anonComponent4']/div[2]/table/tbody/tr"));
		int rowsCount = rows.size();
		System.out.println(rowsCount);

		List<WebElement> colms = driver
				.findElements(By.xpath("//*[@id=\"quoteapi--anonComponent4\"]/div[2]/table/thead/tr/th"));
		int colCount = colms.size();
		System.out.println(colCount);

		for (int i = 1; i < rowsCount; i++) {
			for (int j = 1; j < colCount; j++) {
			List<WebElement> li=	driver.findElements(By.xpath("//*[@id='quoteapi--anonComponent4']/div[2]/table/tbody/tr['+ i +']/td'[+ j +']"));
li.get(i).getText();
			}
			System.out.println();
		}

	}

	private static JavascriptExecutor JavascriptExecutor(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
