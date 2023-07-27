import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.poetryfoundation.org/poems");
		String text="Drive the shivering leaflets from the tree,";
		
		if(driver.getPageSource().contains("Drive the shiver"))
		{
			System.out.println("String is present");
		}
		
		else
		{
			System.out.println("String is not present");
		}
		
		driver.quit();

	}

}
