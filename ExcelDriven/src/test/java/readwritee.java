import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class readwritee {

	public static void main(String[] args) throws IOException {
	
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\bs0452\\eclipse-workspace\\ExcelDriven\\src\\test\\resources\\properties\\readwrite.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\bs0452\\eclipse-workspace\\ExcelDriven\\src\\test\\resources\\properties\\readwrite.properties");
		prop.setProperty("name", "preeti");
		prop.store(fos, "This is comment");
	}

}
