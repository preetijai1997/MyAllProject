import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
//import com.baseClass.BaseClass;
import com.utility.Log;

public class TestClass2 extends BaseClass {
 
 @Test
 public void wordPressTest() {
  Log.startTestCase("wordPressTest");
  Log.info("Entering User Name");
  driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
  Log.info("Entering User Password");
  driver.findElement(By.id("pass1")).sendKeys("opensourcecms");
  Log.info("Click on Login Button");
  driver.findElement(By.id("submit")).click();
  Log.info("Home Page");
  Log.info("Get Current URL");
  String urlString=driver.getCurrentUrl();
  Log.info("Validate the URL");
  String expectedURL="https://s1.demo1.opensourcecms.com/wordpress/wp-admin/";
  Assert.assertEquals(urlString, expectedURL);
  Log.info("URL Matches");
  Log.endTestCase("wordPressTest");
 }

}