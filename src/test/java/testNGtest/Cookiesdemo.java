package testNGtest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookiesdemo {

	@Test
	void Test01(){
		
//		System.setProperty("webdriver.firefox.driver", "<Path>");
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		
		Set<Cookie> allCookies =  driver.manage().getCookies();
		System.out.println("Count all the Cookies :"+allCookies.size());
		Assert.assertTrue(true);
		
		driver.navigate().refresh();
		
		for(Cookie cookie : allCookies) {
			System.out.println("Name is "+cookie.getName());
			System.out.println("Domain is "+cookie.getDomain());
			System.out.println("Path is "+cookie.getPath());
			System.out.println("Value is "+cookie.getValue());
			System.out.println("Class is "+cookie.getClass());
			System.out.println("================================");
		}
	}
}
