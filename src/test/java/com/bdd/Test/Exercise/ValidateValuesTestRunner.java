package com.bdd.Test.Exercise;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:features/Exercise/ValidateValuesOnPage.feature",
							glue = "com.bdd.Test.Exercise")

public class ValidateValuesTestRunner {

}
