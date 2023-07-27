import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGHANDLE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.get("file:///C:/Users/bs0452/Downloads/home.html");
//		
//		String color=driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='path' and @stroke='#d85b49']")).getAttribute("fill");
//System.out.println(color);
		
		driver.get("http://debeissat.nicolas.free.fr/svg3d.php");
		
		driver.switchTo().frame("logo");
	List<WebElement> elist=	driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g' and @id='g2']//*[local-name()='path' and contains(@id,'face')]"));
	
	for(WebElement e:elist)
	{
		String text=e.getAttribute("d");
		System.out.println(text);
		System.out.println("Preeti ");
	}
	
	}

}
