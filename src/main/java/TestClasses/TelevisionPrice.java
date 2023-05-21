package TestClasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.TestBase;
import Loggers.LogAnalyzer;
import Pages.TelevisionPage;

public class TelevisionPrice extends TestBase
{
	
	TelevisionPage telepage;
	
	public static void checkPopUp()
	{
		if(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "Not Navigated to the specified URL");
		}
	}
	
	@Test(groups= {"regression"})
	public void TC001_checkTelevisionPrice() throws InterruptedException, SecurityException, IOException
	
	{
		test = report.startTest("Verify Pop up in TC001");
		
		checkPopUp();
		
		//LogAnalyzer.appendLogs("close the mail pop up");
		
		telepage = new TelevisionPage(driver);
		
		Thread.sleep(10000);
		telepage.searchProduct("Television");
		//LogAnalyzer.appendLogs("search product");
		telepage.clickOnSearch();
		//LogAnalyzer.appendLogs("click on button");
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		List<WebElement> prices = telepage.listPrices();
		
		
		
		ArrayList<Integer> actualPrices = new <Integer>ArrayList();
		
		for(int i=0;i<prices.size();i++)
		{
			System.out.println(prices.get(i).getText());
			//LogAnalyzer.appendLogs(prices.get(i).getText());
			actualPrices.add(Integer.parseInt(prices.get(i).getText().replace("₹", "").replace(",", "")));
			
		}
		
		for(int j=0;j<actualPrices.size();j++)
		{
			System.out.println(actualPrices.get(j));
		}
		
		Collections.sort(actualPrices);   
		// printing the sorted ArrayList   
		System.out.println("After Sorting: "+ actualPrices);   
	}
	

	@Test(groups= {"regression"})
	public void TC002_checkIpadPrice() throws InterruptedException
	{
		telepage = new TelevisionPage(driver);
		
		test = report.startTest("Verify Pop up in TC002");
		
		checkPopUp();
			
		Thread.sleep(5000);
		telepage.searchProduct("apple ipad");
		telepage.clickOnSearch();
		List<WebElement> ipads = telepage.listIpads();
		
		ipads.get(0).click();
		
		Thread.sleep(5000);
		
	      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
		
	      
	      
		System.out.println(telepage.priceipad.getText().replaceAll("₹", ""));
		
		
	}
	
	@Test(groups= {"smoke"})
	
	public void TC003_setMinMaxPrice() throws InterruptedException, SecurityException, IOException
	{
		test = report.startTest("TC003: Verify min and Max price");
		
		checkPopUp();
		
		telepage = new TelevisionPage(driver);
		
		Thread.sleep(1000);
		telepage.searchProduct("television");
		telepage.clickOnSearch();
		Select minPrice = new Select(telepage.selectMinMaxPrice().get(0));
		
		minPrice.selectByValue("15000");
		
		Thread.sleep(1000);
		
		Select maxPrice = new Select(telepage.selectMinMaxPrice().get(1));
		
		maxPrice.selectByValue("40000");
		
		Thread.sleep(1000);
		
		List<WebElement> prices = telepage.listPrices();
				
		ArrayList<Integer> actualPrices = new <Integer>ArrayList();
		
		for(int i=0;i<prices.size();i++)
		{
			System.out.println(prices.get(i).getText());
			//LogAnalyzer.appendLogs(prices.get(i).getText());
			actualPrices.add(Integer.parseInt(prices.get(i).getText().replace("₹", "").replace(",", "")));
			
		}
		
		for(int i=0;i<actualPrices.size();i++)
			
		{
			System.out.println(actualPrices.get(i)>15000 && actualPrices.get(i)<40000);
			
			AssertJUnit.assertEquals(true,(actualPrices.get(i)>15000 && actualPrices.get(i)<40000));
			test.log(LogStatus.PASS, "Navigated to the specified URL");
			
		}
		
	}
	
	@Test(groups= {"smoke"})
	public void TC004_searchResult() throws InterruptedException
	{
		test = report.startTest("TC004: Verify search result");
		
		checkPopUp();
		
		telepage = new TelevisionPage(driver);
		Thread.sleep(1000);
		telepage.searchProduct("television");
		telepage.clickOnSearch();
		
		if(telepage.searchRes.isDisplayed())
		{
			test.log(LogStatus.PASS, "search result is displayed");
		}
		else
		{
			test.log(LogStatus.PASS, "search result is not displayed");
		}
		
		
	}

	@Test(groups= {"regression"})
	public void TC007_checkBuyNowBtn() throws InterruptedException
	{
		telepage = new TelevisionPage(driver);
		
		test = report.startTest("TC007:Verify buynow button");
		
		checkPopUp();
			
		Thread.sleep(5000);
		telepage.searchProduct("apple ipad");
		telepage.clickOnSearch();
		List<WebElement> ipads = telepage.listIpads();
		
		ipads.get(0).click();
		
		Thread.sleep(5000);
		
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(newTb.get(1));
		
		if(telepage.buynowbtn.isDisplayed())
		{
			test.log(LogStatus.PASS, "Buy now button is displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Buy now button is not displayed");
		}
		
		
	}
	
	@Test(groups= {"regression"})
	public void TC008_checkAddtoCartBtn() throws InterruptedException
	{
		telepage = new TelevisionPage(driver);
		
		test = report.startTest("TC008: Verify Add to cart button");
		
		checkPopUp();
			
		Thread.sleep(5000);
		telepage.searchProduct("apple ipad");
		telepage.clickOnSearch();
		List<WebElement> ipads = telepage.listIpads();
		
		ipads.get(0).click();
		
		Thread.sleep(5000);
		
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(newTb.get(1));
		
		if(telepage.addtocartbtn.isDisplayed())
		{
			test.log(LogStatus.PASS, "Add to cart button is displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Add to cart button is not displayed");
		}
	}
	
	@Test(groups= {"regression"})
	public void TC009_checkAddtoCartBtn() throws InterruptedException
	{
		telepage = new TelevisionPage(driver);
		
		test = report.startTest("TC008: Verify Add to cart button");
		
		checkPopUp();
			
		Thread.sleep(5000);
		telepage.searchProduct("apple ipad");
		telepage.clickOnSearch();
		List<WebElement> ipads = telepage.listIpads();
		
		ipads.get(0).click();
		
		Thread.sleep(5000);
		
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(newTb.get(1));
		
		if(telepage.addtocartbtn.isDisplayed())
		{
			test.log(LogStatus.PASS, "Add to cart button is displayed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Add to cart button is not displayed");
		}
	}
}
