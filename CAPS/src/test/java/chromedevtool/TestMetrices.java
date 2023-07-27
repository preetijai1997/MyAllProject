package chromedevtool;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class TestMetrices {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
		DevTools devTool=((ChromeDriver) driver).getDevTools();
		
		devTool.createSession();
		
		Map<String, Object> deviceMetrices= new HashMap<String, Object>(){
			{
			put("width", 375);
			put("height", 812);
			put("mobile", true);
			put("deviceScaleFactor", 50);
			
			
			}
		
		};
		
		((ChromeDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrices);
		
		driver.get("https://red.bankit.in/RO2/");
}

}
