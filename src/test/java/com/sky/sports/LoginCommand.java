package com.sky.sports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginCommand extends SkyPage
{
	private String username;
	private String password;
		
	public LoginCommand(String username)
	{
		this.username = username;
	}
	
	public LoginCommand WithPassword(String password)
	{
		this.password = password;
		return this;
	}
	
	public void Login()
	{
		clickLinkByHref("signin");
		WebElement loginInput = driver.findElement(By.id("username"));
		loginInput.sendKeys(username);
		WebElement passwordInput = driver.findElement(By.id("password"));
		passwordInput.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.id("signinButton"));
		loginButton.click();
	}
	
}
