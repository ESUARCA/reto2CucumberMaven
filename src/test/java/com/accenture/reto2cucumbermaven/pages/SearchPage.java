package com.accenture.reto2cucumbermaven.pages;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends PageObject {
	@FindBy(xpath = "//a[@id= 'main-nav-search']")
	private WebElementFacade searchLocator;
	@FindBy(xpath = "//input[@title='Press Enter to begin search']")
	private WebElementFacade searchConference;

	public void search_box() {
		searchLocator.withTimeoutOf(5, TimeUnit.SECONDS);
		searchLocator.waitUntilVisible().click();
	}

	public void enter_nameconference(String conference) {
		searchConference.waitUntilClickable().typeAndEnter(conference);
	}

}
