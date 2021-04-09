package com.javascriptexecutor;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingMultiTab {
@Test
public void HandleTabs() {
	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/windows");
	driver.findElement(By.linkText("Click Here")).click();
	// Get the current windows handler
	String windowshandle = driver.getWindowHandle();
	// get the number of windows which are opened in the browser
	ArrayList tabs = new ArrayList(driver.getWindowHandles());
	System.out.println(tabs.size());
	// the switch control to the tab whoch we want to use is switchto()
driver.switchTo().window((String) tabs.get(1));
WebElement newPageText = driver.findElement(By.xpath("//h3[text()='New Window']"));
System.out.println(newPageText.getText());
driver.switchTo().window(windowshandle);
}

}
