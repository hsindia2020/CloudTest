package testNGtest;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplay {

	@Test
   public void func(){
		
		WebDriverManager.firefoxdriver().setup();
		/**
		 * @Harmeet
		 * Validation the Element is display on Web page with
		 * Display, Select and Enabled options.
		 */
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		boolean buttonPresence = driver.findElement(By.name("q")).isDisplayed();

		boolean buttonSelected = driver.findElement(By.name("q")).isSelected();

		boolean searchIconEnabled = driver.findElement(By.name("q")).isEnabled();

		System.out.println("button Presence "+buttonPresence);
		System.out.println("button selected "+buttonSelected);
		System.out.println("button enabled "+searchIconEnabled);
		Assert.assertEquals(true, buttonPresence);
		Assert.assertEquals(true, searchIconEnabled);
		Assert.assertNotEquals(false, searchIconEnabled);
	}

}
