package com.pcs.SoftHardAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardTest {

	@Test
	private void Test() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("www.hub.docker.com");

	}
}
