package assignmentFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BasicAuth {
	
	@Test
	public void Auth() throws Exception {
		
		String filelocation = "E:\\git\\SeleniumJava\\Assign\\Assignment\\Auth.exe";
		
		String projectPath = System.getProperty("user.dir");

		System.out.println("Project path "+projectPath);

		System.setProperty("webdriver.gecko.driver","E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		String baseURL = "http://the-internet.herokuapp.com/";
		
		driver.get(baseURL);

		driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]")).click();
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();

		String altMsg = alt.getText();
		
		System.out.println("alert message is "+altMsg);
		Thread.sleep(3000);

		Runtime.getRuntime().exec(filelocation);
		Thread.sleep(9000);
		
//		alt.accept();
//		alt.dismiss();
		
		driver.close();
//		driver.quit();
		
	}

}
