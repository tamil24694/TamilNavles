package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions 
( features = {"src\\test\\resources\\Features\\Axis.feature"}
,glue="step.org"
			
		)

public class Runner {

}
