package com.testcases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pageobjects.LoginPageObjects;
import com.pageobjects.LoginPageObjectsPF;

public class LoginTestCase {
@Test
public void Login() throws IOException {
	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/login");
	/*LoginPageObjects lp = new LoginPageObjects(driver);
	
			lp.enterusername("Saranya");
			lp.enterpassword("Gowtham");*/
			
			/*LoginPageObjectsPF pf = new LoginPageObjectsPF(driver);
			pf.enterusername();
			LoginPageObjectsPF.password.sendKeys("Gowtham");*/
			FileReader file = new FileReader("./BrowserUtils/testdata.properties");
			Properties prop = new Properties();
			prop.load(file);
			System.out.println("username");
}
}
