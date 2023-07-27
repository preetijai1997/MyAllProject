package chromedevtool;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v107.emulation.Emulation;

public class GEOLocation {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
	DevTools devTool=	((ChromeDriver) driver).getDevTools();
	devTool.createSession();
	devTool.send(Emulation.setGeolocationOverride(Optional.of((Number)28.64901), Optional.of((Number)77.36689), Optional.of((Number)100)));
	
	
	driver.get("https://mycurrentlocation.net/");

	}

}
