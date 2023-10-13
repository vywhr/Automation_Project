package com.int_banking_utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.int_banking_testCases.BaseClass;

public class Util extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("test failure");
		try {
			captureScreen(result.getMethod().getMethodName());
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}



