package assignmentFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddRemove {
	
	@Parameters("webURL")
	@Test
	public void Element(String webURL) throws Exception {
		
//		String projectPath = System.getProperty("user.dir");

		System.out.println("Project Running...");

		System.setProperty("webdriver.gecko.driver","E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1280,800");
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get(webURL);

		driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='added-manually']")).click();
		
		driver.close();
//		driver.quit();
		
	}
	

}
