package com.report;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	WebDriver driver;
	@Before
	public void beforeClass() {
		System.out.println("before excecution");
	}
	
	@After
	public void afterClass(Scenario s) {
		System.out.println("after excecution");
		if(s.isFailed()) {
			byte[] ts= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.embed(ts, "img.png");			
		}
	}
	

}
