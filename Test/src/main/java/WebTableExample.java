import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javaprogram.util.List;

public class WebTableExample {

	public static void main(String[] args) throws IOException {

		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();
		  driver.get("https://www.dezlearn.com/webtable-example/");
		 
		 String beforexapth_Name="//table[@class='tg']/tbody/tr[";
		 String afterxpath_Name="]/td[1]";
		 
		 String  beforexpath_email="//table[@class='tg']/tbody/tr[";
		 String afterxpath_email="]/td[2]";
		 
		
		 
	List<WebElement> rows=	 driver.findElements(By.xpath("//table[@class='tg']//tr"));
	System.out.println(rows.size());
//	FileInputStream fis=new FileInputStream("C:\\Users\\bs0452\\eclipse-workspace\\Test\\webtable.xlsx");
//	wb=new XSSFWorkbook(fis);
//	Sheet sheet=wb.getSheetAt(0); 
	
	//Xls_Reader reader=new Xls_Reader("C:\\Users\\bs0452\\eclipse-workspace\\Test\\webtable.xlsx");
	
	
	 int total_rows=rows.size();
	
	for(int i=2;i<=total_rows;i++)
	{
		String actualxapth_Name=beforexapth_Name+i+afterxpath_Name;
		String Name=driver.findElement(By.xpath(actualxapth_Name)).getText();
		System.out.println(Name);
		
		
		String actualxapth_email=beforexpath_email+i+afterxpath_email;
		String email=driver.findElement(By.xpath(actualxapth_email)).getText();
		System.out.println(email);
	}
	}

}
