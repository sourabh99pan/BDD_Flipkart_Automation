package stepDefinitions;

import Base.TestBase;
import Pages.GeneralInformationPage;
import Pages.LacaptialeLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAppFields2 extends TestBase{

	LacaptialeLoginPage loginpage = new LacaptialeLoginPage(driver);
	GeneralInformationPage genPage = new GeneralInformationPage(driver);
	
	@Given("^user enters credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_on_login_page(String username, String password) throws InterruptedException {
	    System.out.println("In Given function");
	    Thread.sleep(10000);
		loginpage.enterUserName(username);

		loginpage.enterPassword(password);
		
		loginpage.clickLoginButton();

	   
	}
	@When("^user enters details \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enter_Details(String firstname, String lastname) throws InterruptedException {
		Thread.sleep(10000);
		
		genPage.appID();
		genPage.enterLastName(lastname);
		genPage.enterFirstName(firstname);
		
	}

	@Then("select sex and marital status")
	public void user_is_able_to_edit_application() {
	    // Write code here that turns the phrase above into concrete actions
		genPage.selectSex("Male");
		genPage.maritalStatus("Single");
		driver.quit();
		
	}
	
	
}
