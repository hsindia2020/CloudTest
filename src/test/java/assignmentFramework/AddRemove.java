package assignmentFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddRemove {
	
	@Parameters("webURL")
	@Test
	public void Element(String webURL) throws Exception {
		
//		String projectPath = System.getProperty("user.dir");

		System.out.println("Project Running...");

		System.setProperty("webdriver.gecko.driver","E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

//		String baseURL = "http://the-internet.herokuapp.com/";
		
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
