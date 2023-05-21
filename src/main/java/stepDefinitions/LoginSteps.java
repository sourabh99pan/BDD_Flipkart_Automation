package stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import Pages.LacaptialeLoginPage;
public class LoginSteps extends TestBase {
	
	//WebDriver driver ;

	LacaptialeLoginPage loginpage = new LacaptialeLoginPage(driver);
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	    System.out.println("In Given function");
	    Thread.sleep(10000);

	   
	}

	@When("user enters username and password")
	public void user_enters_username_and_password(DataTable testData) throws Throwable {
		System.out.println("In When function");
		//loginpage.enterUserName("dev@breathelife.com");
		Map<String, String> data = testData.asMap(String.class,String.class);
		
		loginpage.enterUserName(data.get("username"));

		loginpage.enterPassword(data.get("password"));
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("In And function");
		loginpage.clickLoginButton();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		
		System.out.println("In Then function");
		
		//WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(120, 10));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='New application']")));
		Thread.sleep(10000);
		loginpage.isDisplayed();
		//driver.close();
	}

}
