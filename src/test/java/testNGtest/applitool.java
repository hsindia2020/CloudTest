package testNGtest;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.net.URISyntaxException;

public class applitool {

	public static void main(String[] args) throws URISyntaxException, 
	InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		// Use your own api key, make sure you use it in all your tests.
		Eyes eyes = new Eyes();
		eyes.setApiKey("JbvqlaRKi323WU9mrMlgkyeRM9B1CcVcfarMzfhVang110");

		try {
			// Start visual testing with browser viewport set to 1024x768.
			// Make sure to use the returned driver from this point on.
			driver = eyes.open(driver, "Applitools", "Test Web Page", new 
					RectangleSize(1024, 768));

			driver.get("https://applitools.com/helloworld");

			// Visual validation point #1
			eyes.checkWindow("Hello!");

			driver.findElement(By.tagName("button")).click();

			// Visual validation point #2
			eyes.checkWindow("Click!");

			// End visual testing. Validate visual correctness.
			eyes.close();

		} finally {
			// Abort test in case of an unexpected error.
			eyes.abortIfNotClosed();
			driver.quit();
		}
	}
}

