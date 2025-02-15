package com.basic.backgroundSD;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	monochrome=true,
	
	//dryRun=true,
			
	//features={"src/test/resources/com/basic/parameterizationFF/"}, // Old
	features={"src/test/resources/com/basic/backgroundFF/"},
	
	//glue={"com/basic/parameterizationSD/"}, // Old	
	glue={"com/basic/backgroundSD/"},			
		
	plugin={"pretty",
			"html:target/cucumber-htmlreport",
			"json:target/cucumber-report.json",	
			"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"

	}
		
)

public class RunBackgroundTest {	
	
	
}
