package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

	@When("user enter {string} and {string}")
	public void user_enter_valid_and(String username, String password) {
		sendText(loginPage.usernameBox, username);
		sendText(loginPage.usernameBox, password);
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() {
		click(loginPage.loginButton);
	}
	
	@Then("{string} is successfully logged in")
	public void is_successfully_logged_in(String string) {

	}
	
	@Then("user see {string}")
	public void user_see(String errorMessage) {
		Assert.assertEquals("Not correct error message is displayed", errorMessage, loginPage.errorMsg.getText());;
	}

	@Given("user is logged in with admin credentials")
	public void user_is_logged_in_with_admin_credentials() {
		loginPage.login(ConfigReader.getPropertyValue("username"), ConfigReader.getPropertyValue("password"));
	}
}
