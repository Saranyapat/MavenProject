package com.TestNgexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportExamples {

public static ExtentTest test;
public static ExtentReports report;
public WebDriver driver;


@Test

public void OpenApplication()
{
    
    System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
    
     driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    report = new ExtentReports("./Reports/report.html");
    
    test = report.startTest("Launch The App");
    
    driver.get("http://the-internet.herokuapp.com/login");
    
    test.log(LogStatus.PASS, "Launching the application is success");
    
    
    
    test.log(LogStatus.FAIL, "Application has not launch");
    
    
    
    report.endTest(test);
    report.flush();
    
}
}
