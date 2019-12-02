package com.basic.datadrivenSD;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	monochrome=true,
	
	//dryRun=true,
			
	//features={"src/test/resources/com/basic/parameterizationFF/"}, // Old
	features={"src/test/resources/com/basic/datadrivenFF/"},
	
	//glue={"com/basic/parameterizationSD/"}, // Old	
	glue={"com/basic/datadrivenSD/"},			
		
	plugin={"pretty",
			"html:target/cucumber-htmlreport",
			"json:target/cucumber-report2.json",			
	}
		
)

public class datadrivenTest {	
	
	
}
