package testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import commonLib.ObjectDeclaration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, monochrome = true, strict = true, features = "src/test/java/features", glue = "stepdef", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, tags = {
				"@testGoogleSearch" })

public class TestRunner extends ObjectDeclaration {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(commonUtil.getReportConfigPath()));
		driver.quit();
	}

	@BeforeClass
	public static void clearData() {
		try {

			File file = new File(System.getProperty("user.dir") + "\\InputFile\\result.txt");

			file.delete();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
