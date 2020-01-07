package interactions;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FireFoxGridTC {

	@Test
	public void DemoTC() throws MalformedURLException, InterruptedException {
		
		Logger logg = LogManager.getLogger(FireFoxGridTC.class);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName(BrowserType.FIREFOX);
		
		WebDriver Driver = new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"),cap);
			
		Driver.get("https://www.seleniumeasy.com/test/");
		System.out.println("Title of windows "+Driver.getTitle());
		Driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Table')]")).click();
		Thread.sleep(6000);
		logg.info("THis is the Information MSG!!!");
		Assert.assertTrue(true);
			
		Driver.quit();
	}
}
