package assignmentFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class radioBtn {

	WebDriver drive = null;

	@BeforeMethod
	public void beforeMeth() {

//		String projectPath = System.getProperty("user.dir");
		System.out.println("FrameWork Running...");
		System.setProperty("webdriver.gecko.driver","E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1280,800");
		drive = new FirefoxDriver(options);

	}

	@Test
	public void radio() throws Exception {
		String baseURL = "https://www.seleniumeasy.com/test/";

		drive.get(baseURL);

		drive.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();

		Thread.sleep(3000);
		
		drive.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Radio Buttons Demo')]")).click();
		drive.findElement(By.xpath("//body/div/div/div/div/div/label[contains(text(),'Female')]/input[1]")).click();
		drive.findElement(By.xpath("//button[@id='buttoncheck']")).click();
		Thread.sleep(3000);
		
		drive.findElement(By.xpath("//html//body//div//div//div//div//div//div//label[contains(text(),'Male')]//input")).click();
		drive.findElement(By.xpath("//label[contains(text(),'15 to 50')]")).click();
		drive.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();
		Thread.sleep(3000);

	}

	@AfterTest
	public void afterMeth() {

		drive.close();
	}
}
