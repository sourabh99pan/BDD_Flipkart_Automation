package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContractPolicyHoldersPage {

	public WebDriver driver;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[text()='E47006994']")
	WebElement appID;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[text()='Contract']")
	WebElement contract;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='contract.communicationLanguage'])[2]")
	WebElement language;
	
	@FindBy(id="mui-component-select-contract.selectedPolicyholders.0")
	@CacheLookup
	WebElement policyHolderinfo;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]")
	WebElement lastName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[2]")
	WebElement firstName;
	
	@FindBy(id="mui-component-select-contract.mainPolicyholder.otherPolicyHolderPersonGender")
	@CacheLookup
	WebElement gender;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[3]")
	WebElement dob;
	
	@FindBy(id="mui-component-select-contract.mainPolicyholder.otherPolicyHolderMaritalStatus")
	@CacheLookup
	WebElement maritalStatus;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='contract.mainPolicyholder.otherPolicyHolderMaritalStatus'])[2]")
	WebElement profession;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[5]")
	WebElement address;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='contract.mainPolicyholder.otherPolicyHolderCity']")
	WebElement city;
	
	@FindBy(id="mui-component-select-contract.mainPolicyholder.otherPolicyHolderProvincedetails")
	@CacheLookup
	WebElement province;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='contract.mainPolicyholder.otherPolicyHolderPostalcodedetails']")
	WebElement postalCode;
	
	@FindBy(id="mui-component-select-type_0")
	@CacheLookup
	WebElement telephoneType;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='phoneNumber_0']")
	WebElement telephone;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='contract.mainPolicyholder.policyholderIdentityVerification.verificationMethod'])[2]")
	WebElement verifyPolicyHolderNo;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='contract.mainPolicyholder.sin']")
	WebElement sin;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div[@class='sc-ffgBaG dTpSFj'])[2]")
	WebElement payment;
	
	public ContractPolicyHoldersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void appID()
	{
		this.appID.click();
	}
	
	public void contractClick()
	{
		this.contract.click();
	}
	
	public void languageSelect()
	{
		this.language.click();
	}
	
	public void selectPolicyHolder(String holder)
	{
		Select pholder = new Select(this.policyHolderinfo);
		pholder.selectByIndex(0);
	}	
	
	public void enterLastName(String lastName)
	{
		this.lastName.sendKeys(lastName);
	}
	
	public void enterFirstName(String firstName)
	{
		this.firstName.sendKeys(firstName);
	}
	
	public void selectGender(String sex)
	{
		Select sex1 = new Select(this.gender);
		sex1.selectByVisibleText(sex);
	}	
	
	public void dob(String dob)
	{
		this.dob.sendKeys(dob);
	}
	
	public void maritalStatus(String maritalStatus)
	{
		Select maritalStatus1 = new Select(this.maritalStatus);
		maritalStatus1.selectByVisibleText(maritalStatus);
	}
	
	public void enterProfession(String profession)
	{
		this.profession.sendKeys(profession);
	}
	
	public void address(String address)
	{
		this.address.sendKeys(address);
	}
	
	public void city(String city)
	{
		this.city.sendKeys(city);
	}
	
	public void province(String province)
	{
		Select province1 = new Select(this.province);
		province1.selectByVisibleText(province);
	}
	
	public void postalCode(String postalCode)
	{
		this.postalCode.sendKeys(postalCode);
	}
	
	public void telephoneType(String telephoneType)
	{
		Select telephoneType1 = new Select(this.telephoneType);
		telephoneType1.selectByVisibleText(telephoneType);
	}
	
	public void telephone(String telephone)
	{
		this.telephone.sendKeys(telephone);
	}
	
	public void verifyPolicyHolder()
	{
		this.verifyPolicyHolderNo.click();
	}
	
	public void enterSin(String sin)
	{
		this.sin.sendKeys(sin);
	}
	
	public void clickPayment()
	{
		this.payment.click();
	}
	
	
}
