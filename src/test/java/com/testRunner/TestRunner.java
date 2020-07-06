package com.testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.stepDefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"}, glue = {"com.stepDefinition"}, dryRun = false, 
monochrome = true, tags = {"@Smoke , @TicketGeneration"}, strict = false, plugin = {"html:target", "json:target/JsonReport.json",
																	"rerun:target/Failed_Scripts.txt"})
public class TestRunner {

	@AfterClass
	public static void Report() {
		JvmReport.generateJvmReport("target/JsonReport.json");

	}
	
}
