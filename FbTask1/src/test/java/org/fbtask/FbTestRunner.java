package org.fbtask;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\Jega\\eclipse-workspace\\FbTask1\\src\\test\\resources\\FB.feature" }, 
			glue = {"org.fbstepdef" },
			monochrome = true, 
			dryRun= false, 
			plugin= {"pretty","json:Cucumber\\target\\Fb.json"})

public class FbTestRunner {
	
	@AfterClass
	public static void afterClass() {
		Report.jvmReport("Cucumber\\target\\Fb.json");
		

	}

}
