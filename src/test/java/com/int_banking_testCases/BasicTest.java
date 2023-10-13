package com.int_banking_testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest extends BaseClass{
      @Test
	public void   basicTest() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shind\\eclipse-workspace\\Selenium_Automation_Project_By_Vishal\\Drivers\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.guru99.com/V1/index.php");
	           
		String actualTitle =driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.equals("demo"))
		{
			Assert.assertFalse(true);	
		}
		else
		{
              Assert.assertFalse(false);
		}//

		
		
		
		
	}

}
