package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	
	private static ExtentReports extent;
	
	public static ExtentReports createInstance(String fileName)
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
		htmlReporter = new ExtentSparkReporter(fileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Bankit Service Private Limited");
		htmlReporter.config().setReportName("My Account Statement");
		htmlReporter.config().setTheme(Theme.DARK);
		
		
		
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("NAME", "Preeti Jaiswal");
		extent.setSystemInfo("Orgnization", "BSPL");
		extent.setSystemInfo("Build No", "4.2");
		
		
		return extent;
		
	}

	
	
	
}
