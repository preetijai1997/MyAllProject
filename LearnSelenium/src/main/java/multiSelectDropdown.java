import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		WebElement ele=driver.findElement(By.id("cars"));
       Select select= new Select(ele);
       
       boolean multiple=  select.isMultiple();
       System.out.println(multiple);
       if(multiple)
       {
    	   select.selectByValue("volvo");
    	   select.selectByValue("opel");
    	   }
  
     List<WebElement> options=  select.getOptions();
     for(WebElement op:options)
     {
     System.out.println("Print all options :"+ op.getText());
     }
   String element=  select.getFirstSelectedOption().getText();
   System.out.println("First select option: "+element);
   
   List<WebElement> allselectOptions=select.getAllSelectedOptions();
   for(WebElement selectedOp:allselectOptions)
   {
   System.out.println("All select options: "+selectedOp.getText());
   }   
	}

}
