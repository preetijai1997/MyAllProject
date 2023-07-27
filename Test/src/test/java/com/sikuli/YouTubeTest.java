package com.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeTest {

	public static void main(String[] args) throws FindFailed, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=22");
         Thread.sleep(3000);
	
//		Screen s=new Screen();
//		Pattern pauseImg=new Pattern("C:\\Users\\bs0452\\eclipse-workspace\\Test\\YT_Pause.PNG");
//		s.wait(pauseImg,3000);
//		s.click();
//		s.click();
		
		Screen s1=new Screen();
		Pattern playImg=new Pattern("C:\\Users\\bs0452\\eclipse-workspace\\Test\\YT_PlayBtn.PNG");
		s1.wait(playImg,3000);
		s1.click();
		s1.click();
		
//		Screen s2=new Screen();
//		Pattern settingImg=new Pattern("C:\\Users\\bs0452\\eclipse-workspace\\Test\\YT_Setting.PNG");
//		s2.wait(settingImg,3000);
//		s2.click();
//		s2.click();
		
		
		Screen s3=new Screen();
		Pattern settingWithoutHDImg=new Pattern("C:\\Users\\bs0452\\eclipse-workspace\\Test\\SettingWithoutHD.PNG");
		s3.wait(settingWithoutHDImg,3000);
		s3.click();
		s3.click();
		
		
	}

}
