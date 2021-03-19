package com.facebook.seleniumTesting;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uiTest 
{

    @Test
    public void login()
    {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramdsing\\eclipse-workspace\\systemTesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.strava.com/");
		// comment added to test

		
    }
}
