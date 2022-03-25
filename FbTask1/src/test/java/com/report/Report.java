package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	public static void jvmReport(String json) {
		 File FbReport = new File("C:\\Users\\Jega\\eclipse-workspace\\FbTask1\\target");
		 Configuration config = new Configuration(FbReport, "Facebook");
		 config.addClassifications("Browser", "Chrome");
		 config.addClassifications("Version", "98");
		 config.addClassifications("Platform", "Win-11");
		 
		 
		 List<String> li = new ArrayList<String>();
		 li.add(json);
		 
		 ReportBuilder builder = new ReportBuilder(li, config);
		 builder.generateReports();
		 
	}

}
