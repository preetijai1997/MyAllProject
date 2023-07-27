import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalEnvioment {

	public static void main(String[] args) throws IOException {
 		// TODO Auto-generated method stub
   Properties prop=new Properties();
  //FileInputStream fis new FileInputStream("C:\\Users\\bs0452\\eclipse-workspace\\TestNGTutorial\\src\\data.properties");
   
   FileInputStream fis= new FileInputStream("C:\\Users\\bs0452\\eclipse-workspace\\TestNGTutorial\\src\\data.properties");
   prop.load(fis);
   System.out.println(prop.getProperty("browser"));
   System.out.println(prop.getProperty("url"));
 prop.setProperty("browser", "Edge");
   //System.out.println(prop.getProperty("browser"));
   FileOutputStream fos= new FileOutputStream("C:\\Users\\bs0452\\eclipse-workspace\\TestNGTutorial\\src\\data.properties");
   
  prop.store(fos, null);
   
   
	}

}
