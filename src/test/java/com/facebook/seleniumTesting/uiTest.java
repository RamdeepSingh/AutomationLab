package com.facebook.seleniumTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class uiTest {

	@Test
	public void loginFailureTest() throws MalformedURLException {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");
		WebDriver driver = new RemoteWebDriver(new URL(
				"https://ramdeepmansa:b4ea589c-4bf5-43cd-9a55-344663c832c4@ondemand.us-west-1.saucelabs.com:443/wd/hub"),
				caps);
		driver.manage().window().maximize();
		
		//LOGGING IN USING WRONG CREDENTIALS AND TESTING ALERT
		try {
		driver.get("https://www.strava.com/");
		driver.findElement(By.cssSelector("a.btn.btn-default.btn-login")).click();
		driver.findElement(By.cssSelector("input#email")).sendKeys("ramdeepmansa@gmail.com");
		driver.findElement(By.cssSelector("input[type^='passw']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@class='alert-message']")).getText().contains("Please try again."));
		driver.close();
		}
		catch (Exception e) {
			Assert.assertFalse(true);
		}
		
	}
}
