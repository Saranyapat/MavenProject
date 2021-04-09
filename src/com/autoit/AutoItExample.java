package com.autoit;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoItExample {
@Test
public void fileupload() throws IOException {
	System.setProperty("webdriver.chrome.driver","./BrowserUtils/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/upload");
	Actions a1 = new Actions(driver);
	WebElement e1 = driver.findElement(By.id("file-upload"));
	a1.moveToElement(e1).click().perform();
	Runtime.getRuntime().exec("C:\\Java Program\\AutoIt\\file.exe");
	driver.findElement(By.id("file-submit")).click();
	
}
}
