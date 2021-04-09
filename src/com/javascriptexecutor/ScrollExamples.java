package com.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollExamples {
	@Test
	public void ScrollPage() {
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");// this will vertically scroll down the page by 500 pixels
		js.executeScript("window.scrollBy(0,-200)");// this will vertically scroll up have to provide y negative
		
	}
}
