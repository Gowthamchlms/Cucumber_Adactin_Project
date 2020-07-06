package com.stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String json) {
		File location = new File("target\\JvmReport");
		Configuration con = new Configuration(location, "Adactin ticket booking");
		con.addClassifications("platform", "windows");
		con.addClassifications("Browser", "Chrome Browser");
		List<String> li = new ArrayList<String>();
		li.add(json);
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
	}
	
}
