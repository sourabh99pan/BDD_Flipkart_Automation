package Base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.Properties;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.TakesScreenshot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class TestBase {
	
	public static Properties prop;
	public final static String configFilePath  = "Configs//Config.properties";
	public static WebDriver driver;
	//public RemoteWebDriver driver1;
	public static ExtentTest test;
	public static ExtentReports report;
	

	  
	public static void configReader()
	{
		BufferedReader reader;
		System.out.println("in config reader "+configFilePath);
		
		try
		{
			reader = new BufferedReader(new FileReader(configFilePath));
			prop = new Properties();
			try
			{
				prop.load(reader);
				reader.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Config.properties file not found at: "+configFilePath);
		}
	}

	public static WebDriver selectBrowser(String browser)
	{

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println(System.getProperty("user.dir"));
		    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		    //driver = new ChromeDriver();
		   ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(options);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(1000));
		    System.out.println("i am in TestBase");
		    configReader();
		    driver.get(prop.getProperty("url"));
		}
		else
		{
	        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
	        WebDriver driver = new EdgeDriver();
		    driver.manage().window().maximize();
		    configReader();
		    driver.get(prop.getProperty("url"));
			
		}
		return driver;
		
	}
	
	@BeforeTest(groups= {"smoke","regression","ipad"})
	public static void startTest(final ITestContext testContext)
	{
		System.out.println("In Before Test");
		report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");

		test = report.startTest(testContext.getName());
	}
	
	@AfterTest(groups= {"smoke","regression","ipad"})
	public static void endTest()
	{
		System.out.println("In After Test");
	report.endTest(test);
	report.flush();
	}
	
	public static void browserStacklaunch() throws Exception 
	{
	  String AUTOMATE_USERNAME = "sourabhpandya_tUb0f9";
	  String AUTOMATE_ACCESS_KEY = "DHynmmG5mGiCGhiuPxEp";
	 // String URL = "https://hub-cloud.browserstack.com/wd/hub";
	  final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  
	  	configReader();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserstack.user", "sourabhpandya_tUb0f9");
		caps.setCapability("browserstack.key", "DHynmmG5mGiCGhiuPxEp");
	    caps.setCapability("browser", prop.getProperty("browser"));
	   // caps.setCapability("device", prop.getProperty("device"));
	    caps.setCapability("browser_version", prop.getProperty("browserVersion"));
	    caps.setCapability("build", "alpha_0.1.7");
	    //caps.setCapability("realMobile", "true");
	    caps.setCapability("os", prop.getProperty("os"));
	    caps.setCapability("os_version", prop.getProperty("os_version"));
	  //caps.setCapability("browserstack.local", "false");
	    caps.setCapability("name", "BL Lacapitale Test1"); // test name
	   // caps.setCapability("browserstack.console", "disable");
	    //caps.setCapability("browserstack.idleTimeout", 120);
	    caps.setCapability("browserstack.debug", "false");
	    
	    //caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
	    
	    System.out.println("in browserstack function");
	    try
	    {
	    	 driver = new RemoteWebDriver(new java.net.URL(URL),caps);
	    	// File srcFile = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	// FileHandler.copy(srcFile, new File("C:\\Users\\10694212\\git\\BL_BDD_Cucumber\\BLBddProject\\Screenshots"));
	    }
	    catch(MalformedURLException e)
	    {
	    	e.printStackTrace();
	    }
	    
	    
	   // driver.manage().window().maximize();
	    driver.get(prop.getProperty("url"));
	    
	    		
	    //return driver;
	}
	
	@BeforeMethod(groups= {"smoke","regression","ipad"})
	public void initializeTest() throws Exception
	{

		BufferedReader reader;
		
		try
		{
			reader = new BufferedReader(new FileReader(configFilePath));
			prop = new Properties();
			try
			{
				prop.load(reader);
				reader.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Config.properties file not found at: "+configFilePath);
		}
		
		setupUrl();
		//report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
		//test = report.startTest("ExtentDemo");
	}
	
	@AfterMethod(groups= {"smoke","regression","ipad"})
	public void end_Test()
	{
		//report.endTest(test);
		//report.flush();
		System.out.println("in End test");
		TestBase.driver.quit();

		
	}
	
	public static void setupUrl() throws Exception
	{
		configReader();
		
		if(prop.getProperty("browserStack").contains("Y"))
		{
			browserStacklaunch();
		}
		
		else
		{
			//testBase.configReader(configFilePath);
			selectBrowser(prop.getProperty("browser"));
		}
	}
	
	public void failedScreenshot(String testMethodName)
	{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d =new Date();
		
		String TimeStamp = d.toString().replace(":", "_");
		try
		{
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\target\\ScreenShots\\"+testMethodName+"_"+TimeStamp+".png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
