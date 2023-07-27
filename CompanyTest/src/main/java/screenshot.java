import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://portal.bankit.in:9090/RO/");
		
	File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	FileUtils.copyFile(src,new File("C:\\Users\\bs0452\\eclipse-workspace\\CompanyTest\\loginPage.png"));
	}

}
