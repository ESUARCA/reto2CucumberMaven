package com.accenture.reto2cucumbermaven.steps;

import com.accenture.reto2cucumbermaven.pages.LinkPage;

import com.accenture.reto2cucumbermaven.pages.ReproducePage;
import com.accenture.reto2cucumbermaven.pages.SearchPage;
import com.accenture.reto2cucumbermaven.pages.TedPage;
import com.accenture.reto2cucumbermaven.pages.ValidateConference;

import net.thucydides.core.annotations.Step;

public class StepTed {
	TedPage ted;
	SearchPage search;
	LinkPage link;
	ReproducePage play;
	ValidateConference validate;

	@Step
	public void is_the_home_page() {
		ted.open();
	}

	@Step
	public void is_enter_credentials(String username, String password) {
		ted.enter_keywords(username, password);
	}

	@Step
	public void is_want_to_search_the_conference() {
		search.search_box();
	}

	@Step
	public void is_want_to_search_the_conference(String conference) {
		search.enter_nameconference(conference);
	}

	@Step
	public void is_open_the_conference() {
		link.link_conference();
	}

	@Step
	public void is_reproduce_the_conference() {
		play.reproduce_conference();

	}

	@Step
	public void is_open_the_conference_correctly() {
		validate.validate_profession();
	}

}
