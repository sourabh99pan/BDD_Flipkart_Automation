package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalInformationPage {
	
	public WebDriver driver;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//span[@class='sc-hUhoKJ gonCxX'])[2]")
	WebElement personalAndMedicalNo;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'MuiGrid-root MuiGrid-item')]//label)[4]")
	WebElement otherInurance;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='previousInsurance.exists_0' and @value='no']")
	WebElement previousInurance;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[text()='I have never smoked']")
	WebElement neverSmoke;
	
	

}
