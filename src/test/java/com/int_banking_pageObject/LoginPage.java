package com.int_banking_pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (name="uid")
	WebElement username;

	@FindBy (name="password")
	WebElement password;

	@FindBy (name="btnLogin")
	WebElement loginbtn;

	public void setUserName(String uname)
	{
		username.sendKeys(uname);
	}

	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}

	public void submit()
	{
		loginbtn.click();
	}

	    /*public void enterloginDetails() throws Throwable {
		user = FileRead.readCell(exclePath, sheetName, 1, 0);
		password = FileRead.readCell(exclePath, sheetName, 1, 1);
		setUserName
		
		Utility.sendText(userName,user);
		Utility.sendText(passwd,password);
	}*/



}






