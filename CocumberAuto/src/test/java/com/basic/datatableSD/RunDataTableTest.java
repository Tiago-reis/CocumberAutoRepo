package com.basic.datatableSD;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	monochrome=true,
	
	//dryRun=true,
			
	//features={"src/test/resources/com/basic/parameterizationFF/"}, // Old
	features={"src/test/resources/com/basic/datatableFF/"},
	
	//glue={"com/basic/parameterizationSD/"}, // Old	
	glue={"com/basic/datatableSD/"},			
		
	plugin={"pretty",
			"html:target/cucumber-htmlreport",
			"json:target/cucumber-report3.json",	
			"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"

	}
		
)

public class RunDataTableTest {	
	
	
}
