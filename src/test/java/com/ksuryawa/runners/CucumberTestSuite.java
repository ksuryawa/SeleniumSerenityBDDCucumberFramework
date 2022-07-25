package com.ksuryawa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author Kapil Suryawanshi
 * 25/07/2022
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty"},
		features = "src/test/resources/features",
		glue = "com.ksuryawa.stepdefinitions"
)
public class CucumberTestSuite {
}