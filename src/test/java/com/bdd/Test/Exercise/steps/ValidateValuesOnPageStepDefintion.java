package com.bdd.Test.Exercise.steps;

import org.openqa.selenium.WebDriver;

import com.bdd.Test.Exercise.steps.serenity.NavigatingUser;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import net.thucydides.core.annotations.Managed;

public class ValidateValuesOnPageStepDefintion {
	
	NavigatingUser navigator = new NavigatingUser();
	
	@Managed
	public WebDriver driver;
	
	@Given("^user is on the Page$")
	public void user_is_on_the_Page() {
		navigator.isOnExercisePage();
	}
	
	@When("^the values are displayed$")
	public void the_values_are_displayed() throws InterruptedException {
		navigator.getAllInfo();
	}
	
	@Then("^the right \"([^\"]*)\" of values appear on the screen$") 
	public void the_right_count_of_values_appear_on_the_screen(int expectedCount) {
		Assert.assertEquals(expectedCount, navigator.countWebValues());
	}

	@And("^the values on the screen are greater than \"([^\"]*)\"$")
	public void values_are_greater_than(int passedValue) {
		Assert.assertTrue(navigator.validateGreaterThan(passedValue));
	}
	
	@And("^the total balance is correct based on the values listed on the screen$")
	public void isTotalValid() {
		Assert.assertTrue(navigator.isSumValid());
	}
	
	@And("^the values are formatted as currencies$")
	public void isCurrencyFormatted() {
		Assert.assertTrue(navigator.validateCurrencyFormatting());
	}
	
	@And("^the total balance matches the the sum of values$")
	public void isTotalBalancematching() {
		Assert.assertTrue(navigator.isSumValid());
	}
	
	
}
