package com.int_banking_utility;

import org.openqa.selenium.WebElement;

public class Utils {

	
	
	public static void enterText(WebElement element, String text) {
		
		element.clear();
		element.sendKeys(text);
		
		
	}
	
}
