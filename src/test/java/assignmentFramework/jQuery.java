package assignmentFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jQuery {

WebDriver drive = null;
	
	@BeforeMethod
	public void beforeMeth() {

		String projectPath = System.getProperty("user.dir");
		System.out.println("FrameWork Path :"+projectPath);
		System.setProperty("webdriver.gecko.driver","E:\\git\\SeleniumJava\\SeleniumFramework\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		drive = new FirefoxDriver();
		drive.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@Test
	public void SearchBox() throws Exception {
		String baseURL = "https://www.seleniumeasy.com/test/";

		drive.get(baseURL);

		drive.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();

		Thread.sleep(3000);
		
		drive.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'JQuery Select dropdown')]")).click();
		
		drive.findElement(By.xpath("//body/div[@class='container-fluid text-center']/div[@class='row']/div[@class='col-md-6 text-left']/div[1]/div[1]/div[2]/span[1]/span[1]/span[1]")).click();
		drive.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")).sendKeys("Japan");
		drive.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
		Thread.sleep(3000);
		
		drive.close();
	}
	
//	@Test
//	public void multiple() throws InterruptedException {
//		String baseURL = "https://www.seleniumeasy.com/test/";
//
//		drive.get(baseURL);
//
//		drive.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();
//
//		Thread.sleep(3000);
//		
//		drive.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'JQuery Select dropdown')]")).click();
//		
//		drive.findElement(By.xpath("//input[@placeholder='Select state(s)']")).click();
//		
//		WebElement state_dropdown = drive.findElement(By.id("select2-hdcy-results"));
//		Select state_dd = new Select(state_dropdown);
//		
//		state_dd.selectByValue("Ohio");
//		Thread.sleep(2000);
//		state_dd.selectByValue("Florida");
//		Thread.sleep(3000);
//		
////		drive.findElement(By.xpath("//li[@id='select2-hdcy-result-fayf-CA']")).click();
//		Thread.sleep(3000);
////		drive.findElement(By.xpath("//ul[@class='select2-selection__rendered']")).click();
////		drive.findElement(By.xpath("//li[@id='select2-hdcy-result-5lzz-WI']")).clear();
//	
//		drive.close();
//	}
	
	@Test
	public void Category() throws InterruptedException {
		
		String baseURL = "https://www.seleniumeasy.com/test/";

		drive.get(baseURL);

		drive.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();

		Thread.sleep(3000);
		
		drive.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'JQuery Select dropdown')]")).click();
		
		WebElement catagory_dropdown = drive.findElement(By.id("files"));
		Select cat = new Select(catagory_dropdown);

		cat.selectByVisibleText("Java");
		Thread.sleep(2000);
		
		drive.close();
	}
	
	@Test
	public void Search() throws InterruptedException {
		
		String baseURL = "https://www.seleniumeasy.com/test/";

		drive.get(baseURL);

		drive.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();

		Thread.sleep(3000);
		
		drive.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'JQuery Select dropdown')]")).click();
		
		drive.findElement(By.xpath("//div[3]//div[1]//div[2]//span[1]//span[1]//span[1]//span[2]//b[1]")).click();
		drive.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")).sendKeys("Puerto Rico");
		Thread.sleep(3000);
		
		drive.close();
	}
}
