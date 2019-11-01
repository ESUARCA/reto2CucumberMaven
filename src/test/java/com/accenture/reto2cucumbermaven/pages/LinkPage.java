package com.accenture.reto2cucumbermaven.pages;

import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LinkPage extends PageObject {
	@FindBy(xpath = "//a[@href='/talks/lisa_nip_how_humans_could_evolve_to_survive_in_space']")
	private WebElementFacade linkLocator;

	public void link_conference() {
		linkLocator.withTimeoutOf(5, TimeUnit.SECONDS);
		linkLocator.waitUntilVisible().click();
	}

}
