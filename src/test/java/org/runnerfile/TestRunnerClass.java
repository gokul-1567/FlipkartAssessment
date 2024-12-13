package org.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", 
                 glue="org.step", 
                 monochrome=true,
                 dryRun=false,
                 plugin= {"html:target\\HTML", "junit:target\\JUNIT\\JunitReport.xml"})
public class TestRunnerClass {

	
	
} 
