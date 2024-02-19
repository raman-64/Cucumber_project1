package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("This is nebanking landing page Method");
	}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		System.out.println("home_page_is_displayed Method");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("cards_are_displayed n Method");
	}

/*	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String userName, String password) {
				System.out.println("Usernma " + userName + " and passwird is " + password);

	}
*/
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password1(String userName, String password) {
		System.out.println("Usernma " + userName + " and passwird is " + password);

	}
}
