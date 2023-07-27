//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.BeforeClass;
//
//import com.twilio.Twilio;
//
//public class OTPValidate {
//	
//	@BeforeClass
//	public static void start() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	    Twilio.init("AC72f8dd7b328dd65d6c9b52eced63fe45", "89e02d44a626cad35e80d479a53e9e10");
//	    DriverHolder.setDriverThread(driver.createDriver(driver));
//	    DriverHolder.getDriverThread().manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
//	    DriverHolder.getDriverThread().manage().timeouts().pageLoadTimeout(DELAY, TimeUnit.SECONDS);
//	    DriverHolder.getDriverThread().manage().timeouts().setScriptTimeout(DELAY, TimeUnit.SECONDS);
//	    navigateWebBrowser().to("Add your url");
//	}
//	
//	public RegisterPage enterRegisterData() {
//	    
//		final WaitCondition waitCondition = new WaitCondition();
//		    waitCondition.waitForVisibilityOfElementLocatedBy(PHONE).clear();
//		    waitCondition.waitForVisibilityOfElementLocatedBy(PHONE).sendKeys( "Add phone number for registration");
//
//		    waitCondition.waitForVisibilityOfElementLocatedBy(VERIFY).click();
//
//		    waitCondition.waitForVisibilityOfElementLocatedBy(FIRST_NAME).clear();
//		    waitCondition.waitForVisibilityOfElementLocatedBy(FIRST_NAME).sendKeys("Any name");
//
//		    waitCondition.waitForVisibilityOfElementLocatedBy(PASSWORD).clear();
//		    waitCondition.waitForVisibilityOfElementLocatedBy(PASSWORD).sendKeys("qwerty123456");
//
//		    waitCondition.waitForVisibilityOfElementLocatedBy(CODE).clear();
//		    try {
//		        waitCondition.waitForVisibilityOfElementLocatedBy(CODE).sendKeys(getVerificationCode(getVerificationCode()));
//		    } catch (URISyntaxException | IOException ex) {
//		        if (LOGGER.isLoggable(Level.INFO)) {
//		            LOGGER.info("The method getVerificationCode is down." + ex.getMessage());
//		        }
//		    }
//
//		waitCondition.waitForVisibilityOfElementLocatedBy(REGISTER).click();
//
//		    return this;
//		}
//	
//	public static String getVerificationCode(final String phone) throws URISyntaxException, IOException {
//	    final URIBuilder uri = new URIBuilder("Add url for API");
//	    uri.setPath("Add endpoint for get OTP code");
//	    uri.addParameter("token", your token);
//	    uri.addParameter("phone", your phone);
//	    final String codes = getHtml(uri.toString());
//	    final JSONObject jsonObj = new JSONObject(codes);
//	    final Object returnCode = jsonObj.get("code");
//	    return String.valueOf(returnCode);
//	}
//	
//	
//	private static String getHtml(final String urlToRead) throws IOException {
//	    final StringBuilder result = new StringBuilder();
//	    final URL url = new URL(urlToRead);
//	    final URLConnection connection = url.openConnection();
//	    if (connection == null) {
//	        throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
//	    } else {
//	        final HttpURLConnection conn = (HttpURLConnection) connection;
//	        conn.setRequestMethod("GET");
//	        final BufferedReader bufferedReader = new BufferedReader((Reader) (new InputStreamReader(conn.getInputStream())));
//	        final Ref.ObjectRef line = new Ref.ObjectRef();
//	        while (true) {
//	            final String lines = bufferedReader.readLine();
//	            line.element = lines;
//	            if (lines == null) {
//	                bufferedReader.close();
//	                final String resultLines = result.toString();
//	                Intrinsics.checkExpressionValueIsNotNull(resultLines, "result.toString()");
//	                return resultLines;
//	            }
//	            result.append((String) line.element);
//	        }
//	    }
//	}
//	
//	@Test
//	public void testRegister() {
//	    new RegisterPage()
//	            .openLoginForm()
//	            .cliclRegisterPage()
//	            .enterRegisterData()
//	            .checkApproveRegistration();
//	}
//
//}
