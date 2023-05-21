package stepDefinitions;

import Base.TestBase;
import Pages.ContractPolicyHoldersPage;
import Pages.GeneralInformationPage;
import Pages.LacaptialeLoginPage;
import Pages.PaymentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContractSteps extends TestBase{
	
	LacaptialeLoginPage loginpage = new LacaptialeLoginPage(driver);
	ContractPolicyHoldersPage contractpage = new ContractPolicyHoldersPage(driver);
	PaymentPage payment = new PaymentPage(driver);
	
	@Given("^Contract user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_on_login_page_contract(String username, String password) throws InterruptedException {
	    System.out.println("In Given function");
	    Thread.sleep(8000);
		loginpage.enterUserName(username);

		loginpage.enterPassword(password);
		
		loginpage.clickLoginButton();
		
		Thread.sleep(8000);

	   
	}

	@When("user enters language and policyholder")
	public void user_is_able_to_edit_application_contract() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(8000);
		contractpage.appID();
		Thread.sleep(8000);
		contractpage.contractClick();
		contractpage.languageSelect();
		Thread.sleep(8000);
		//contractpage.selectPolicyHolder("Other");
	}
	
	@Then("^user enters contract info \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enters_contract_info(String firstname, String lastname) throws InterruptedException {
		
		contractpage.enterLastName(lastname);
		contractpage.enterFirstName(firstname);
		//contractpage.clear("dob");
		//contractpage.dob("19920202");
	}
	
	@Then("^user enters maritalStatus \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_Gender_maritalStatus(String gender,String dob) throws InterruptedException {
		
		

		//contractpage.selectGender(gender);
		//contractpage.dob(dob);
		//contractpage.maritalStatus("Single");
		Thread.sleep(10000);
		
	}
	
	@Then("^user select address \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_profession_address_city(String city, String profession) throws InterruptedException {
		
		

		contractpage.enterProfession(profession);
		contractpage.address("2514 Merton Street");
		contractpage.city(city);
		
	}
	
	@Then("^user select province \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_province(String postalCode, String telephone) throws InterruptedException {
		
		//contractpage.province("Alberta");
		contractpage.postalCode(postalCode);
		//contractpage.telephoneType("Cellular");
		contractpage.telephone(telephone);
		contractpage.enterSin("741787683");
		contractpage.clickPayment();
		Thread.sleep(8000);
	}
	
	@Then("^user enter branch number \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_branch_number(String FisNum, String AccNum) throws InterruptedException {
		
		payment.branchNumber("11234");
		payment.finInsNumber(FisNum);
		payment.accountNumber(AccNum);
		Thread.sleep(5000);
		driver.quit();
	}
	
}