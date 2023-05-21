package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LacaptialeLoginPage {

	public WebDriver driver;
	
	@FindBy(id="1-email")
	@CacheLookup
	WebElement username;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[contains(@name,'password')]")
	WebElement password;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[contains(@name,'submit')]")
	WebElement loginButton;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[text()='New application']")
	
	WebElement Newappbtn;
	
	public LacaptialeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUserName(String userName)
	{
		this.username.sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		this.password.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public void isDisplayed()
	{
		boolean dis = Newappbtn.isDisplayed();
		
		System.out.println("new app button displayed: "+dis);
	}
}
