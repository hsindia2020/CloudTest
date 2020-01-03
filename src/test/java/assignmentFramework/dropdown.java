package assignmentFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropdown {

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
	public void dropD() throws Exception {
		String baseURL = "https://www.seleniumeasy.com/test/";

		drive.get(baseURL);

		drive.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();

		Thread.sleep(3000);
		
		drive.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Select Dropdown List')]")).click();
		
		WebElement month_dropdown = drive.findElement(By.xpath("//select[@id='select-demo']"));
		
		Select month_dd = new Select(month_dropdown);
		
		WebElement selected_month = month_dd.getFirstSelectedOption();
		System.out.println("Month selected is "+selected_month.getText());
		
		month_dd.selectByVisibleText("Tuesday");
		WebElement selected_month1 = month_dd.getFirstSelectedOption();
		System.out.println("Month selected is "+selected_month1.getText());
		Thread.sleep(3000);
		
		WebElement state_dropdown = drive.findElement(By.id("multi-select"));
		Select state_dd = new Select(state_dropdown);
		
		state_dd.selectByValue("Ohio");
		Thread.sleep(2000);
		state_dd.selectByValue("Florida");
		Thread.sleep(3000);
	}
	
		@AfterTest
		public void afterMeth() {

			drive.close();
		}
		
}
