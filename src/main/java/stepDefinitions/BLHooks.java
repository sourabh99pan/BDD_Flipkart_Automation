package stepDefinitions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BLHooks {

	public Properties prop;
	public final String configFilePath  = "Configs//Config.properties";
	public static WebDriver driver;
	public TestBase testBase=new TestBase();;
	
	
	@Before(order =1)
	public void initializeTest()
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
		
		//testBase.configReader(configFilePath);
	}
	
	@Before(order=2)
	public void setupUrl() throws Exception
	{
		testBase.configReader();
		
		if(prop.getProperty("browserStack").contains("Y"))
		{
			testBase.browserStacklaunch();
		}
		
		else
		{
			//testBase.configReader(configFilePath);
			testBase.selectBrowser(prop.getProperty("browser"));
		}
	}
	
	@After
	public void endTest()
	{
		System.out.println("in End test");
		TestBase.driver.quit();
		
	}
	
}
