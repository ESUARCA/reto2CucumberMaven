package com.accenture.reto2cucumbermaven.pages;

import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ReproducePage extends PageObject {
	@FindBy(xpath = "//*[@id='plyr-play']")
	private WebElementFacade reproduceLocator;

	public void reproduce_conference() {
		reproduceLocator.withTimeoutOf(5, TimeUnit.SECONDS);
		reproduceLocator.waitUntilVisible().click();

	}
}
