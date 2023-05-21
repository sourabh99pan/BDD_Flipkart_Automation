package TestClasses;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Base.TestBase;
import Loggers.LogAnalyzer;

public class ProductList extends TestBase{
	
	
	@Test(groups= {"regression"})
	public void TC005_checkProductList() throws SecurityException, IOException
	{
		
		test = report.startTest("TC006: Verify Title");
		
		if(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		}
		
		System.out.println("Title is "+driver.getTitle());
		List<WebElement> listprod = driver.findElements(By.xpath("//div[@class='xtXmba']"));
		
		for(int i=0;i<listprod.size();i++)
		{
			System.out.println(listprod.get(i).getText());
			//LogAnalyzer.appendLogs(listprod.get(i).getText());
		}
		
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups= {"smoke"})
	public void TC006_checkTitle()
	
	
	{
		test = report.startTest("TC006: Verify Title");
		
		if(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			test.log(LogStatus.PASS, "Button is displayed");
			
		}
		
		AssertJUnit.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery,, Books & More. Best Offers!");

	}

}
