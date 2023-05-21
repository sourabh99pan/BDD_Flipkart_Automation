package stepDefinitions;

import Base.TestBase;
import Pages.GeneralInformationPage;
import Pages.LacaptialeLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class EditAppSteps extends TestBase{
	
	LacaptialeLoginPage loginpage = new LacaptialeLoginPage(driver);
	GeneralInformationPage genPage = new GeneralInformationPage(driver);
	
	@Given("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_on_the_login_page(String username, String password) throws InterruptedException {
	    System.out.println("In Given function");
	    Thread.sleep(10000);
		loginpage.enterUserName(username);

		loginpage.enterPassword(password);
		
		loginpage.clickLoginButton();

	   
	}
	@When("^user enters info \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enter_app_Details(String firstname, String lastname) throws InterruptedException {
		Thread.sleep(10000);
		
		System.out.println("user_Enter_app_Details function");
		genPage.appID();
		Thread.sleep(10000);
		System.out.println(driver.getTitle()); //La Capitale
		genPage.enterLastName(lastname);
		genPage.enterFirstName(firstname);
		Thread.sleep(5000);
		
	}

	@Then("user is able to Edit Application")
	public void user_is_able_to_edit_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

}
