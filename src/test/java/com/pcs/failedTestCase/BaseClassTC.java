package com.pcs.failedTestCase;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTC {

	public static WebDriver driver;
	
	public void func() {
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();

		driver.get("https://www.seleniumeasy.com/test/");
	}
	
	public static void failedtc() throws Exception {
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("E:/git/framework/Screenshots/testFailed.jpg"));
	}
}
