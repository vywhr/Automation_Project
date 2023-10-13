package com.int_banking_utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() 
	{
		try { File src =new File ("./Configeration/config.properties");	
		FileInputStream file =new FileInputStream(src);
		pro= new Properties();
		pro.load(file);

		}	
		catch(Exception e)
		{
			System.out.println("Exception is "+ e.getMessage());
		}

	}

	public String getApplicationUrl()
	{
		String url =pro.getProperty("url");
		return url;
	}
	public String getUserName()
	{
		String username =pro.getProperty("username");
		return username;
	}

	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}

	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromedriverpath");
		return chromepath;
	}

     public String getFirefoxPath()
     {
    	 String firefoxdriverpath=pro.getProperty("firefoxdriverpath");
    	 return firefoxdriverpath;
     }

}
