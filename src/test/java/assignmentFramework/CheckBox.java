package assignmentFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class CheckBox {

	@Test
	public void Check() throws Exception {
		
//		String projectPath = System.getProperty("user.dir");

		System.out.println("Project Running...");

		System.setProperty("webdriver.gecko.driver","E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1280,800");
		WebDriver driver = new FirefoxDriver(options);

		String baseURL = "https://www.seleniumeasy.com/test/basic-checkbox-demo.html";
		
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='check1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='check1']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}
