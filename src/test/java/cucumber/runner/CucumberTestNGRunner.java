package cucumber.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features/", glue = {"cucumber.steps", "cucumber.base"}, tags="@login")
//@CucumberOptions(features = "src/test/resources/Features/", glue = {"cucumber.runner"}, tags="@login")
public class CucumberTestNGRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
 
 