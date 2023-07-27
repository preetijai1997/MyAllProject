import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		*/
		FileInputStream fis=new FileInputStream("D:\\Selenium\\TestScenario.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet s=wb.getSheet("First Try");

	}

}
