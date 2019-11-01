package com.accenture.reto2cucumbermaven.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://auth.ted.com/session/new")
public class TedPage extends PageObject {

	@FindBy(xpath = "//input[@name='username']")
	private WebElementFacade emailLocator;
	@FindBy(xpath = "//input[@class='css-1knpzs-base']")
	private WebElementFacade passwordLocator;
	@FindBy(xpath = "//a[@id= 'main-nav-search']")
	private WebElementFacade searchLocator;

	public void enter_keywords(String username, String password) {
		emailLocator.waitUntilClickable().typeAndEnter(username);
		this.passwordLocator.waitUntilClickable().typeAndEnter(password);
	}

}
