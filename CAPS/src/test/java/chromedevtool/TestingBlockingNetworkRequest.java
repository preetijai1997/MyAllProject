package chromedevtool;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v94.network.Network;
import org.openqa.selenium.devtools.v108.network.Network;

import com.google.common.collect.ImmutableList;

import com.google.common.collect.ImmutableList;

public class TestingBlockingNetworkRequest {

	public static void main(String[] args) {
		
		
		WebDriver  driver= new ChromeDriver();
		
		DevTools devTool=((ChromeDriver) driver).getDevTools();
		devTool.createSession();
		
		//devTool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTool.send(Network.setBlockedURLs(ImmutableList.of("*.png","*.jpg","*.jpeg")));
		
		driver.get("https://www.selenium.dev/");

	}

}
