package Test;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	Logger log = LogManager.getLogger(StepDefination.class.getName());

	@Given("^user is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		log.info("i am on landing page");
	}

	@When("^user login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_with_username_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {
		log.info(strArg1);
		log.info(strArg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		log.info("home page is populated");
	}

	@And("^card displayed \"([^\"]*)\"$")
	public void card_displayed_something(String strArg1) throws Throwable {
		log.info("cards displayed" + strArg1);
	}

	@When("^user sign up with following details$")
	public void user_sign_up_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.asLists();
		log.info(obj.get(0).get(0));
		log.info(obj.get(0).get(1));
		log.info(obj.get(0).get(2));
		log.info(obj.get(0).get(3));

	}

}
