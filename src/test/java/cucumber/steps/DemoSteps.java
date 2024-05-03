package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps {
	
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {
		System.out.println("i_want_to_write_a_step_with");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		System.out.println("this is i_verify_the_true_in_step");
	}
	

	@Then("I verify the true in step")
	public void i_verify_the_true_in_step() {
		System.out.println("this is i_verify_the_true_in_step");
	}

	@Then("I verify the fasle in step")
	public void i_verify_the_fasle_in_step() {
	   System.out.println("this is i_verify_the_fasle_in_step");
	}

}
