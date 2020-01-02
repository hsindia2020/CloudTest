package assignmentFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ajaxForm {

	WebDriver drive = null;

	@BeforeMethod
	public void beforeMeth() {

		String projectPath = System.getProperty("user.dir");
		System.out.println("FrameWork Path :"+projectPath);
		System.setProperty("webdriver.gecko.driver","E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		drive = new FirefoxDriver();

	}

	@Test
	public void formAjax() throws InterruptedException {

		String baseURL = "https://www.seleniumeasy.com/test/";

		drive.get(baseURL);

		drive.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();

		Thread.sleep(3000);

		drive.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Ajax Form Submit')]")).click();
		drive.findElement(By.xpath("//input[@id='title']")).sendKeys("Ajax form Test");
		drive.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Ajax form Description entered");
//		Thread.sleep(3000);

		drive.findElement(By.xpath("//input[@id='btn-submit']")).click();

		drive.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement element = drive.findElement(By.id("submit-control"));
		String ajaxstring = element.getText();
		String ajaxstring1 = "Form submited Successfully!";
		String ajaxstring2 = "Ajax Request is Processing!";
		System.out.println("Ajax text printed on string "+ajaxstring);

		if (ajaxstring == ajaxstring1) {
			System.out.println("Test case Passed");
			Assert.assertTrue(true);
			}
		else if (ajaxstring == ajaxstring2)  {
			System.out.println("Test case Passed");
			Assert.assertTrue(true);
			}
		else {
			System.out.println("Test case Failed");
			Assert.assertTrue(false);
		}
	}

	@AfterTest
	public void afterMeth() {

		drive.close();
	}

}
