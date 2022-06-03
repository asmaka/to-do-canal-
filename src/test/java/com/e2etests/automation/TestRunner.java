 package com.e2etests.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/spec/features"},
		plugin={"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
		//glue= {""},
		tags= ("@aleatoire"),
		snippets=CAMELCASE,
		monochrome=true
		)
public class TestRunner {
//@AfterClass
//public static void writeEtentReport() {
//	Reporter.lo
	//, "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
//}
}
