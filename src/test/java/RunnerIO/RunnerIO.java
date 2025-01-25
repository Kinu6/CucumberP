package RunnerIO;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		glue = "StepDefinitions", //Only Class Name
		dryRun = false,
		features = {"./src/test/java/FeatureFIles/TC03.feature"},
		monochrome = true, //Improves console readability
		plugin= {"pretty"} //To configure how the test results are reported
		)
public class RunnerIO extends AbstractTestNGCucumberTests{

}
