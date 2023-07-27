import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {
	

	public static void main(String[] args) throws IOException {
		
		Logger log=Logger.getLogger("WebTableExample.class");
/*
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
 * 
 */
	XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Create simple excel");
    
    Row header=  sheet.createRow(0);
    header.createCell(0).setCellValue("Pricipal");
    header.createCell(1).setCellValue("RoI");
    header.createCell(2).setCellValue("T");
    header.createCell(3).setCellValue("Interest (P r t)");
    log.info("message");
    
    try {
        FileOutputStream out =  new FileOutputStream(new File("C:\\Users\\bs0452\\eclipse-workspace\\Test\\webtable.xlsx"));
        workbook.write(out);
        out.close();
        System.out.println("Excel with foumula cells written successfully");
          
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
  
	/*
	
	 int total_rows=rows.size();
	
	for(int i=2;i<=total_rows;i++)
	{
		String actualxapth_Name=beforexapth_Name+i+afterxpath_Name;
		String Name=driver.findElement(By.xpath(actualxapth_Name)).getText();
		System.out.println(Name);
		
		
		String actualxapth_email=beforexpath_email+i+afterxpath_email;
		String email=driver.findElement(By.xpath(actualxapth_email)).getText();
		System.out.println(email);
		*/
	}
	}


