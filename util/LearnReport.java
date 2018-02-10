package util;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	public ExtentReports extent;
	public ExtentTest test;

	@BeforeSuite
	public void startResult() {
		ExtentHtmlReporter html = new ExtentHtmlReporter(
				new File("./reports/result.html"));
		html.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(html);
	}

	@BeforeMethod
	public void startTestCase(String testcasesName,String des,String author,String category) {
		test = extent.createTest(testcasesName, des);
		test.assignAuthor(author);
		test.assignCategory(category);
	}

	public void reportSteps(String StepDesc,String status) throws IOException {
		MediaEntityModelProvider img = MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap1.jpeg").build();
		StepDesc = StepDesc+img;
		if (status.equalsIgnoreCase("PASS")) {
			test.pass(StepDesc);						
		} else if (status.equalsIgnoreCase("FAIL")) {
			test.fail(StepDesc);	
		}
	}

	@AfterSuite
	public void endResult() {
		extent.flush();
	}


	

}
