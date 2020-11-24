package assignmentFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioBtn {

	public WebDriver drive = null;


	@BeforeMethod
	public void beforeMeth() {
		// String projectPath = System.getProperty("user.dir");
		System.out.println("FrameWork Running...");
//	  System.setProperty("webdriver.gecko.driver",
//	  "E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe"
//  );
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1280,800");
		drive = new FirefoxDriver(options);

	}

	@Test
	public void radio() throws Exception {

		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("E:\\git\\framework\\extentReports.html");
		//create ExtentReports and attach reporter(s)
		ExtentReports extents = new ExtentReports();
		extents.attachReporter(htmlreporter);
		//create a toggle for the given test, adds all the log events under it.
		ExtentTest test1 = extents.createTest("Radio Button Selection Testing ...","Radio Button Test Case");
		ExtentTest test2 = extents.createTest("Google site Test and Running ...","Google Site");

		String baseURL = "https://www.seleniumeasy.com/test/";

		drive.get(baseURL);
		test1.info("URL run and up and running");

		drive.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();
		test1.pass("Input button clicked");
		Thread.sleep(2000);

		drive.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Radio Buttons Demo')]")).click();
		drive.findElement(By.xpath("//body/div/div/div/div/div/label[contains(text(),'Female')]/input[1]")).click();
		drive.findElement(By.xpath("//button[@id='buttoncheck']")).click();
		test1.pass("Female selected and TC Passed");
		Thread.sleep(2000);

		drive.findElement(By.xpath("//html//body//div//div//div//div//div//div//label[contains(text(),'Male')]//input")).click();
		drive.findElement(By.xpath("//label[contains(text(),'15 to 50')]")).click();
		drive.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();
		test1.pass("15 to 50 Male age selected");
		Thread.sleep(2000);

		test1.info("Must of Test Cases are done");

		drive.get("http://www.google.com");
		test2.info("Google Site URL fine");
		drive.findElement(By.cssSelector("input[name=q]")).sendKeys("Selenium update");
		test2.pass("Input Text entry done");
		test2.skip("This TC will be Skipped ");
		drive.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		test2.pass("Search Button Clicked ...");
		drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		test2.fail("Just Check Fail Test Case ...");
		test2.info("Test Case execution done...");

		extents.flush();

	}

	@AfterTest
	public void afterMeth() {
		drive.close();
	}

}
