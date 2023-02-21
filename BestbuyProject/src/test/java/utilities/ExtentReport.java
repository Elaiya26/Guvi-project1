package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReport {
	public static ExtentReports getExtentReport() {
		String extentReportPath = System.getProperty("user.dir")+"\\exreport\\extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("Bestbuy Automation Result");
		reporter.config().setDocumentTitle("Bestbuy Automation Test Result");
		
		ExtentReports extentReport = new ExtentReports();
		extentReport .attachReporter(reporter);
		
		return extentReport ;
		
		
	}

}
