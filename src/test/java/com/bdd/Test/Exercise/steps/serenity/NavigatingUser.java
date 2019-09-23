package com.bdd.Test.Exercise.steps.serenity;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.bdd.Test.Exercise.pages.ExercisePage;
import com.bdd.Test.Exercise.Utils.Utility;


public class NavigatingUser {

	ExercisePage 		exercisePage 	= new ExercisePage();
	Utility      		util 			= new Utility();
	List<WebElement> 	currencyValues;
	
	public void isOnExercisePage() {
		exercisePage.open();
	}
	
	public void getAllInfo() {
		 String currencyID = "txt_val";
		 currencyValues = util.getWebElements(currencyID);
	}
	
	public int countWebValues() {
		return currencyValues.size();
	}

	public boolean validateGreaterThan(int passedValue) {
		boolean isGreaterthan = true;
		for (WebElement currencyElement: currencyValues) {
			double currencyValue = util.getCurrencyValue(currencyElement.getText());
			isGreaterthan = isGreaterthan && (currencyValue > passedValue);
		}
		return isGreaterthan;
	}
	
	public boolean validateCurrencyFormatting() {
		boolean isCurrencyFormatValid = true;
		for (WebElement currencyElement: currencyValues) {
			double currencyValue = util.getCurrencyValue(currencyElement.getText());
			isCurrencyFormatValid = isCurrencyFormatValid && (currencyValue >= 0);
		}
		return isCurrencyFormatValid;
	}
	
	public boolean isSumValid() {
		boolean isTotalCorrect = true;
		double actualtotalValue = 0;
		String totalValueId = "txt_ttl_val";
		double expectedtotalValue = util.getCurrencyValue(util.getValuebyID(totalValueId));
		for (WebElement currencyElement: currencyValues) {
			actualtotalValue = actualtotalValue + util.getCurrencyValue(currencyElement.getText());
		}
		isTotalCorrect = (expectedtotalValue == actualtotalValue);
		return isTotalCorrect;
	}

	
}
