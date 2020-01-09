package testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BrowserStack {

	 public static final String USERNAME = "harmeets1";
	  public static final String AUTOMATE_KEY = "3yUd1qpvi97LmixWUCR4";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("os", "OS X");
	    caps.setCapability("os_version", "High Sierra");
	    caps.setCapability("browser", "Safari");
	    caps.setCapability("browser_version", "11.0");
	    caps.setCapability("browserstack.local", "false");
	    caps.setCapability("browserstack.selenium_version", "3.5.2");

	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	   /* driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());*/
	    
	    String baseURL = "https://www.seleniumeasy.com/test/";

		driver.get(baseURL);

		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Radio Buttons Demo')]")).click();
		driver.findElement(By.xpath("//body/div/div/div/div/div/label[contains(text(),'Female')]/input[1]")).click();
		driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//label[contains(text(),'Male')]//input")).click();
		driver.findElement(By.xpath("//label[contains(text(),'15 to 50')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();
		Thread.sleep(3000);
	    driver.quit();

	  }
}
