package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login/Login.feature"},
glue= {"stepDefination"},
dryRun=false,
monochrome=true,	 //to make to console output in better format
strict=true,
plugin= {"html:testoutput/sunil.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
)
public class Runner {

}
