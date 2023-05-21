package stepDefinitions;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests; 
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/contract.feature",
glue= {"stepDefinitions"},
monochrome=true,
plugin= {"json:target/MyReports/Cucumber_report.json","junit:target/MyReports/Cucumber_report.xml","html:target/MyReports/CucumberHtmlReport.html"},
dryRun = false,
publish=true)

public class TestRunner extends AbstractTestNGCucumberTests{
	public TestNGCucumberRunner testNGCucumberRunner;
	
    @BeforeClass(alwaysRun = true)
    public void setUpCucumber() {
         testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

    }
}
