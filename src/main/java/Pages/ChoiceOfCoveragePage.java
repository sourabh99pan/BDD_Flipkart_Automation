package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChoiceOfCoveragePage {

	public WebDriver driver;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@value='individual']")
	WebElement productIndividual;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@value='permanent']")
	WebElement coverageTypePermanent;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='mainProduct.productId_0'])[2]")
	WebElement permanentProductT100;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root')]//input[1]")
	WebElement insuredAmount;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='disabilityPensionEnabled_0'])[2]")
	WebElement disabilityInsurance;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[1]")
	WebElement additionalAccidentalDeath;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='secondaryProduct.exists_0'])[2]")
	WebElement secondCoverageNo;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='mainBeneficiaries.exist_0'])[2]")
	WebElement beneficiaryInformationNo;
	
	
	public ChoiceOfCoveragePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void productIndividual()
	{
		this.productIndividual.click();
	}
	
	public void coverageTypePermanent()
	{
		this.coverageTypePermanent.click();
	}
	
	public void permanentProductT100()
	{
		this.permanentProductT100.click();
	}
	
	public void insuredAmount(String amount)
	{
		this.insuredAmount.sendKeys(amount);
	}
	
	public void disabilityInsurance()
	{
		this.disabilityInsurance.click();
	}
	
	public void additionalAccidentalDeath()
	{
		this.additionalAccidentalDeath.click();
	}
	
	public void secondCoverageNo()
	{
		this.secondCoverageNo.click();
	}
	
	public void beneficiaryInformationNo()
	{
		this.beneficiaryInformationNo.click();
	}
	
}
