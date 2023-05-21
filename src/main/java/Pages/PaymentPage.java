package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage {

	public WebDriver driver;
	
	@FindBy(id="mui-component-select-contract.payment.payer.insuredId")
	@CacheLookup
	WebElement payer;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@value='pad']")
	WebElement premiumPayment;
	
	@FindBy(id="mui-component-select-contract.pad.accountHolderId")
	@CacheLookup
	WebElement accountHolder;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='contract.pad.branchNumber']")
	WebElement branchNumber;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='contract.pad.financialInstitutionNumber']")
	WebElement finInsNumber;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='contract.pad.accountNumber']")
	WebElement accountNumber;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//label[contains(@class,'MuiFormControlLabel-root sc-cSiBin')])[3]")
	WebElement personalPAD;
	
	
	public PaymentPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void payer(String payer)
	{
		Select payer1 = new Select(this.payer);
		payer1.selectByVisibleText(payer);
	}
	
	
	public void premiumPayment()
	{
		this.premiumPayment.click();
	}
	
	public void accountHolder(String accountHolder)
	{
		Select accountHolder1 = new Select(this.accountHolder);
		accountHolder1.selectByVisibleText(accountHolder);
	}
	
	public void branchNumber(String branchNumber)
	{
		this.branchNumber.sendKeys(branchNumber);
	}
	
	public void finInsNumber(String finInsNumber)
	{
		this.finInsNumber.sendKeys(finInsNumber);
	}
	
	public void accountNumber(String accountNumber)
	{
		this.accountNumber.sendKeys(accountNumber);
	}
	
	public void personalPAD()
	{
		this.personalPAD.click();
	}
}
