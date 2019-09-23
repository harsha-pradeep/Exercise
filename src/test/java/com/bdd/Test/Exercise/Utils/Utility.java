package com.bdd.Test.Exercise.Utils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class Utility extends PageObject {

	public double getCurrencyValue(String currencyString)
	{
		String currencyValue;
		try {
				currencyValue = DecimalFormat.getCurrencyInstance(Locale.getDefault()).parse (currencyString).toString();
		} catch (ParseException e) {
			return -1;
		}

		double currencyDoubleValue  = Double.parseDouble(currencyValue);
		return currencyDoubleValue;
	}

	public List<WebElement> getWebElements(String inputId) {
		return getDriver().findElements(By.xpath("//*[starts-with(@id, '"+inputId+"')]"));
	}    
	
	public String getValuebyID(String inputId) {
		return getDriver().findElement(By.xpath("//*[@id = '"+inputId+"']")).getText();
	}
	
}
