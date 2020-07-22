package com.hrms.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features ="@target\\failed.txt",
		glue="com\\hrms\\steps",
		dryRun=false,
		monochrome = true,
		plugin = {
				"pretty",
				"html:target\\cucomberDefendReport",
				//"json:target\\cucomber.json"
		}
		
		)

public class failedRunner {

}
