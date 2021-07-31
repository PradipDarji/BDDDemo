package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "E://EclipseProjects//CucumberBDDDemo//Features//Login.feature", glue = "stepDefination")
public class TestRunner {

}
