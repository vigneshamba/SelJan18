package util;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BasicReport {
	public void learnReport() throws IOException {
		//Create an Html Report
		ExtentHtmlReporter html = new ExtentHtmlReporter(
				new File("./reports/result.html"));
		//Append New Report with Existing
		html.setAppendExisting(true);
		//Create ExtentReports to build reports
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		//Creates a test with description
		ExtentTest test = extent.createTest("TC002_MergeLead", "Merge two new Lead");
		test.assignAuthor("Sarath");
		test.assignCategory("Smoke");
		//Test Case steps
		test.pass("DemoSalesManager Entered Successfully", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap1.jpeg").build());	

		test.pass("crmsfa Entered Successfully"
				+test.addScreenCaptureFromPath("./../snaps/snap1.jpeg"));		
		test.fail("Click Login Button Successfully"
				+test.addScreenCaptureFromPath("./../snaps/snap1.jpeg"));		
		//extent.setAnalysisStrategy(AnalysisStrategy.TEST);
		//Writes test information to the started reporters and flush
		extent.flush();






	}

}
