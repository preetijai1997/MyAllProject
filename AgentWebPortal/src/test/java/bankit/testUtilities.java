package bankit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import javax.mail.Store;
import com.testing.framework.EmailUtils;

public class testUtilities {

	public static void main(String[] args) throws Exception {
		
		
		EmailUtils emailUtils= new EmailUtils();
		Properties prop= new Properties();
		prop.load(new FileInputStream("C:\\Users\\bs0452\\eclipse-workspace\\AgentWebPortal\\src\\test\\java\\config\\config.properties"));
		Store connection=emailUtils.connectToGmail(prop);
				
				
	List<String>emailText=	emailUtils.getUnreadMessageByFromEmail(connection, "Inbox", "account-security-noreply@accountprotection.microsoft.com", "Microsoft account password reset");
	if(emailText.size()<1)
	{
		throw new  Exception("Email not receive ");
	}
	

	}

}
