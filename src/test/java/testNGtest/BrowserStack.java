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
	    caps.setCapability("os_version", "Sierra");
	    caps.setCapability("browser", "Safari");
	    caps.setCapability("browser_version", "10.0");
	    caps.setCapability("project", "BroswerStack");
	    caps.setCapability("build", "1.1");
	    caps.setCapability("browserstack.local", "false");
	    caps.setCapability("browserstack.selenium_version", "3.5.2");


	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();

	  }
}
