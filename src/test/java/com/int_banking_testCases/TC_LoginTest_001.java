package com.int_banking_testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.int_banking_pageObject.LoginPage;
@Listeners(com.int_banking_utility.Util.class)
public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() throws IOException
	{
		System.out.println(" inside test");
		logger.info("url is fetched");
		LoginPage lp =new LoginPage(driver);
		
		lp.setUserName(username);
		
		
		logger.info("username is passed");
		
		lp.setPassword(password);
		logger.info("password is passed");
		
		lp.submit();
		logger.info("login button is clicked");
       
		  System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("GTP Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Test is passed");
		}
		else
		     Assert.assertTrue(false);
            
              logger.info("Test is Failed");
            //  captureScreen(driver , "TC_LoginTest_001");
		}

	}





