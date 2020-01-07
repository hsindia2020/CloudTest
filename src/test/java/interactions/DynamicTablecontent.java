package interactions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicTablecontent {

WebDriver drive = null;
	
	@BeforeMethod
	public void beforeMeth() {

//		String projectPath = System.getProperty("user.dir");
		System.out.println("FrameWork Running...");
		System.setProperty("webdriver.gecko.driver","E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
//		options.addArguments("--headless");
//		options.addArguments("window-size=1280,800");
		drive = new FirefoxDriver(options);

	}
	
	@Test
	public void  sort() throws InterruptedException {
		
		String baseURL = "https://www.seleniumeasy.com/test/";

		drive.get(baseURL);

		drive.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Table')]")).click();

		Thread.sleep(3000);
		
		drive.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Table Data Search')]")).click();
		
		//tr[1]//td[1]
		//table[@id='task-table']//td[contains(text(),'4')]
		//table[@id='task-table']//td[contains(text(),'5')]
		//td[contains(text(),'Emily John')]
		
//		String before_xpath = "//table[@id='task-table']//td[contains(text(),'";
//		String after_xpath = "')]";
//		
//		for(int i=1; i<=5; i++) {
//			String name = drive.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
//			System.out.println(" Row Count "+name);
//			
//		}		
		
		String name = drive.findElement(By.xpath("//table[@id='task-table']/tbody[1]/tr[3]/td[3]")).getText();
		System.out.println("Test Print "+ name);
		Assert.assertEquals("Loblab Dan", name);
	}
}
