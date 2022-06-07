package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	//ExterntSparkReporter
	//ExtentReports
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		String path="C:\\Users\\Dell\\eclipse-workspace\\DSS_BatchFramework_Feb\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("DSS Test Report");
		reporter.config().setReportName("Automation Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Test");
		extent.setSystemInfo("Module Name", "Test Login ");
		extent.setSystemInfo("QA", "ABC");
		return extent;
		
	}
}
