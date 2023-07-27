import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	WebElement clickOnCreateNewAccount=	driver.findElement(By.linkText("Create New Account"));
	clickOnCreateNewAccount.click();
	
	Thread.sleep(3000);
	WebElement day=driver.findElement(By.id("day"));
	WebElement month= driver.findElement(By.id("month"));
	WebElement year=driver.findElement(By.id("year"));
	
	
	String dob="11-Oct-1997";
	String dobArr[]=dob.split("-");
//	selectDropDown(day,dobArr[0]);
//	selectDropDown(month,dobArr[1]);
//	selectDropDown(year,dobArr[2]);
	
	//-----------Days-------------------//
	Select select=new Select(day);
List<WebElement> listOfOption=	select.getOptions();
System.out.println(listOfOption.size());
int totalDays=listOfOption.size()-1;

for(int i=0;i<listOfOption.size();i++)
{
	String dayValue=listOfOption.get(i).getText();
	System.out.println("Print total days==="+dayValue);
}
	
	//-------------month---------------//
Select select1=new Select(month);

List<WebElement> listOfMonth=select1.getOptions();

System.out.println(listOfMonth.size());

int totalMonth=listOfMonth.size()-1;

for(int i=0;i<listOfMonth.size();i++)
{
	String monthValue=listOfMonth.get(i).getText();
	System.out.println("Print month===="+monthValue);
}

	
Select select2=new Select(year);

List<WebElement> listOfYear=select2.getOptions();

System.out.println(listOfYear.size());

int totalListYear=listOfYear.size()-1;

for(int i=0;i<listOfYear.size();i++)
{
	String yearValue=listOfYear.get(i).getText();
	System.out.println("Print year===="+yearValue);
}
	
	
	}
	
	
	
	
	
//	public static void selectDropDown(WebElement ele, String value)
//	{
//		Select select=new Select(ele);
//		select.selectByVisibleText(value);
//	}

}
