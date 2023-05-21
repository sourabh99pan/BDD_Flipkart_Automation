package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import io.cucumber.java.en.Given;

public class GeneralInformationPage  {

	public WebDriver driver;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//td[text()='E35373430']")
	WebElement appID;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]")
	WebElement lastName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[2]")
	WebElement firstName;
	
	@FindBy(id="mui-component-select-insuredBasicInfo.gender_0")
	@CacheLookup
	WebElement sex;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[5]")
	WebElement DOB;

	@FindBy(id="mui-component-select-insuredBasicInfo.gender_0")
	@CacheLookup
	WebElement maritalStatus;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='insuredOriginInfo.canadianCitizen_0'])[1]")
	WebElement canadianCitizen;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='insuredAddress.street_0']")
	WebElement address;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='insuredAddress.city_0']")
	WebElement city;
	
	@FindBy(id="mui-component-select-insuredAddress.province_0")
	@CacheLookup
	WebElement province;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='insuredAddress.postalCode_0']")
	WebElement postalCode;
	
	@FindBy(id="mui-component-select-type_0_0")
	@CacheLookup
	WebElement telephoneType;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='phoneNumber_0_0']")
	WebElement telephone;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='jss386'])[4]")
	WebElement purposeOfInsuranceMortgage;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//label[contains(@class,'MuiFormControlLabel-root sc-cSiBin')])[4]")
	WebElement purposeOfInsuranceQ2No;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='payWithLoan.case_0'])[2]")
	WebElement purposeOfInsuranceQ3No;
	
	@FindBy(id="mui-component-select-type_0_0")
	@CacheLookup
	WebElement employmentStatus;
	
	@FindBy(how = How.XPATH, using = "//input[@name='employerInfo.employer_0']")
	@CacheLookup
	WebElement employerName;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='employerInfo.occupationAssociation_0'])[2]")
	@CacheLookup
	WebElement occupationAssociateQ1;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='employerInfo.occupationHeight_0'])[2]")
	@CacheLookup
	WebElement occupationAssociateQ2;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='employerInfo.occupationDisability_0'])[2]")
	@CacheLookup
	WebElement occupationAssociateQ3;
	
	@FindBy(how = How.XPATH, using = "//input[@name='insuredBasicInfo.job_0']")
	@CacheLookup
	WebElement occupation;
	
	@FindBy(id="generalFinancialInfo.revenue_0")
	@CacheLookup
	WebElement annualGrossIncome;
	
	@FindBy(id="generalFinancialInfo.totalActives_0")
	@CacheLookup
	WebElement totalAssets;
	
	@FindBy(id="generalFinancialInfo.totalPassive_0")
	@CacheLookup
	WebElement totalLiabilities;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='bankruptcy.history_0'])[2]")
	WebElement bankruptcy;
	
	
	public GeneralInformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void appID()
	{
		this.appID.click();
	}
	
	public void enterLastName(String lastName)
	{
		this.lastName.sendKeys(lastName);
	}
	
	public void enterFirstName(String firstName)
	{
		this.firstName.sendKeys(firstName);
	}
	
	public void selectSex(String sex)
	{
		Select sex1 = new Select(this.sex);
		sex1.selectByVisibleText(sex);
	}	
	
	public void dob(String dob)
	{
		this.DOB.sendKeys(dob);
	}
	
	public void maritalStatus(String maritalStatus)
	{
		Select maritalStatus1 = new Select(this.maritalStatus);
		maritalStatus1.selectByVisibleText(maritalStatus);
	}
	
	public void canadianCitizenY()
	{
		this.canadianCitizen.click();
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
	
	public void purposeOfInsuranceMortgage()
	{
		this.purposeOfInsuranceMortgage.click();
	}
	
	public void purposeOfInsuranceQ2No()
	{
		this.purposeOfInsuranceQ2No.click();
	}
	
	public void purposeOfInsuranceQ3No()
	{
		this.purposeOfInsuranceQ3No.click();
	}
	
	public void employmentStatus(String employmentStatus)
	{
		Select employmentStatus1 = new Select(this.employmentStatus);
		employmentStatus1.selectByVisibleText(employmentStatus);
	}
	
	public void employerName(String employerName)
	{
		this.employerName.sendKeys(employerName);
	}
	
	public void occupationAssociateQ1()
	{
		this.occupationAssociateQ1.click();
	}
	
	public void occupationAssociateQ2()
	{
		this.occupationAssociateQ2.click();
	}
	
	public void occupationAssociateQ3()
	{
		this.occupationAssociateQ3.click();
	}
	
	public void occupation(String occupation)
	{
		this.occupation.sendKeys(occupation);
	}
	
	public void annualGrossIncome(String annualGrossIncome)
	{
		this.annualGrossIncome.sendKeys(annualGrossIncome);
	}
	
	public void totalAssets(String totalAssets)
	{
		this.totalAssets.sendKeys(totalAssets);
	}
	
	public void totalLiabilities(String totalLiabilities)
	{
		this.totalLiabilities.sendKeys(totalLiabilities);
	}
	
	public void bankruptcy()
	{
		this.bankruptcy.click();
	}
	
	/*public void clear(String Option)
	{
		switch(Option)
		{
			case "firstname": 
			this.firstName.clear();
			break;
				
		}
	}*/
	
	
	
}
