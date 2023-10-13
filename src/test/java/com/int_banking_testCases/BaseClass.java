package com.int_banking_testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.int_banking_utility.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig =new ReadConfig();

	public String url= readconfig.getApplicationUrl();
	public String username= readconfig.getUserName();
	public String password = readconfig.getPassword();
	public String chromedriverpath=readconfig.getChromePath();
	public String firefoxdrivepath=readconfig.getFirefoxPath();

	public  WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
System.out.println("Inside baseclass");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//logger=Logger.getLogger("eBanking");
		logger=Logger.getLogger(BaseClass.class);
		PropertyConfigurator.configure("Log4j.properties");


		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver=new ChromeDriver();
		}
		else if (br.equals("firefox"))
		{
			System.out.println("befor firefox");
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver= new FirefoxDriver();
			//driver.get("https://www.youtube.com");
			System.out.println("firefox");
		}

		driver.get(url);
	}

	@AfterClass
	public void tearDown()
	{
		driver.close();	
	}

	public void captureScreen( String tcname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourse= ts.getScreenshotAs(OutputType.FILE);
		File target = new File (System.getProperty("user.dir")  +  "\\Screenshots\\" +tcname + ".png" );
		FileUtils.copyFile(sourse, target);




	}


}
