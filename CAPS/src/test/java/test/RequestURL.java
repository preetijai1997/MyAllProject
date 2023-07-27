package test;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.network.Network;
import org.openqa.selenium.devtools.v108.network.model.ConnectionType;


public class RequestURL {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
          
          DevTools devTool=((ChromeDriver) driver).getDevTools();
          devTool.createSession();
          Optional<Object> op;
          
       //devTool.send(Network.enable(op.empty(),op.empty(),op.empty()));
          devTool.send(Network.emulateNetworkConditions(false, 100, 20000, 10000, Optional.of(ConnectionType.CELLULAR2G)));
          /*
          devTool.addListener(Network.requestWillBeSent(), requestSent -> {

              System.out.println("Request URL => " + requestSent.getRequest().getUrl());

              System.out.println("Request Method => " + requestSent.getRequest().getMethod());

              System.out.println("Request Headers => " + requestSent.getRequest().getHeaders().toString());

              System.out.println("-------------------------------------------------");

        });

       // Once we are done with Network capturing, we need to navigate to the URL

        driver.get("https://rahulshettyacademy.com/#/index");
*/
          driver.get("https://uat.bankit.in/RO/");

	}

}
