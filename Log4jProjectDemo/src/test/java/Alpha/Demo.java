package Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	private static Logger Log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		Log.debug("This is debug message");
		Log.info("This is info message");
		Log.error("Error message");
		Log.fatal("This is fatal message");
		
	}

}
