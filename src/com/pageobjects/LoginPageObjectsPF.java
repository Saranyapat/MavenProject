package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectsPF {
WebDriver driver;
@FindBy(name = "username")
public WebElement userid;

@FindBy(name = "password")
public static WebElement password;
public LoginPageObjectsPF(WebDriver driver)
{
	this.driver = driver;	
}
public void enterusername() {
	userid.sendKeys("Hi");
}
public void enterpassword() {
	password.sendKeys("Gowtham");
}
}
