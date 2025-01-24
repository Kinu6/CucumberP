package RunnerIO;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		glue = "StepDefinitions",
		monochrome = false,
		features =".\\\\src\\\\test\\\\java\\\\FeatureFIles\\\\SC01.feature",
		dryRun = true
		
		)

public class RunerIO extends AbstractTestNGCucumberTests{

}
