package com.accenture.reto2cucumbermaven.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidateConference extends PageObject {

	@FindBy(xpath = "//*[@class=' d:b d:i@md c:gray-d f:.9 ']")
	private WebElementFacade professionLocator;

	public void validate_profession() {
		if (professionLocator.getText().equals("Synthetic biologist")) {
			System.out.println("Validation: Conference found");
		}
	}

}
