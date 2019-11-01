package com.accenture.reto2cucumbermaven.step_definitions;

import com.accenture.reto2cucumbermaven.steps.StepTed;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepsDefinitions1 {
	@Steps
	StepTed Acc;

	@Given("^I open the browser on the TED page$")
	public void i_open_the_browser_on_the_TED_page() throws Exception {
		Acc.is_the_home_page();
	}

	@Given("^I enter the credentials of (.*) with (.*)$")
	public void i_enter_the_credentials_of_esuarca_gmail_com_with_Esuarca(String username, String password)
			throws Exception {
		Acc.is_enter_credentials(username, password);

	}

	@When("^I want to search the conference (.*)$")
	public void i_want_to_search_the_conference_How_humans_could_evolve_to_survive_in_space(String conference)
			throws Exception {
		Acc.is_want_to_search_the_conference();
		Acc.is_want_to_search_the_conference(conference);
	}

	@When("^I open the conference$")
	public void i_open_the_conference() throws Exception {
		Acc.is_open_the_conference();

	}

	@When("^I reproduce the conference$")
	public void i_reproduce_the_conference() throws Exception {
		Acc.is_reproduce_the_conference();

	}

	@Then("^I open the conference correctly$")
	public void i_open_the_conference_correctly() throws Exception {
		Acc.is_open_the_conference_correctly();
	}

}
