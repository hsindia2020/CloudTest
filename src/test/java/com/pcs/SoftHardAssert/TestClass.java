package com.pcs.SoftHardAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	@Test
	public void Test01() {

		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get("www.google.com");
		System.out.println("Site display on screen...");
		Assert.assertEquals(true, false);
	}
}
