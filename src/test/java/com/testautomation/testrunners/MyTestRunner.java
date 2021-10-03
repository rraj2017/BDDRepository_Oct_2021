package com.testautomation.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeatures"},
                glue = {"com.testautomation.stepdefinitions","com.testautomation.apphooks"},
                //tags = "@All",
                plugin = {"pretty",
                		"json:target/MyReports/report.json",
                		 "junit:target/MyReports/report.xml"
                		},
                monochrome = true ,
                dryRun = false
)
public class MyTestRunner {

}
