package com.hrms.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features ="src\\test\\resources\\features",
		glue="com\\hrms\\API\\steps",
		dryRun=false,
		monochrome = true,
		strict=true,
		tags="@workflow",
		plugin = {
				"pretty",
				"html:target\\cucomberDefendReport",
				"json:target\\cucomber.json"
				
			//	,"return: \\target\\failed.txt"
				
		}
		
		)

public class APIRunner {
}
