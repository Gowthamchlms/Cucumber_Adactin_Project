package com.testRunner;

import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"@target/Failed_Scripts.txt"}, glue = {"com.stepDefinition"}, plugin = {"html:target"})
public class TestRerunner {
	
}
