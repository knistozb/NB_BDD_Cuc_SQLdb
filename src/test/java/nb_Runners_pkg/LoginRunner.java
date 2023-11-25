
// On Saturday, July 30, 2023, BDD class 3, sess 3 with MS Islam 

package nb_Runners_pkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
//		features = "src/test/resources/nb_Features_pkg/TechfiosLogin.feature",
//		features = "src/test/resources/nb_Features_pkg",
		features = "classpath:nb_Features_pkg",

		glue = "nb_Steps_pkg",    // you have to mention the pkg which has the glue attached to: 
					// so LoginStepDefinition has it & that belongs to nb_steps_pkg pkg
//		tags = {"@LoginScenario1 or @NegativeScenario2"},   // this will work as well, but only pick either or which is not so best option
		tags = "@DbLoginScenario1",
		monochrome = true,
		dryRun = false,
		plugin = {      // this is to what kind of report I want to generate
				"pretty",
				"html:target/reports/cucumber.html",
				"json:target/reports/cucumber.json",

		}	
		)

public class LoginRunner {
	
	
}
