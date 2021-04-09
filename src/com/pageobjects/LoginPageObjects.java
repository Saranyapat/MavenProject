package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {
	WebDriver driver;
	By Usernamefiled = By.name("username");
	By Passworfield = By.id("password");
	public LoginPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
public void enterusername(String usernamevalue) {
	driver.findElement(Usernamefiled);
}
public void enterpassword(String passwordvalue) {
	driver.findElement(Passworfield);
}
}
