package assignmentFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class App 
{
	@Test
    public void AppRun() throws Exception
    {
    	String projectPath = System.getProperty("user.dir");

		System.out.println("Project path "+projectPath);

		System.setProperty("webdriver.gecko.driver","E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		String baseURL = "http://the-internet.herokuapp.com/";
		
		driver.get(baseURL);

		driver.findElement(By.xpath("//a[contains(text(),'A/B Testing')]")).click();
		
		Thread.sleep(3000);
		
		driver.close();
//		driver.quit();
    }
}
