package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Below code connects feature files with StepDefinition files
//uses pretty plugin to generate HTML reports
	@CucumberOptions(tags="",features= {"src/test/resources/Features"}, 
	glue= {"StepDefinitions"}, 
	plugin={"pretty","html:target/htmlreport.html"})

	
public class BDDTestRunner extends AbstractTestNGCucumberTests {

}