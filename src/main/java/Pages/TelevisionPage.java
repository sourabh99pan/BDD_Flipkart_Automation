package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class TelevisionPage extends TestBase{
	
	public WebDriver driver;
	
	public TelevisionPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@title='Search for products, brands and more']")
	public WebElement search;
	
	//input[@title='Search for products, brands and more']
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@type='submit'] ")
	public WebElement searchBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[@class='_30jeq3 _1_WHN1']")
	public List<WebElement>  prices;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[@class='_4rR01T']")
	public List<WebElement>  ipads;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[@class='_30jeq3 _16Jk6d']")
	public WebElement priceipad;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//select[@class='_2YxCDZ']")
	public List<WebElement> selectMinMaxPrice;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[@class='_10Ermr']")
	public WebElement searchRes;
	
	@FindBy(how = How.XPATH, using = "//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	public WebElement buynowbtn;
	
	@FindBy(how = How.XPATH, using = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	public WebElement addtocartbtn;
	
	public void searchProduct(String product)
	{
		this.search.sendKeys(product);
	}
	
	public void clickOnSearch()
	{
		searchBtn.click();
	}
	
	public List<WebElement> listPrices()
	{
		return prices;
	}
	
	public List<WebElement> listIpads()
	{
		return ipads;
	}
	
	public WebElement priceIpad()
	{
		return priceipad;
	}

	public List<WebElement> selectMinMaxPrice()
	{
		return selectMinMaxPrice;
	}
}
