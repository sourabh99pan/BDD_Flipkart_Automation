package TestClasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.java.ExcelUtils.ExcelUtilities;
import com.java.ExcelUtils.JSONReadWrite;
import com.relevantcodes.extentreports.LogStatus;

import Base.TestBase;

public class Webtable extends TestBase{
	
	@Test(enabled=false)
	public void TC009_webtableBasic()
	{
		test = report.startTest("TC009: Verify web table basic");
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		
		System.out.println(cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		
		System.out.println(rows.size());
		
		Iterator<WebElement> itCol =cols.iterator();
		
		while(itCol.hasNext())
		{
			System.out.println(itCol.next().getText());
			
		}
		
		Iterator<WebElement> itRow =rows.iterator();
		
		while(itRow.hasNext())
		{
			System.out.println(itRow.next().getText());
			
		}
	}
	
	@Test(groups= {"regression"})
	public void TC008_Headercheck()
	{
		test = report.startTest("TC008: Verify the headers");
		
		driver.get("http://seleniumpractise.blogspot.com/");
		HashMap<String,String> hm = new <String,String>HashMap();
		
		ArrayList<String> columns = new <String>ArrayList();
		
		columns.add("Status");
		columns.add("Company");
		columns.add("Contact");
		columns.add("Country");
		columns.add("Action");
		
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='customers']//th"));
		
		
		
		System.out.println("size of headers: "+allHeaders.size());
		
		for(WebElement ele: allHeaders)
		{

			if(columns.contains(ele.getText()))
			{
				test.log(LogStatus.PASS, ele.getText()+" is present");
			}
			else
			{
				test.log(LogStatus.FAIL, ele.getText()+" is not present");
				
			}
		}
		

	}
	
	@Test(groups= {"ipad2"})
	public void TC010_checkValues()
	{
		test = report.startTest("TC008: Verify the values");
		
		driver.get("http://seleniumpractise.blogspot.com/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='customers']//th"));
		
		
		
		for(int i=2;i<=rows.size();i++)
		{
			for(int j=2;j<col.size();j++)
			{
				System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]"+"//td["+j+"]")).getText());
				
			}
		}
	}
	
	@Test(groups= {"ipad2"})
	public void TC011_selectOneCheckBox()
	{
		test = report.startTest("TC011: Check one Check Box");
		
		driver.get("http://seleniumpractise.blogspot.com/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='customers']//th"));
		
		
		
		for(int i=2;i<=rows.size();i++)
		{
			for(int j=2;j<col.size();j++)
			{
				System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]"+"//td["+j+"]")).getText());
				
				if(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]"+"//td["+j+"]")).getText().equalsIgnoreCase("Selenium"))
				{
					driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]"+"//td["+j+"]/preceding-sibling::td//input")).click();
					test.log(LogStatus.PASS, driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]"+"//td["+j+"]")).getText()+" is present");
					break;
				}
			}
		}
	}
	
	@Test(groups= {"ipad"})
	public void TC012() throws IOException, ParseException
	{
		JSONReadWrite.readWrite();
	}
}
