package com.stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utilityMethods.UtilityClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends UtilityClass {

	@Before
	public void beforeExecution() {
		System.out.println("Execution strats from @Before annotation ");
	}
	
	@Before ("@TicketGeneration")
	public void ticketGeneration() {
		implicitWait(15);

	}
	@After
	public void afterExecution(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot screen = (TakesScreenshot) driver;
			byte[] snaps = screen.getScreenshotAs(OutputType.BYTES);
			scenario.embed(snaps, "image/png");
		}

	}
	
}
