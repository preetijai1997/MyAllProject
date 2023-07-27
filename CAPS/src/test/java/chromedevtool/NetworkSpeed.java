package chromedevtool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v105.network.Network;
//import org.openqa.selenium.devtools.v106.network.model.ConnectionType;
import org.openqa.selenium.devtools.v108.network.Network;
//import org.openqa.selenium.devtools.v109.network.model.ConnectionType;
import org.openqa.selenium.devtools.v109.network.model.ConnectionType;

import com.google.common.base.Optional;

public class NetworkSpeed {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		DevTools devTool=((ChromeDriver) driver).getDevTools();
		devTool.createSession();
		/*
		devTool.send(Network.enable(Optional.absent(), Optional.absent(), Optional.absent()));
		devTool.send(Network.emulateNetworkConditions(false, 200, 3000, 2500, Optional.of(ConnectionType.CELLULAR2G)));
		*/
	}

}
