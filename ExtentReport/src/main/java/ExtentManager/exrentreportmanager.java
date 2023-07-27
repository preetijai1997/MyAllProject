package ExtentManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class exrentreportmanager {
	

	public static ExtentSparkReporter sr;
	public static ExtentReports exre;
	public static com.aventstack.extentreports.ExtentTest test;
	
	public static ExtentReports getReport()
	{
		if(exre==null)
		{
			exre=new ExtentReports();
			String er=System.getProperty("user.dir")+"//target//spark.html";
			 sr=new ExtentSparkReporter(er);
			sr.config().setReportName("Bankit");
			sr.config().setDocumentTitle("Retailer");
			sr.config().setTheme(Theme.DARK);
			
			exre.attachReporter(sr);
	}
  return exre;
}
}
