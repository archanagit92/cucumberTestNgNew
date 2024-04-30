package cucumber.steps;

import java.util.List;
import java.util.Map;


import cucumber.pages.loginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	loginPage loginpage = new loginPage();

	@Given("User enter the application url")
	public void user_enter_the_application_url() {
		loginpage.enterUrl();
	}

	@When("User enters UserName and click on continue button")
	public void user_enters_archana_patil_walmart_com_and_click_on_continue_button(DataTable dataTable) {
		List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : userlist) {
			loginpage.enterUsername(data.get("UserName"));
		}
		loginpage.clickContinue();
	}

	@Then("User Enters password")
	public void user_enters_welcome(DataTable dataTable) {

		List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> data : userlist) {

			loginpage.enterPassword(data.get("password"));
		}

	}

	@Then("User click on Submit button")
	public void user_click_on_submit_button() {
		loginpage.clickSubmit();

	}

	@When("User enters {string} and click on continue")
	public void user_enters_and_click_on_continue(String useranme) {

		loginpage.enterUsername(useranme);

		loginpage.clickContinue();
	}

	@When("User enters {string} and password click on continue")
	public void user_enters_and_password_click_on_continue(String useranme, DataTable dataTable) {

		List<Map<String, String>> userlist = dataTable.asMaps();
		loginpage.enterUsername(useranme);
		
		loginpage.clickContinue();
		for (Map<String, String> data : userlist) {
			loginpage.enterPassword(data.get("password"));

		}

	}

}
