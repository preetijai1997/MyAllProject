package executeTestCase;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import common.BaseTest;

public class testUtils extends BaseTest{
	
	public void screenShot() throws IOException
	{
       File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(file, new File("D:\\preeti.png"));
	}

}
