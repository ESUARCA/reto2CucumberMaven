package com.accenture.reto2cucumbermaven.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features",
		tags = {"@exitoso"},//corregir feature
		glue = {"com.accenture.reto2cucumbermaven.step_definitions"},
		snippets = SnippetType.UNDERSCORE,
		monochrome = true,
		dryRun = false,
		plugin = {"json:reporteJson/cucumber.json"}
		)
public class Runner {

}
